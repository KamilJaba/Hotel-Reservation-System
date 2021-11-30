import java.util.*;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.time.Instant;
import java.lang.Object;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Reservation {
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
    private int roomCost = 0;
    private int room1Cost = 0;
    private int room2Cost = 0;

    public Reservation(String Name, String arrivalday, String arrivalmonth, String arrivalyear, String departureday, String departuremonth, String departureyear, int people, Room room) throws java.text.ParseException, java.io.IOException {
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
        UUID tempID = UUID.randomUUID();
        this.reservID = tempID;
        
        this.roomCost = Reservation.getTotalCost(arrivalday, arrivalmonth, arrivalyear, departureday, departuremonth, departureyear, room);
        ReservationWriter.main(this.reservID , this.name, this.arrival, this.departure, this.rooms, this.room1Name, this.people, this.roomCost);
        //this.room.addReservation(this);
    }

    public Reservation(String Name, String arrivalday, String arrivalmonth, String arrivalyear, String departureday, String departuremonth, String departureyear, int people, int people2, Room room, Room room2) throws java.text.ParseException, java.io.IOException {
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
        UUID tempID = UUID.randomUUID();
        this.reservID = tempID;

        this.roomCost = Reservation.getTotalCost(arrivalday, arrivalmonth, arrivalyear, departureday, departuremonth, departureyear, room, room2);

        ReservationWriter.main(this.reservID , this.name, this.arrival, this.departure, this.rooms, this.room1Name, this.people, this.room2Name, this.people2, this.roomCost);
        //this.room.addReservation(this);
    }
    
    public static int getTotalCost(String arrivalday, String arrivalmonth, String arrivalyear, String departureday, String departuremonth, String departureyear, Room room) {
        String temparrival = arrivalyear + "-" + arrivalmonth + "-" + arrivalday;
        String tempdeparture = departureyear + "-" + departuremonth + "-" + departureday;
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate localarrival = LocalDate.parse(temparrival); //TEMP
        LocalDate localdeparture = LocalDate.parse(tempdeparture); //TEMP
        
        //LocalDate localdate1 = LocalDate.parse(temparrival, formatter);
        //LocalDate localdate2 = LocalDate.parse(tempdate2, formatter);

        //Converts Arrival and Departure to dd/MM/yyyy for using in functions
        //Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(this.arrival);
        //Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(this.departure);
        //Converts Arrival and Departure further to Insant dates to calculate days vbetween.
        //Instant instantFromDate1 = date1.toInstant();
        //Instant instantFromDate2 = date2.toInstant();
        //Calcs Days Between 2 dates for Price
        //long daysBetween = ChronoUnit.DAYS.between(instantFromDate1, instantFromDate2);

        //long daysBetween = ChronoUnit.DAYS.between(localdate1, localdate2);
        long daysBetween = ChronoUnit.DAYS.between(localarrival, localdeparture);
        int tempcost = 0;
        for (long i = 0; i <= daysBetween; i++) {
            //int tempDay = date1.getDay();
                //String tempDay = (localdate1.getDayOfWeek()).toString();
                String tempDay = (localarrival.getDayOfWeek()).toString();
            tempcost = tempcost + room.getPrice(tempDay);
            //Goes to next date
            //Calendar calendar = Calendar.getInstance();
            //calendar.setTime(date1);
            //calendar.add(Calendar.DAY_OF_YEAR, 1);
            //date1 = calendar.getTime();
                //localdate1.plusDays(1);
                localarrival = localarrival.plusDays(1);
        }

        
        return tempcost;
    }
    
    public static int getTotalCost(String arrivalday, String arrivalmonth, String arrivalyear, String departureday, String departuremonth, String departureyear, Room room, Room room2) {
        String temparrival = arrivalyear + "-" + arrivalmonth + "-" + arrivalday;
        String tempdeparture = departureyear + "-" + departuremonth + "-" + departureday;
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate localarrival = LocalDate.parse(temparrival); //TEMP
        LocalDate localdeparture = LocalDate.parse(tempdeparture); //TEMP
        
        //LocalDate localdate1 = LocalDate.parse(temparrival, formatter);
        //LocalDate localdate2 = LocalDate.parse(tempdate2, formatter);

        //Converts Arrival and Departure to dd/MM/yyyy for using in functions
        //Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(this.arrival);
        //Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(this.departure);
        //Converts Arrival and Departure further to Insant dates to calculate days vbetween.
        //Instant instantFromDate1 = date1.toInstant();
        //Instant instantFromDate2 = date2.toInstant();
        //Calcs Days Between 2 dates for Price
        //long daysBetween = ChronoUnit.DAYS.between(instantFromDate1, instantFromDate2);

        //long daysBetween = ChronoUnit.DAYS.between(localdate1, localdate2);
        long daysBetween = ChronoUnit.DAYS.between(localarrival, localdeparture);
        int tempcost1 = 0;
        int tempcost2 = 0;
        
        for (long i = 0; i <= daysBetween; i++) {
            //int tempDay = date1.getDay();
                //String tempDay = (localdate1.getDayOfWeek()).toString();
                String tempDay = (localarrival.getDayOfWeek()).toString();
            tempcost1 = tempcost1 + room.getPrice(tempDay);
            tempcost2 = tempcost2 + room2.getPrice(tempDay);
            //Goes to next date
            //Calendar calendar = Calendar.getInstance();
            //calendar.setTime(date1);
            //calendar.add(Calendar.DAY_OF_YEAR, 1);
            //date1 = calendar.getTime();
                //localdate1.plusDays(1);
                localarrival = localarrival.plusDays(1);
        }


        //for (long i = 0; i <= daysBetween; i++) {
        //int tempDay = date1.getDay();
        //String tempDay = (localdate1.getDayOfWeek()).toString();
        //this.room1Cost = this.room1Cost + room.getPrice(tempDay);
        //this.room2Cost = this.room2Cost + room.getPrice(tempDay);
        //Goes to next date
        //Calendar calendar = Calendar.getInstance();
        //calendar.setTime(date1);
        //calendar.add(Calendar.DAY_OF_YEAR, 1);
        //date1 = calendar.getTime();
        //localdate1.plusDays(1);
        //}

        int tempcost = tempcost1 + tempcost2;
        return tempcost;
    }
    
    public int getReservationCost() {
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
        //System.out.println("Room Type:" + room.getClass().getName());
    }
}