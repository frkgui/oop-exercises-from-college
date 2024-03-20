package Class02.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner writeLine = new Scanner(System.in);

        // app init config

        System.out.print("\n>> Type the hotel name: ");
        String hotelName = writeLine.nextLine();
        System.out.printf(">> Type the numbers of rooms %s have: ", hotelName);
        int roomsNumber = writeLine.nextInt();
        int idGuests = 0;

        Room[] allRooms = new Room[roomsNumber];
        for (int i = 0; i < roomsNumber; i++) {
            allRooms[i] = new Room(i, false);
        }
        ArrayList<Room> avaliableRooms = new ArrayList<>(Arrays.asList(allRooms));
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
            System.out.println("(5) - Book a room");
            System.out.println("(6) - Guest Checkout");
            System.out.println("(0) - Exit");

            System.out.print("\n<< What do you want to do? ");
            userChoice = writeLine.nextInt();
            writeLine.nextLine();

            switch (userChoice){

                case 0:
                    break;
                case 1:
                    System.out.println("\n- Avaliable Rooms -\n");

                    if(!avaliableRooms.isEmpty()){
                        for (Room avaliableRoom : avaliableRooms) {
                            System.out.printf(">> Quarto número %s está livre.\n", avaliableRoom.getIdRoom());
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
                    newGuest.setIdGuest(idGuests);
                    idGuests++;

                    System.out.printf("\n>> Account created: %s, %s, id: %d.\n", newGuest.getGuestName(),newGuest.getGuestCPF(),newGuest.getIdGuest());

                    break;

                case 3:

                    System.out.print("\n- Delete a Guest -\n");

                    System.out.print("\n<< Type the guest id:");
                    int guestId = writeLine.nextInt();
                    if (guestId >= 0 && guestId < guestList.size()) {
                        guestList.remove(guestId);
                        System.out.println("\nGuest was successfully removed!\n");
                    } else {
                        System.out.println("\nInvalid guest ID. No guest was removed.\n");
                    }

                    System.out.println("\nGuest was successfully removed!\n");

                    break;
            }

        }while (userChoice != 0);
    }
}
