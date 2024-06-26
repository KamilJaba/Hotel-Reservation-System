import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.FileWriter;

/** Class to write to the CSV to store reservations data.
 * @author Kamil Jablonski
 * @author 20278837
 */
public class ReservationWriter
{
    //Initialize counter for later
    static int counter = 0;
    
    /** Writes the reservation to the CSV with inputted data for a single room reservation.
     * @author Kamil Jablonski
     * @author 20278837
     */
    public static void main(UUID ReservID, String Name, String Arrival, String Departure, int Rooms, String RoomName, int People, double Cost, String bookingType) throws java.io.IOException {
        
        try (FileWriter writer = new FileWriter("Reservations.csv", true)) {
            Path currentDir = Paths.get(".");
            Path tempPath = currentDir.resolve("Reservations.csv");
            Path path = tempPath.getFileName();
            List<String> lines = Files.readAllLines(path);

            //for (String line : lines) {
                //if (!"".equals(line)) {
                    //continue;
                //}
                //else {
                    //Counts how much lines are already used in reservations
                    //counter = counter++;
                //}
            //}

            StringBuilder sb = new StringBuilder();
            //Skips previous reservations
            //for (int i = 0; i <= counter; i++) {
                //sb.append('\n');
            //}
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
            //Skips Room 2 Columns to Deliver Cost
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
    
    /** Overloaded method writes the reservation to the CSV with inputted data for a double room reservation.
     * @author Kamil Jablonski
     * @author 20278837
     */
    public static void main(UUID ReservID, String Name, String Arrival, String Departure, int Rooms, String RoomName, int People, String Room2Name, int People2, double Cost, String bookingType) throws java.io.IOException {
        
        try (FileWriter writer = new FileWriter("Reservations.csv", true)) {
            Path currentDir = Paths.get(".");
            Path tempPath = currentDir.resolve("Reservations.csv");
            Path path = tempPath.getFileName();
            List<String> lines = Files.readAllLines(path);

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
