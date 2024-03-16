package Class02.code;

import java.time.LocalDateTime;

public class Book {

    // declaration
    private int idBook;
    private Room idRoom;
    private LocalDateTime dueDate;


    // methods
    public String checkAvaliablity(){


        return "";
    }


    // getters & setters

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public Room getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(Room idRoom) {
        this.idRoom = idRoom;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }
}
