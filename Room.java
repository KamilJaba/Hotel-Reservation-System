import java.util.*;
public class Room
{
    private String roomName = "";
    private int priceMonday = 0;
    private int priceTuesday = 0;
    private int priceWednesday = 0;
    private int priceThursday = 0;
    private int priceFriday = 0;
    private int priceSaturday = 0;
    private int priceSunday = 0;
    private int maxOccupancy = 0;
    private int roomID = 0;
    private boolean booked;


    public Room (String name, int priceMonday, int priceTuesday, int priceWednesday, 
    int priceThursday, int priceFriday, int priceSaturday, int priceSunday, int maxOccupancy, int roomID) {
        this.roomName = name;
        this.priceMonday = priceMonday;
        this.priceTuesday = priceTuesday;
        this.priceWednesday = priceWednesday;
        this.priceThursday = priceThursday;
        this.priceFriday = priceFriday;
        this.priceSaturday = priceSaturday;
        this.priceSunday = priceSunday;
        this.maxOccupancy = maxOccupancy;
        this.roomID = roomID;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setName(String name) {
        this.roomName = name;
    }

    public int getPrice(String day) {
        if (day == "MONDAY") {
            return priceMonday;
        }
        else if (day == "TUESDAY") {
            return priceTuesday;
        }
        else if (day == "WEDNESDAY") {
            return priceWednesday;
        }
        else if (day == "THURSDAY") {
            return priceThursday;
        }
        else if (day == "FRIDAY") {
            return priceFriday;
        }
        else if (day == "SATURDAY") {
            return priceSaturday;
        }
        else if (day == "SUNDAY") {
            return priceSunday;
        }
        else {
            return 0;
        }
    }
    
    public void setPrice(String day, int price) {
        if (day == "monday") {
            this.priceMonday = price;
        }
        else if (day == "tuesday") {
            this.priceTuesday = price;
        }
        else if (day == "wednesday") {
            this.priceTuesday = price;
        }
        else if (day == "thursday") {
            this.priceTuesday = price;
        }
        else if (day == "friday") {
            this.priceTuesday = price;
        }
        else if (day == "saturday") {
            this.priceTuesday = price;
        }
        else if (day == "sunday") {
            this.priceTuesday = price;
        }
        else {
            return;
        }
    }

    public int getMaxOccupancy() {
        return maxOccupancy;
    }

    public void setOccupancy(int occupancy) {
        this.maxOccupancy = occupancy;
    }
    
    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }
    
    public String toString(String day) {
        if (day == "monday") {
            return "Room Name: " + roomName + ", Price: " + priceMonday + ", Max Occupancy: " + maxOccupancy + ", RoomID: "+ roomID;
        }
        else if (day == "tuesday") {
            return "Room Name: " + roomName + ", Price: " + priceTuesday + ", Max Occupancy: " + maxOccupancy + ", RoomID: "+ roomID;
        }
        else if (day == "wednesday") {
            return "Room Name: " + roomName + ", Price: " + priceWednesday + ", Max Occupancy: " + maxOccupancy + ", RoomID: "+ roomID;
        }
        else if (day == "thursday") {
            return "Room Name: " + roomName + ", Price: " + priceThursday + ", Max Occupancy: " + maxOccupancy + ", RoomID: "+ roomID;
        }
        else if (day == "friday") {
            return "Room Name: " + roomName + ", Price: " + priceFriday + ", Max Occupancy: " + maxOccupancy + ", RoomID: "+ roomID;
        }
        else if (day == "saturday") {
            return "Room Name: " + roomName + ", Price: " + priceSaturday + ", Max Occupancy: " + maxOccupancy + ", RoomID: "+ roomID;
        }
        else if (day == "sunday") {
            return "Room Name: " + roomName + ", Price: " + priceSunday + ", Max Occupancy: " + maxOccupancy + ", RoomID: "+ roomID;
        }
        else {
            return "";
        }
    }
}
