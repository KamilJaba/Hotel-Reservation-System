import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class BookingWriter
{
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter("RoomBookings.csv")) {
            StringBuilder sb = new StringBuilder();
            //Skip Heading Line
            sb.append('\n');
            //Skip First Row
            sb.append(',');
            
            sb.append("Prashant Ghimire");
            sb.append('\n');

            writer.write(sb.toString());

            System.out.println("done!");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}

