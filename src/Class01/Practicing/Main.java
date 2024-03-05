package Class01.Practicing;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();


        System.out.printf(">> Type the rectangle base value: ");
        rectangle.setBase(input.nextInt());

        System.out.printf(">> Type the rectangle base value: ");
        rectangle.setHeight(input.nextInt());

        System.out.println("\n>> Area value: " + rectangle.getRectangleArea(rectangle.getBase(), rectangle.getHeight()));

    }

}
