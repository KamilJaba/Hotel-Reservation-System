import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.FileWriter;

public class ReservationWriter
{
    public static void main(UUID ReservID, String Name, String Arrival, String Departure, int Rooms, String RoomName, int People, double Cost, String bookingType) throws java.io.IOException {
        //True in FileWriter allows it to append to the csv instead of starting from the start, it starts from the first unused row.
        try (FileWriter writer = new FileWriter("Reservations.csv", true)) {
            //Gets correct path for Reservations.csv
            Path currentDir = Paths.get(".");
            Path tempPath = currentDir.resolve("Reservations.csv");
            Path path = tempPath.getFileName();
            
            //String builder to create row for CSV writing
            StringBuilder sb = new StringBuilder();
 
            sb.append('\n');
            sb.append (ReservID);
            sb.append(',');
            sb.append (Name);
            sb.append(',');
            sb.append (Arrival);
            sb.append(',');
            sb.append (Departure);
            sb.append(',');
            sb.append (Rooms);
            sb.append(',');
            sb.append (RoomName);
            sb.append(',');
            sb.append (People);
            sb.append(',');
            //Skips Room 2 Columns as this method is the 1 Room Method
            sb.append(',');
            sb.append(',');
            sb.append (Cost);
            sb.append(',');
            sb.append(bookingType);

            writer.write(sb.toString());

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(UUID ReservID, String Name, String Arrival, String Departure, int Rooms, String RoomName, int People, String Room2Name, int People2, double Cost, String bookingType) throws java.io.IOException {

        try (FileWriter writer = new FileWriter("Reservations.csv", true)) {
            Path currentDir = Paths.get(".");
            Path tempPath = currentDir.resolve("Reservations.csv");
            Path path = tempPath.getFileName();

            StringBuilder sb = new StringBuilder();

            sb.append('\n');
            sb.append (ReservID);
            sb.append(',');
            sb.append (Name);
            sb.append(',');
            sb.append (Arrival);
            sb.append(',');
            sb.append (Departure);
            sb.append(',');
            sb.append (Rooms);
            sb.append(',');
            sb.append (RoomName);
            sb.append(',');
            sb.append (People);
            sb.append(',');
            sb.append (Room2Name);
            sb.append(',');
            sb.append (People2);
            sb.append(',');
            sb.append (Cost);
            sb.append(',');
            sb.append(bookingType);

            writer.write(sb.toString());

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
