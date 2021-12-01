import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Main.boxStart();

        System.out.println("Welcome to L4 Hotels Reservation Menu!");
        System.out.println("");
        System.out.println("Choose one of the options below");
        System.out.println("");
        System.out.println("1. Make a Reservation");
        System.out.println("2. Check Room Availability");
        System.out.println("3. Exit Program");

        Main.boxEnd();
        int checker1 = 1;
        while(checker1 >= 0) {
            String input = in.nextLine();
            if(input.equals("1")) {
                Main.boxBreak();
                System.out.println("nice");
                checker1 = -1;
            }
            else if(input.equals("2")) {
                Main.boxBreak();
                System.out.println("nice");
                checker1 = -1;
            }
            else if(input.equals("3")) {
                Main.boxBreak();
                System.out.println("nice");
                checker1 = -1;
            }
            else {
                System.out.println("Incorrect choice please input 1, 2 or 3");
            }
        }

    }
    
    public static void reservationMenu() {
        Scanner in = new Scanner(System.in);

        Main.boxStart();
        
        
    }
    
    public static void roomAvailabilityMenu() {
        Scanner in = new Scanner(System.in);

        Main.boxStart();
        
        
    }

    public static void boxStart() {
        System.out.println("-------------------------------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("\t");
    }

    public static void boxEnd() {
        System.out.println("\t");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("-------------------------------------------");
    }
    
    public static void boxBreak() {
        for (int i = 0; i <= 50; i++) {
            System.out.println("");
        }
    }
}
