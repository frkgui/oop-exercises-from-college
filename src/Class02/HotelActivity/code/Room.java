package Class02.HotelActivity.code;

public class Room {

    // declaration

    private int idRoom;
    private boolean isBooked;

    // constructor

    public Room(int idRoom, boolean isBooked) {
        this.idRoom = idRoom;
        this.isBooked = false; // when you create a room it will start with "isBooked" false.
    }


    // getters & setters

    public int getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

}
