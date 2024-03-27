package Class03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       Person pai = new Person("Guigo Guilherme", Gender.M, EyeColor.D);
       Person mae = new Person("Mariana", Gender.W, EyeColor.D);

        Person filho1 = mae.generatePerson("Filho do dono", Gender.M, pai);
        Person filho2 = pai.generatePerson("Filha do dono", Gender.W, mae);

        filho1.printData();




    }


}
