import java.util.*;
import java.io.*;
import java.time.*;
import java.text.*;
import java.io.IOException;

/** Main executable class to bring up the reservation interface.
 * @author Kamil Jablonski
 * @author 20278837
 */
public class Main
{   
    /** Main menu interface startup.
     * @author Kamil Jablonski
     * @author 20278837
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Main.boxStart();

        System.out.println("Welcome to L4 Hotels Reservation Menu!");
        System.out.println("");
        System.out.println("Choose one of the options below");
        System.out.println("");
        System.out.println("1. Make a Reservation");
        System.out.println("2. Exit Program");

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
                System.exit(0);
                checker1 = -1;
            }
            else {
                System.out.println("Incorrect choice please input 1, 2 or 3");
            }
        }

    }

    /** Reservation menu interface startup.
     * @author Kamil Jablonski
     * @author 20278837
     */
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
        String purchaseType= "";

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

        Main.boxEnd();

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
        System.out.println("Would you like to make a Standard(S) or Advanced Purchase(AP)");
        System.out.println("");
        System.out.println("Standard reservations can be cancelled up to 48 hours before check-in.");
        System.out.println("Advanced Purchase reservations cannot be cancelled but are 5% discounted in turn.");
        System.out.println("");
        System.out.println("Please input 'S' or 'AP' to make your choice.");
        System.out.println("");
        System.out.println("Type Exit to return to main menu");
        System.out.println("");

        Main.boxEnd();

        checker = 1;
        while(checker >= 0) {
            String input = in.nextLine(); 
            if (input.equals("S") || input.equals("s") || input.equals("3") || input.equals("4") || input.equals("5") || input.equals("6") ) {
                Main.boxBreak();
                purchaseType = input;
                System.out.println(input + " was inputted");
                checker = -1;    
            }
            else if (input.equals("AP") || input.equals("ap") || input.equals("Ap")) {
                Main.boxBreak();
                purchaseType = input;
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
            Main.singleRoomBooking(nameInputted, peopleInputted, arrDayInputted, arrMonthInputted, arrYearInputted, depDayInputted, depMonthInputted, depYearInputted, purchaseType);
        }
        else if (peopleInputted > 3) {

        }
        else {
            System.out.println("People Inputted was incorrectly entered");
            Main.main(null);
        }
    }

    /** Single room booking interface. (Uses inputted data from the reservation menu)
     * @author Kamil Jablonski
     * @author 20278837
     */
    public static void singleRoomBooking(String nameInputted, int peopleInputted, String arrDayInputted, String arrMonthInputted, String arrYearInputted, String depDayInputted, String depMonthInputted, String depYearInputted, String purchaseType) {
        String tempnameInputted = nameInputted;
        int temppeopleInputted = peopleInputted;
        String temparrDayInputted = arrDayInputted;
        String temparrMonthInputted = arrMonthInputted;
        String temparrYearInputted = arrYearInputted;
        String tempdepDayInputted = depDayInputted;
        String tempdepMonthInputted = depMonthInputted;
        String tempdepYearInputted = depYearInputted;
        String temppurchaseTypeInputted = purchaseType;

        //LocalDate Conversion for later
        String temparrival = temparrYearInputted + "-" + temparrMonthInputted + "-" + temparrDayInputted;
        String tempdeparture = tempdepYearInputted + "-" + tempdepMonthInputted + "-" + tempdepDayInputted;

        Scanner in = new Scanner(System.in);
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
        System.out.println("Example: Input 1 or 241");
        System.out.println("");
        System.out.println("Type Exit to return to main menu");
        System.out.println("");

        Main.boxEnd();

        //Turns time inputted into localdate for use in methods.
        LocalDate localarrival = LocalDate.parse(temparrival);
        LocalDate localdeparture = LocalDate.parse(tempdeparture);

        int checker= 1;
        while(checker >= 0) {
            int input = in.nextInt();
            //Used to be able to Exit instead
            String inputToString =  String.valueOf(input);
            if (input >= 0 && input <= 263) {
                inputToString =  Integer.toString(input);
                Main.boxBreak();
                boolean codeBypass = false;
                //Leons command to check room booking.
                //if ((Leon.isItBooked(localarrival, localdeparture, input) = true) {
                if (codeBypass = true) {    
                    System.out.println("We have no rooms of this type available for the selected dates");
                    System.out.println("Would You like to choose another? Y or N?");
                    String answer = in.nextLine();
                    checker = 1;

                    while(checker >= 0) {
                        if (answer.equals("Y")) {
                            Main.boxBreak();
                            Main.singleRoomBooking(nameInputted, peopleInputted, arrDayInputted, arrMonthInputted, arrYearInputted, depDayInputted, depMonthInputted, depYearInputted, temppurchaseTypeInputted);
                            checker = -1;
                        }
                        else if (answer.equals("N")) {
                            Main.boxBreak();
                            Main.main(null);
                            checker = -1; 
                        }
                        else {
                            System.out.println("Incorrect input please try again");
                            //CONTINUES LOOP
                        }        
                    }
                }
                else {
                    double tempPrice = Reservation.getTotalCost(arrDayInputted, arrMonthInputted, arrYearInputted, depDayInputted, depMonthInputted, depYearInputted, rooms.get(input), temppurchaseTypeInputted);
                    Main.boxBreak();
                    Main.boxStart();

                    System.out.println("The total price of the reservation is €" + tempPrice);
                    System.out.println("");
                    System.out.println("Do you want to confirm the booking? Y or N");
                    System.out.println("");

                    Main.boxEnd();

                    checker = 1;
                    String answer3 = in.nextLine();
                    while(checker >= 0)
                        if (answer3.equals("Y")) {
                            try {
                                try {
                                    Reservation temp = new Reservation(nameInputted, arrDayInputted, arrMonthInputted, arrYearInputted, depDayInputted, depMonthInputted, depYearInputted, peopleInputted, rooms.get(input), temppurchaseTypeInputted);
                                } catch (ParseException e) {
                                    e.printStackTrace();
                                }
                            } catch(IOException ioException)
                            {
                                throw new RuntimeException("IO Exception in CommandLine Application",ioException);
                            }
                            //Temp code to mark the room as booked
                            //Leon.markBooked(localarrival, localdeparture, input);
                            checker = 1;
                            String answer4 = in.nextLine();
                            Main.boxBreak();
                            Main.boxStart();

                            System.out.println("Booking Successful!");
                            System.out.println("");
                            System.out.println("Type 'exit' to return to main menu");
                            System.out.println("");

                            Main.boxEnd();
                            while(checker >= 0)
                                if (answer4.equals("exit") || answer4.equals("Exit") || answer4.equals("EXIT")) {
                                    Main.boxBreak();
                                    Main.main(null);
                                    checker = -1; 
                                }
                                else {
                                    System.out.println("Incorrect input please try again");
                                    //CONTINUES LOOP
                                }
                        }

                        else if (answer3.equals("N")) {
                            Main.boxBreak();
                            Main.main(null);
                            checker = -1;
                        }
                        else {
                            System.out.println("Incorrect input please try again");
                            //CONTINUES LOOP
                        }
                }

                System.out.println(input + " was inputted");
                checker = -1;    
            }
            else if (inputToString.equals("exit") || inputToString.equals("Exit") || inputToString.equals("EXIT")) {
                Main.boxBreak();
                Main.main(null);
                checker = -1; 
            }
            else {
                System.out.println("Incorrect input please try again");
                //CONTINUES LOOP
            }
        }
    }

    /** Double room booking interface. (Uses inputted data from the reservation menu)
     * @author Kamil Jablonski
     * @author 20278837
     */
    public static void doubleRoomBooking(String nameInputted, int peopleInputted, String arrDayInputted, String arrMonthInputted, String arrYearInputted, String depDayInputted, String depMonthInputted, String depYearInputted, String purchaseType) {
        String tempnameInputted = nameInputted;
        int temppeopleInputted = peopleInputted;
        String temparrDayInputted = arrDayInputted;
        String temparrMonthInputted = arrMonthInputted;
        String temparrYearInputted = arrYearInputted;
        String tempdepDayInputted = depDayInputted;
        String tempdepMonthInputted = depMonthInputted;
        String tempdepYearInputted = depYearInputted;
        String temppurchaseTypeInputted = purchaseType;

        //LocalDate Conversion for later
        String temparrival = temparrYearInputted + "-" + temparrMonthInputted + "-" + temparrDayInputted;
        String tempdeparture = tempdepYearInputted + "-" + tempdepMonthInputted + "-" + tempdepDayInputted;

        Scanner in = new Scanner(System.in);
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
        System.out.println("Select the first Room to rent below.");
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
        System.out.println("Example: Input 1 or 241");
        System.out.println("");
        System.out.println("Type Exit to return to main menu");
        System.out.println("");

        Main.boxEnd();

        //Turns time inputted into localdate for use in methods.
        LocalDate localarrival = LocalDate.parse(temparrival);
        LocalDate localdeparture = LocalDate.parse(tempdeparture);

        int checker= 1;
        while(checker >= 0) {
            int input = in.nextInt();
            //Used to be able to Exit instead
            String inputToString =  String.valueOf(input);
            if (input >= 0 && input <= 263) {
                inputToString =  Integer.toString(input);
                Main.boxBreak();
                boolean codeBypass = false;
                //Leons command to check room booking.
                //if ((Leon.isItBooked(localarrival, localdeparture, input) = true) {
                if (codeBypass = true) {    
                    System.out.println("We have no rooms of this type available for the selected dates");
                    System.out.println("Would You like to choose another? Y or N?");
                    String answer = in.nextLine();
                    checker = 1;

                    while(checker >= 0) {
                        if (answer.equals("Y")) {
                            Main.boxBreak();
                            Main.doubleRoomBooking(nameInputted, peopleInputted, arrDayInputted, arrMonthInputted, arrYearInputted, depDayInputted, depMonthInputted, depYearInputted, temppurchaseTypeInputted);
                            checker = -1;
                        }
                        else if (answer.equals("N")) {
                            Main.boxBreak();
                            Main.main(null);
                            checker = -1; 
                        }
                        else {
                            System.out.println("Incorrect input please try again");
                            //CONTINUES LOOP
                        }        
                    }
                }
                else {

                    System.out.println("");
                    System.out.println("Select the second Room to rent below.");
                    System.out.println("");
                    checker= 1;
                    while(checker >= 0) {
                        int input2 = in.nextInt();;
                        String input2ToString = String.valueOf(input2);
                        if (input2 >= 0 && input2 <= 263) {
                            //if ((Leon.isItBooked(localarrival, localdeparture, input2) = true) {
                            System.out.println("We have no rooms of this type available for the selected dates");
                            System.out.println("Would You like to choose another? Y or N?");
                            String answer = in.nextLine();
                            checker = 1;

                            while(checker >= 0) {
                                if (answer.equals("Y")) {
                                    Main.boxBreak();
                                    Main.doubleRoomBooking(nameInputted, peopleInputted, arrDayInputted, arrMonthInputted, arrYearInputted, depDayInputted, depMonthInputted, depYearInputted, temppurchaseTypeInputted);
                                    checker = -1;
                                }
                                else if (answer.equals("N")) {
                                    Main.boxBreak();
                                    Main.main(null);
                                    checker = -1; 
                                }
                                else {
                                    System.out.println("Incorrect input please try again");
                                    //CONTINUES LOOP
                                }        
                            }
                        } 
                        else {    

                            double tempPrice1 = Reservation.getTotalCost(arrDayInputted, arrMonthInputted, arrYearInputted, depDayInputted, depMonthInputted, depYearInputted, rooms.get(input), temppurchaseTypeInputted);
                            double tempPrice2 = Reservation.getTotalCost(arrDayInputted, arrMonthInputted, arrYearInputted, depDayInputted, depMonthInputted, depYearInputted, rooms.get(input2), temppurchaseTypeInputted);
                            double tempprice = tempPrice1 + tempPrice2;
                            Main.boxBreak();
                            Main.boxStart();

                            System.out.println("The total price of the reservation is €" + tempprice);
                            System.out.println("");
                            System.out.println("Do you want to confirm the booking? Y or N");
                            System.out.println("");

                            Main.boxEnd();

                            checker = 1;
                            String answer3 = in.nextLine();
                            while(checker >= 0)
                                if (answer3.equals("Y")) {
                                    try {
                                        try {
                                            Reservation temp = new Reservation(nameInputted, arrDayInputted, arrMonthInputted, arrYearInputted, depDayInputted, depMonthInputted, depYearInputted, peopleInputted, 5, rooms.get(input), rooms.get(input2), temppurchaseTypeInputted);
                                        } catch (ParseException e) {
                                            e.printStackTrace();
                                        }
                                    } catch(IOException ioException)
                                    {
                                        throw new RuntimeException("IO Exception in CommandLine Application",ioException);
                                    }
                                    //Leon.markBooking(localarrival, localdeparture, input);
                                    //Leon.markBooking(localarrival, localdeparture, input2);
                                    checker = 1;
                                    Main.boxBreak();
                                    Main.boxStart();

                                    System.out.println("Booking Successful!");
                                    System.out.println("");
                                    System.out.println("Type 'exit' to return to main menu");
                                    System.out.println("");

                                    String answer4 = in.nextLine();
                                    Main.boxEnd();
                                    while(checker >= 0)
                                        if (answer4.equals("exit") || answer4.equals("Exit") || answer4.equals("EXIT")) {
                                            Main.boxBreak();
                                            Main.main(null);
                                            checker = -1; 
                                        }
                                        else {
                                            System.out.println("Incorrect input please try again");
                                            //CONTINUES LOOP
                                        }
                                }

                                else if (answer3.equals("N")) {
                                    Main.boxBreak();
                                    Main.main(null);
                                    checker = -1;
                                }
                                else {
                                    System.out.println("Incorrect input please try again");
                                    //CONTINUES LOOP
                                }
                        }

                    }
                }
                System.out.println(input + " was inputted");
                checker = -1;    
            }

            else if (inputToString.equals("exit") || inputToString.equals("Exit") || inputToString.equals("EXIT")) {
                Main.boxBreak();
                Main.main(null);
                checker = -1; 
            }
            else {
                System.out.println("Incorrect input please try again");
                //CONTINUES LOOP
            }
        }   
    }

    /** Interface formatting support for the beginning of a menu screen.
     * @author Kamil Jablonski
     * @author 20278837
     */
    public static void boxStart() {
        System.out.println("-------------------------------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("\t");
    }

    /** Interface formatting support for the end of a menu screen.
     * @author Kamil Jablonski
     * @author 20278837
     */
    public static void boxEnd() {
        System.out.println("\t");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("-------------------------------------------");
    }

    /** Interface formatting support for creating space in between menus.
     * @author Kamil Jablonski
     * @author 20278837
     */
    public static void boxBreak() {
        for (int i = 0; i <= 50; i++) {
            System.out.println("");
        }
    }
}
