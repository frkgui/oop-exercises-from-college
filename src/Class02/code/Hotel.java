package Class02.code;

import java.util.ArrayList;

public class Hotel {

    // declaration

    private String hotelName;
    private ArrayList<Room> avaliableRooms = new ArrayList<>();
    private Room[] allRooms = new Room[20];
    private ArrayList<Guest> guestList = new ArrayList<>();

    // methods

    public void checkAvaliableRooms(){


    }

    public void addGuest(Guest guest){
        this.guestList.add(guest);
    }

    public Hotel(String hotelName, ArrayList<Room> avaliableRooms, Room[] allRooms, ArrayList<Guest> guestList) {
        this.hotelName = hotelName;
        this.avaliableRooms = avaliableRooms;
        this.allRooms = allRooms;
        this.guestList = guestList;
    }

    // getter & setter + constructor

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public ArrayList<Room> getAvaliableRooms() {
        return avaliableRooms;
    }

    public void setAvaliableRooms(ArrayList<Room> avaliableRooms) {
        this.avaliableRooms = avaliableRooms;
    }

    public Room[] getAllRooms() {
        return allRooms;
    }

    public void setAllRooms(Room[] allRooms) {
        this.allRooms = allRooms;
    }

    public ArrayList<Guest> getGuestList() {
        return guestList;
    }

    public void setGuestList(ArrayList<Guest> guestList) {
        this.guestList = guestList;
    }


}

