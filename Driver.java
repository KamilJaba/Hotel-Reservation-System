import java.util.*;
import java.io.*;

public class Driver
{
    private int x = 0;
    //private static RoomCSVReader rooms;
    //private static List<Room> RoomList = rooms.getRoomList();

    public static void main(String[] args) throws IOException {
        List<Room> rooms = RoomCSVReader.main(null);

        try {
        Reservation test = new Reservation("skrrr", "01", "12", "2021", "03", "12", "2021", 2, rooms.get(78), "AP");
        Reservation test2 = new Reservation("deeee", "04", "12", "2021", "08", "12", "2021", 2, 3, rooms.get(40), rooms.get(200), "AP");
        }
        catch (Exception e) {
            System.out.println("MASSIVE L NERD ");
        }
        System.out.print("Done");
    }
}
