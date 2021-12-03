import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class leoncsv {
    public static boolean checkAvailability(String[][] data, String indate, String outdate,String roomid) throws ParseException {
        int row = 265, col = 93, start = 0, end = 0, id = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("d.M.yy");
        Calendar c = Calendar.getInstance();
        for (int i = 0; i < col; i++) {
            if (data[0][i].equals(indate)) {
                start = i;
                for (int y = start; y < col; y++) {
                    if (indate.equals(outdate)) {
                        end = y;
                        break;
                    }
                    c.setTime(sdf.parse(indate));
                    c.add(Calendar.DATE, 1);
                    indate = sdf.format(c.getTime());
                }
                break;
            }
        }
        for (int j = 0; j < row; j++) {
            if (data[j][0].equals(roomid)) {
                id = j;
                break;
            }
        }
        int total = (end - start) + 1, count = 0;
        for (int o = start; o <= end; o++) {
            if (data[id][o].equals("Booked")) {
                count++;
            }
        }
        return (total == count);
    }

    public static void booking(File file) throws IOException, ParseException {
        Scanner scan;
        int row = 265, col = 93;
        String[][] data = new String[row][col];
        String[] line = new String[row];
        for (int y = 0; y < row; y++) {
            line[y] = "";
            for (int h = 0; h < col; h++) {
                data[y][h] = "";
            }
        }
        String l;
        scan = new Scanner(file);
        scan.useDelimiter("[,\n]");
        BufferedReader br = new BufferedReader(new FileReader(file));
        System.out.println("Reading data from file");
        for (int y = 0; y < row; y++) {
            l = br.readLine();
            String[] word = l.split(",");
            for (int h = 0; h < col; h++) {
                data[y][h] = word[h];
            }

        }

        int start = 0, end = 0, id = 0, exit = 0;
        String roomid;
        String indate;
        String outdate;
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("d.M.yy");
        Calendar c = Calendar.getInstance();
        FileWriter fw = new FileWriter(file);
        while (exit == 0) {
            System.out.println("Press 0 to book a room, Press 1 to check availability or Press 2 to exit");
            exit = input.nextInt();
            if (exit > 1) {
                break;
            }
            switch (exit) {
                case 0: {
                    System.out.println("Enter RoomID, Check in date (dd.MM.yyyy) and check out date (dd.MM.yyyy)");

                    roomid = input.next();
                    indate = input.next();
                    outdate = input.next();
                    for (int i = 0; i < col; i++) {
                        if (data[0][i].equals(indate)) {
                            start = i;
                            for (int y = start; y < col; y++) {
                                if (indate.equals(outdate)) {
                                    end = y;
                                    break;
                                }
                                c.setTime(sdf.parse(indate));
                                c.add(Calendar.DATE, 1);
                                indate = sdf.format(c.getTime());
                            }
                            break;
                        }
                    }
                    for (int j = 0; j < row; j++) {
                        if (data[j][0].equals(roomid)) {
                            id = j;
                            break;
                        }
                    }
                    for (int o = start; o < end; o++) {
                        data[id][o] = "Booked";
                    }
                    break;
                }
                case 1: {
                    System.out.println("Enter Roomid , Checkin date and Checkout date -- date format must be dd.MM.yyyy");

                    roomid = input.next();
                    indate = input.next();
                    outdate = input.next();
                    if(checkAvailability(data,indate,outdate,roomid))
                    {
                        System.out.println("Room available");
                    }
                    else
                    {
                        System.out.println("Room not available");
                    }
                    break;
                }
            }
        }
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                line[i] += data[i][j];
                if (j < col - 1) {
                    line[i] += ",";
                }
            }
        }
        System.out.println("Updating file and adding changes");
        for (int i = 0; i < row; i++) {
            pw.println(line[i]);
        }
        pw.flush();
        pw.close();
    }

    public static void main(String[] args) {
        File file = new File("");

        try {
            booking(file);
        } catch (IOException ex) {
            Logger.getLogger(leoncsv.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(leoncsv.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
