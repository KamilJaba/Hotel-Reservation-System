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
    //Initiate rooms for getRoomList
    private static List<Room> rooms = null;

    public static List<Room> main(String[] args) throws java.io.IOException, java.io.FileNotFoundException {
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
        //Initializes Room object list for output
        List<Room> rooms = new ArrayList<>();
        //Paths correctly to make sure the right RoomInfo is used as data to populate the Rooms object for other methods.
        Path currentDir = Paths.get(".");
        Path tempPath = currentDir.resolve("RoomInfo.csv");
        Path path = tempPath.getFileName();
        
        String line = null;
        try (BufferedReader br = Files.newBufferedReader(path)) {
            //Do it three times to skip heading rows in CSV file
            line = br.readLine();
            line = br.readLine();
            line = br.readLine();
            
            
            while (line != null) {
                String[] roomInfo = line.split(",");
                //Reads how much Rooms per room type to populate said amount for Rooms object. Leading to 264 rooms all together.
                int tempe = Integer.parseInt(roomInfo[2]);
                //Creates each individual room.
                for (int k = 1; k <= tempe; k++) {
                    //k is used in createroom to supply room with appropriate room number on the list.
                    Room room = createRoom(roomInfo, k);
                    rooms.add(room);
                }
                line = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return rooms;
    }

    private static Room createRoom(String[] data, int ID) {
        //Initializing
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
        
        //Inputs data from CSV according to the columns layed out in the original csv.
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
