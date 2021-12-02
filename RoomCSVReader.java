import java.util.*;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RoomCSVReader
{
    private String path = "/RoomInfo.csv";
    //Initiate rooms for getRoomList
    private static List<Room> rooms = null;

    public static List<Room> main(String[] args) throws java.io.IOException, java.io.FileNotFoundException {
        List<Room> rooms = null;
        rooms = roomReader("RoomInfo.csv");
        return rooms;
    }

    public static Room getRoom(int RoomID) {
        return rooms.get(RoomID);
    }

    public static String getRoomName(int RoomID) {
        return (rooms.get(RoomID).getRoomName());
    }

    private static List<Room> roomReader(String fileName) {
        List<Room> rooms = new ArrayList<>();
        String line = null;
        Path currentDir = Paths.get(".");
        Path tempPath = currentDir.resolve("RoomInfo.csv");
        Path path = tempPath.getFileName();
        try (BufferedReader br = Files.newBufferedReader(path)) {
            //Do it three times to skip heading rows in CSV file
            line = br.readLine();
            line = br.readLine();
            line = br.readLine();

            //Room Counter to assign each room with right ID
            int roomCounter = 0;

            while (line != null) {
                String[] roomInfo = line.split(",");
                int tempe = Integer.parseInt(roomInfo[2]);

                //Creates each individual room.
                for (int k = 1; k <= tempe; k++) {
                    Room room = createRoom(roomInfo, roomCounter);
                    rooms.add(room);
                    roomCounter++;
                }
                line = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return rooms;
    }

    private static Room createRoom(String[] data, int ID) {
        String roomName = "";
        int priceMonday = 0;
        int priceTuesday = 0;
        int priceWednesday = 0;
        int priceThursday = 0;
        int priceFriday = 0;
        int priceSaturday = 0;
        int priceSunday = 0;
        int maxOccupancy = 0;
        int roomID = 0;

        for(int i = 1; i <= Integer.parseInt(data[2]); i++) {
            roomName = data[1];
            priceMonday = Integer.parseInt(data[5]);
            priceTuesday = Integer.parseInt(data[6]);
            priceWednesday = Integer.parseInt(data[7]);
            priceThursday = Integer.parseInt(data[8]);
            priceFriday = Integer.parseInt(data[9]);
            priceSaturday = Integer.parseInt(data[10]);
            priceSunday = Integer.parseInt(data[11]);
            maxOccupancy = Integer.parseInt(data[4]);
            roomID = ID;
        }
        return new Room(roomName, priceMonday, priceTuesday, priceWednesday, 
            priceThursday, priceFriday, priceSaturday, priceSunday, maxOccupancy, roomID);
    }
}
