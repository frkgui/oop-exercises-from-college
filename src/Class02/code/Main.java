package Class02.code;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner writeLine = new Scanner(System.in);

        // app init config

        System.out.print("\n>> Type the hotel name: ");
        String hotelName = writeLine.nextLine();
        System.out.printf(">> Type the numbers of rooms %s have: ", hotelName);
        int roomsNumber = writeLine.nextInt();

        ArrayList<Room> avaliableRooms = new ArrayList<>();
        Room[] allRooms = new Room[roomsNumber];
        ArrayList<Guest> guestList = new ArrayList<>();
        int userChoice;

        //app start
        System.out.println("\n-/- Welcome to " + hotelName + " System! -/-");
        do {

            // main menu
            System.out.println("\n-- Main Menu --\n");

            System.out.println("(1) - Check Avaliable Rooms");
            System.out.println("(2) - Add new guest");
            System.out.println("(3) - Delete guest");
            System.out.println("(4) - Show all guests");
            System.out.println("(0) - Exit");

            System.out.print("\n<< What do you want to do? ");
            userChoice = writeLine.nextInt();
            writeLine.nextLine();

            switch (userChoice){

                case 0:
                    break;
                case 1:
                    System.out.print("\n- Avaliable Rooms -\n");

                    if(avaliableRooms.size()!=0){
                        for (Room avaliableRoom : avaliableRooms) {
                            System.out.printf("RoomId = %s ", avaliableRoom.getIdRoom());
                        }
                    }else {
                        System.out.println("\n>> There are no avaliable rooms right now.");
                    }

                    break;
                case 2:

                    System.out.print("\n- Add New Guest -\n");

                    Guest newGuest = new Guest();

                    System.out.print("\n<< Guest name: ");
                    newGuest.setGuestName(writeLine.nextLine());
                    System.out.print("<< Guest CPF: ");
                    newGuest.setGuestCPF(writeLine.nextLine());
                    System.out.print("<< Guest phone number: " );
                    newGuest.setGuestPhone(writeLine.nextLine());

                    System.out.printf("\n>> Account created: %s, %s\n", newGuest.getGuestName(),newGuest.getGuestCPF());

                    break;

                case 3:

                    break;
            }

        }while (userChoice != 0);
    }
}
