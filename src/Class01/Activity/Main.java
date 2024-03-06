package Class01.Activity;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Tax myTax = new Tax();

        System.out.println("\n ----- TAX CALCULATOR -----\n");

        System.out.print(">> Type your name: ");
        myTax.setName(input.nextLine());

        System.out.print(">> Type your year of birth: ");
        myTax.setYearOfBirth(input.nextInt());

        System.out.printf("\n>> TaxPayer INFO -> Name: %s, age: %d\n", myTax.getName(), myTax.getAge());

        System.out.printf("\n>> Please %s, type your monthly income: ", myTax.getName());
        myTax.setMonthlyIncome(input.nextInt());

        System.out.print("\n>> How many dependents do you have?: ");
        myTax.setNumberOfDependents(input.nextInt());
        input.nextLine();

        System.out.print(">> What do you do for a living?: ");
        myTax.setProfession(input.nextLine());

        System.out.print(">> What is your education level?: ");
        myTax.setEducationLevel(input.nextLine());

        System.out.println("\n ----- YOUR TAX RESUME -----\n");

        System.out.printf(">> Your monthly income : R$ %.2f\n", myTax.getMonthlyIncome());
        System.out.printf(">> Your annual income : R$ %.2f\n", myTax.getAnnualIncome());

        System.out.printf("\n>> Your maximum tax rate: R$ %.2f\n", myTax.getMaximumTaxRate());
        System.out.printf(">> Your real tax rate: R$ %.2f\n", myTax.getRealTaxRate());


    }

}
