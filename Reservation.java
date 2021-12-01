import java.util.*;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.lang.Object;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Reservation {
    //Initializes variables for Object Reservation
    private UUID reservID = null;
    private String arrival = null;
    private String arrivalday = null;
    private String arrivalmonth = null;
    private String arrivalyear = null;
    private String departure = null;
    private String departureday = null;
    private String departuremonth = null;
    private String departureyear = null;
    private String room1Name = null;
    private String room2Name = null;
    private String name = null;
    private int rooms = 0;
    private Room room1Info = null;
    private Room room2Info = null;
    private int people = 0;
    private int people2 = 0;
    private double roomCost = 0;
    private int room1Cost = 0;
    private int room2Cost = 0;
    private String bookingType = null;

    public Reservation(String Name, String arrivalday, String arrivalmonth, String arrivalyear, String departureday, String departuremonth, String departureyear, int people, Room room, String bookingType) throws java.text.ParseException, java.io.IOException {
        //Inputs data into Reservation Object
        this.arrivalday = arrivalday;
        this.arrivalmonth = arrivalmonth;
        this.arrivalyear = arrivalyear;
        this.arrival = arrivalday + "." + arrivalmonth + "." + arrivalyear;
        this.departureday = departureday;
        this.departuremonth = arrivalmonth;
        this.departureyear = departureyear;
        this.departure = departureday + "." + departuremonth + "." + departureyear;
        this.people = people;
        this.room1Info = room;
        this.name = Name;
        this.rooms = 1;
        this.room1Name = room.getRoomName();
        //UUID to get a practically always UNIQUE id for data storage
        UUID tempID = UUID.randomUUID();
        this.reservID = tempID;
        this.bookingType = bookingType;
        //Gets total cost of Reservation for a 1 room booking.
        this.roomCost = Reservation.getTotalCost(arrivalday, arrivalmonth, arrivalyear, departureday, departuremonth, departureyear, room, bookingType);
        
        ReservationWriter.main(this.reservID , this.name, this.arrival, this.departure, this.rooms, this.room1Name, this.people, this.roomCost, this.bookingType);
    }

    public Reservation(String Name, String arrivalday, String arrivalmonth, String arrivalyear, String departureday, String departuremonth, String departureyear, int people, int people2, Room room, Room room2, String bookingType) throws java.text.ParseException, java.io.IOException {
        //Inputs data into Reservation Object
        this.arrivalday = arrivalday;
        this.arrivalmonth = arrivalmonth;
        this.arrivalyear = arrivalyear;
        this.arrival = arrivalday + "." + arrivalmonth + "." + arrivalyear;
        this.departureday = departureday;
        this.departuremonth = arrivalmonth;
        this.departureyear = departureyear;
        this.departure = departureday + "." + departuremonth + "." + departureyear;
        this.people = people;
        this.people2 = people2;
        this.room1Info = room;
        this.room2Info = room2;
        this.name = Name;
        this.rooms = 2;
        this.room1Name = room.getRoomName();
        this.room2Name = room2.getRoomName();
        //UUID to get a practically always UNIQUE id for data storage
        UUID tempID = UUID.randomUUID();
        this.reservID = tempID;
        this.bookingType = bookingType;
        //Gets total cost of Reservation for a 2 room booking.
        this.roomCost = Reservation.getTotalCost(arrivalday, arrivalmonth, arrivalyear, departureday, departuremonth, departureyear, room, room2, bookingType);

        ReservationWriter.main(this.reservID , this.name, this.arrival, this.departure, this.rooms, this.room1Name, this.people, this.room2Name, this.people2, this.roomCost, this.bookingType);
    }

    public static double getTotalCost(String arrivalday, String arrivalmonth, String arrivalyear, String departureday, String departuremonth, String departureyear, Room room, String bookingType) {
        //Strings together inputted String parts of date for a usable format for later methods.
        String temparrival = arrivalyear + "-" + arrivalmonth + "-" + arrivalday;
        String tempdeparture = departureyear + "-" + departuremonth + "-" + departureday;

        //Parses the string of arrival and departure into LocalDate for use later.
        LocalDate localarrival = LocalDate.parse(temparrival); //TEMP
        LocalDate localdeparture = LocalDate.parse(tempdeparture); //TEMP

        //Calcs days between using ChronoUnits imported above
        long daysBetween = ChronoUnit.DAYS.between(localarrival, localdeparture);
        
        //Initializes tempcosts to use below
        double tempcost = 0;
        
        //Iterates for how many days are between arrival and departure to calculate price
        for (long i = 0; i <= daysBetween; i++) {
            String tempDay = (localarrival.getDayOfWeek()).toString();
            tempcost = tempcost + room.getPrice(tempDay);
            localarrival = localarrival.plusDays(1);
        }

        //If booking type is AP, lower over all TOTAL cost by 5%
        if (bookingType == "AP") {
            tempcost = (tempcost*0.95);
        }

        return tempcost;
    }

    public static double getTotalCost(String arrivalday, String arrivalmonth, String arrivalyear, String departureday, String departuremonth, String departureyear, Room room, Room room2, String bookingType) {
        
        //Strings together inputted String parts of date for a usable format for later methods.
        String temparrival = arrivalyear + "-" + arrivalmonth + "-" + arrivalday;
        String tempdeparture = departureyear + "-" + departuremonth + "-" + departureday;

        //Parses the string of arrival and departure into LocalDate for use later.
        LocalDate localarrival = LocalDate.parse(temparrival); //TEMP
        LocalDate localdeparture = LocalDate.parse(tempdeparture); //TEMP

        //Calcs days between using ChronoUnits imported above
        long daysBetween = ChronoUnit.DAYS.between(localarrival, localdeparture);
        
        //Initializes tempcosts to use below
        double tempcost1 = 0;
        double tempcost2 = 0;
        
        //Iterates for how many days are between arrival and departure to calculate price
        for (long i = 0; i <= daysBetween; i++) {
            //Strings the days starting from arrival into its "MONDAY" equivalent to use room.getprice
            String tempDay = (localarrival.getDayOfWeek()).toString();
            tempcost1 = tempcost1 + room.getPrice(tempDay);
            tempcost2 = tempcost2 + room2.getPrice(tempDay);
            localarrival = localarrival.plusDays(1);
        }

        //Adds the cost for both rooms
        double tempcost = tempcost1 + tempcost2;
        
        //If booking type is AP, lower over all TOTAL cost by 5%
        if (bookingType == "AP") {
            tempcost = (tempcost*0.95);
        }

        return tempcost;
    }

    public double getReservationCost() {
        return this.roomCost;
    }

    public String getArrivalDate() {
        return this.arrival;
    }

    public String getDepartureDate() {
        return this.departure;
    }

    public String getName() {
        return this.name;
    }

    public int getPeople() {
        return this.people;
    }

    public UUID getreservID() {
        return this.reservID;
    }

    public void showReservation() {
        System.out.println("Reservation: " + this.getreservID());
        System.out.println("Name: " + this.getName());
        System.out.println("Arrival: " + this.getArrivalDate());
        System.out.println("Departure: " + this.getDepartureDate());
        System.out.println("No. People: " + this.getPeople());
        //System.out.println("Room Type:" + rooms.getClass().getName());
    }
}