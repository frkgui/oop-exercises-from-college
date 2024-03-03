package Matriz;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner();

       Integer matriz = new Integer();

        //User input 4 first line
        for (int i = 0; i < 4; i++) {
            System.out.print(">> Write the " + i+1 + " number: ");
            matriz.add(input.nextInt());
        }


    }

}
