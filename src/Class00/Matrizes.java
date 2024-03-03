package Class00;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Integer[][] matriz = new Integer[4][6];
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();


        /*

        -> Print for TEST purposes
        1
        System.out.println(Arrays.deepToString(matriz));
        2
        for (int i = 0; i < 6; i++) {System.out.println(matriz[complete][i]);}

        */

        // User input on first line
        for (int i = 0; i < 6; i++) {
            System.out.print(">> Write the " + (i+1) + " number: ");
            matriz[0][i] = input.nextInt();
        }

        // Inverting the first line
        for (int i = 0; i < 6; i++) {
            matriz[1][i] = matriz[0][5-i];
        }

        // Adding first and second line
        for (int i = 0; i < 6; i++) {
            matriz[2][i] = (matriz[0][i] + matriz[1][i]);
        }

        // First line even(1st) and odd(2nd)
        for (int i = 0; i < 6; i++) {
            // Checking for the even numbers
            if(matriz[0][i]%2 == 0){
                evenNumbers.add(matriz[0][i]);
            }else{
                oddNumbers.add(matriz[0][i]);
            }
        }

        // Adding even numbers
        int index = 0;
        for (int i = 0; i < evenNumbers.size(); i++) {
            if (index < 6) {
                matriz[3][index] = evenNumbers.get(i);
                index++;
            } else {
                break;
            }
        }

        // Adding odd numbers
        for (int i = 0; i < oddNumbers.size(); i++) {
            if (index < 6) {
                matriz[3][index] = oddNumbers.get(i);
                index++;
            } else {
                break;
            }
        }

        System.out.println("\n----\n");

        System.out.println(">> Normal Matrix\n");
        System.out.println("\n"+Arrays.deepToString(matriz)+"\n");

        System.out.println(">> Transposed matrix:\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
