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
                Main.reservationMenu();
                checker1 = -1;
            }
            else if(input.equals("2")) {
                Main.boxBreak();
                System.out.println("Incomplete");
                checker1 = -1;
            }
            else if(input.equals("3")) {
                Main.boxBreak();
                System.exit(0);
                checker1 = -1;
            }
            else {
                System.out.println("Incorrect choice please input 1, 2 or 3");
            }
        }

    }

    public static void reservationMenu() {
        //Initializes values
        String nameInputted = "";
        int peopleInputted = 0;
        String arrDayInputted = "";
        String arrMonthInputted = "";
        String arrYearInputted = "";
        String depDayInputted = "";
        String depMonthInputted = "";
        String depYearInputted = "";
        
        Scanner in = new Scanner(System.in);

        Main.boxStart();

        System.out.println("Reserving room from L4 Hotels!");
        System.out.println("");
        System.out.println("Input Your Name Below");
        System.out.println("");

        Main.boxEnd();
        int checker = 1;
        while(checker >= 0) {
            String input = in.nextLine();            
            Main.boxBreak();
            nameInputted = input;
            checker = -1;            
        }

        Main.boxStart();

        System.out.println("Reserving room from L4 Hotels!");
        System.out.println("");
        System.out.println("Input how many people people you are booking for");
        System.out.println("Min number: 1    Max number: 6");
        System.out.println("");
        System.out.println("Note: For more than 3 people you will be split into two rooms");
        System.out.println("");
        System.out.println("Type Exit to return to main menu");
        System.out.println("");

        checker = 1;
        while(checker >= 0) {
            String input = in.nextLine(); 
            if (input.equals("1") || input.equals("2") || input.equals("3") || input.equals("4") || input.equals("5") || input.equals("6") ) {
                Main.boxBreak();
                peopleInputted = Integer.parseInt(input);
                System.out.println(input + " was inputted");
                checker = -1;    
            }
            else if (input.equals("exit") || input.equals("Exit") || input.equals("EXIT")) {
                Main.boxBreak();
                Main.main(null);
                checker = -1; 
            }
            else {
                System.out.println("Incorrect input please try again");
                //CONTINUES LOOP
            }        
        }

        Main.boxStart();

        System.out.println("Reserving room from L4 Hotels!");
        System.out.println("");
        System.out.println("Input day you want to check in below.");
        System.out.println("Please include the 0 before any single number dates 1-9");
        System.out.println("");
        System.out.println("Example: Input 04 or 25");
        System.out.println("");
        System.out.println("Type Exit to return to main menu");
        System.out.println("");

        Main.boxEnd();
        checker = 1;
        while(checker >= 0) {
            String input = in.nextLine(); 
            if (input.equals("01") || input.equals("02") || input.equals("03") || input.equals("04") || input.equals("05") || input.equals("06") || input.equals("07") 
            || input.equals("08") || input.equals("09") || input.equals("10") || input.equals("11") || input.equals("12") || input.equals("13") 
            || input.equals("14") || input.equals("15") || input.equals("16") || input.equals("17") || input.equals("18") || input.equals("19") 
            || input.equals("20") || input.equals("21") || input.equals("22") || input.equals("23") || input.equals("24") || input.equals("25") 
            || input.equals("26") || input.equals("27") || input.equals("28") || input.equals("29") || input.equals("30") || input.equals("31")) {
                Main.boxBreak();
                arrDayInputted = input;
                System.out.println(input + " was inputted");
                checker = -1;    
            }
            else if (input.equals("exit") || input.equals("Exit") || input.equals("EXIT")) {
                Main.boxBreak();
                Main.main(null);
                checker = -1; 
            }
            else {
                System.out.println("Incorrect input please try again");
                //CONTINUES LOOP
            }        
        }

        Main.boxStart();

        System.out.println("Reserving room from L4 Hotels!");
        System.out.println("");
        System.out.println("Input month you want to check in below.");
        System.out.println("Please include the 0 before any single number dates 1-9");
        System.out.println("");
        System.out.println("Example: Input 04 or 12");
        System.out.println("");
        System.out.println("Type Exit to return to main menu");
        System.out.println("");

        Main.boxEnd();
        checker = 1;
        while(checker >= 0) {
            String input = in.nextLine(); 
            if (input.equals("01") || input.equals("02") || input.equals("03") || input.equals("04") || input.equals("05") || input.equals("06") || input.equals("07") 
            || input.equals("08") || input.equals("09") || input.equals("10") || input.equals("11") || input.equals("12") ) {
                Main.boxBreak();
                arrMonthInputted = input;
                System.out.println(input + " was inputted");
                checker = -1;
            }
            else if (input.equals("exit") || input.equals("Exit") || input.equals("EXIT")) {
                Main.boxBreak();
                Main.main(null);
                checker = -1; 
            }
            else {
                System.out.println("Incorrect input please try again");
                //CONTINUES LOOP
            }        
        }

        Main.boxStart();

        System.out.println("Reserving room from L4 Hotels!");
        System.out.println("");
        System.out.println("Input year you want to check in below.");
        System.out.println("Please include the full year of either 2021/2022");
        System.out.println("");
        System.out.println("Example: Input 2021 or 2022");
        System.out.println("");
        System.out.println("Type Exit to return to main menu");
        System.out.println("");

        Main.boxEnd();

        checker = 1;
        while(checker >= 0) {
            String input = in.nextLine(); 
            if (input.equals("2021") || input.equals ("2022")) {
                Main.boxBreak();
                arrYearInputted = input;
                System.out.println(input + " was inputted");
                checker = -1;    
            }
            else if (input.equals("exit") || input.equals("Exit") || input.equals("EXIT")) {
                Main.boxBreak();
                Main.main(null);
                checker = -1; 
            }
            else {
                System.out.println("Incorrect input please try again");
                //CONTINUES LOOP
            }        
        }

        Main.boxStart();

        System.out.println("Reserving room from L4 Hotels!");
        System.out.println("");
        System.out.println("Input day you want to check out below.");
        System.out.println("Please include the 0 before any single number dates 1-9");
        System.out.println("");
        System.out.println("Example: Input 04 or 25");
        System.out.println("");
        System.out.println("Type Exit to return to main menu");
        System.out.println("");

        Main.boxEnd();

        checker = 1;
        while(checker >= 0) {
            String input = in.nextLine(); 
            if (input.equals("01") || input.equals("02") || input.equals("03") || input.equals("04") || input.equals("05") || input.equals("06") || input.equals("07") 
            || input.equals("08") || input.equals("09") || input.equals("10") || input.equals("11") || input.equals("12") || input.equals("13") 
            || input.equals("14") || input.equals("15") || input.equals("16") || input.equals("17") || input.equals("18") || input.equals("19") 
            || input.equals("20") || input.equals("21") || input.equals("22") || input.equals("23") || input.equals("24") || input.equals("25") 
            || input.equals("26") || input.equals("27") || input.equals("28") || input.equals("29") || input.equals("30") || input.equals("31")) {
                Main.boxBreak();
                depDayInputted = input;
                System.out.println(input + " was inputted");
                checker = -1;    
            }
            else if (input.equals("exit") || input.equals("Exit") || input.equals("EXIT")) {
                Main.boxBreak();
                Main.main(null);
                checker = -1; 
            }
            else {
                System.out.println("Incorrect input please try again");
                //CONTINUES LOOP
            }        
        }

        Main.boxStart();

        System.out.println("Reserving room from L4 Hotels!");
        System.out.println("");
        System.out.println("Input month you want to check out below.");
        System.out.println("Please include the 0 before any single number dates 1-9");
        System.out.println("");
        System.out.println("Example: Input 04 or 12");
        System.out.println("");
        System.out.println("Type Exit to return to main menu");
        System.out.println("");

        Main.boxEnd();
        checker = 1;
        while(checker >= 0) {
            String input = in.nextLine(); 
            if (input.equals("01") || input.equals("02") || input.equals("03") || input.equals("04") || input.equals("05") || input.equals("06") || input.equals("07") 
            || input.equals("08") || input.equals("09") || input.equals("10") || input.equals("11") || input.equals("12") ) {
                Main.boxBreak();
                depMonthInputted = input;
                System.out.println(input + " was inputted");
                checker = -1;
            }
            else if (input.equals("exit") || input.equals("Exit") || input.equals("EXIT")) {
                Main.boxBreak();
                Main.main(null);
                checker = -1; 
            }
            else {
                System.out.println("Incorrect input please try again");
                //CONTINUES LOOP
            }        
        }

        Main.boxStart();

        System.out.println("Reserving room from L4 Hotels!");
        System.out.println("");
        System.out.println("Input year you want to check out below.");
        System.out.println("Please include the full year of either 2021/2022");
        System.out.println("");
        System.out.println("Example: Input 2021 or 2022");
        System.out.println("");
        System.out.println("Type Exit to return to main menu");
        System.out.println("");

        Main.boxEnd();

        checker = 1;
        while(checker >= 0) {
            String input = in.nextLine(); 
            if (input.equals("2021") || input.equals ("2022")) {
                Main.boxBreak();
                depYearInputted = input;
                System.out.println(input + " was inputted");
                checker = -1;    
            }
            else if (input.equals("exit") || input.equals("Exit") || input.equals("EXIT")) {
                Main.boxBreak();
                Main.main(null);
                checker = -1; 
            }
            else {
                System.out.println("Incorrect input please try again");
                //CONTINUES LOOP
            }
        }

        if (peopleInputted <= 3) {
            Main.boxBreak();
            Main.singleRoomBooking(nameInputted, peopleInputted, arrDayInputted, arrMonthInputted, arrYearInputted, depDayInputted, depMonthInputted, depYearInputted);
        }
        else if (peopleInputted > 3) {
            
        }
        else {
            System.out.println("People Inputted was incorrectly entered");
            Main.main(null);
        }
    }
    
    public static void singleRoomBooking(String nameInputted, int peopleInputted, String arrDayInputted, String arrMonthInputted, String arrYearInputted, String depDayInputted, String depMonthInputted, String depYearInputted) {
        String tempnameInputted = nameInputted;
        int temppeopleInputted = peopleInputted;
        String temparrDayInputted = arrDayInputted;
        String temparrMonthInputted = arrMonthInputted;
        String temparrYearInputted = arrYearInputted;
        String tempdepDayInputted = depDayInputted;
        String tempdepMonthInputted = depMonthInputted;
        String tempdepYearInputted = depYearInputted;
        
        List<Room> rooms = null;
        try
        {
            //Initializes room data
        rooms = RoomCSVReader.main(null);
        }
        catch (IOException ioe)
        {
            System.out.println("RoomInfo file not found");
        }
        
        Main.boxStart();
        Room room1 = rooms.get(4);
        Room room2 = rooms.get(36);
        Room room3 = rooms.get(61);
        Room room4 = rooms.get(71);
        Room room5 = rooms.get(81);
        Room room6 = rooms.get(121);
        Room room7 = rooms.get(153);
        Room room8 = rooms.get(165);
        Room room9 = rooms.get(210);
        Room room10 = rooms.get(221);

        System.out.println("Reserving room from L4 Hotels!");
        System.out.println("");
        System.out.println("Select Room to rent below.");
        System.out.println("");
        System.out.println("1. " + room1.toString() + ", RoomIDs: 0-34");
        System.out.println("2. " + room2.toString() + ", RoomIDs: 35-59");
        System.out.println("3. " + room3.toString() + ", RoomIDs: 60-69");
        System.out.println("4. " + room4.toString() + ", RoomIDs: 70-79");
        System.out.println("5. " + room5.toString() + ", RoomIDs: 80-119");
        System.out.println("6. " + room6.toString() + ", RoomIDs: 120-151");
        System.out.println("7. " + room7.toString() + ", RoomIDs: 152-163");
        System.out.println("8. " + room8.toString() + ", RoomIDs: 164-208");
        System.out.println("9. " + room9.toString() + ", RoomIDs: 209-253");
        System.out.println("10. " + room10.toString() + ", RoomIDs: 254-263");
        System.out.println("");
        System.out.println("Example: Input 1 or 8");
        System.out.println("");
        System.out.println("Type Exit to return to main menu");
        System.out.println("");

        Main.boxEnd();
    }
    
    public static void roomAvailabilityMenu() {
        Scanner in = new Scanner(System.in);

        Main.boxStart();

        System.out.println("L4 Room Availability Menu!");
        System.out.println("");
        System.out.println("Choose one of the options below");
        System.out.println("");

        Main.boxEnd();
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
