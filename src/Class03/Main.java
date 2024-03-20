package Class03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //var

        Gender generoDoPai;
        EyeColor olhoDoPai;
        String nomeDoPai;

        Gender generoDaMae;
        EyeColor olhoDaMae;
        String nomeDaMae;

       //init
        System.out.println("\n--- Bem vindo ao Gerador de Pessoas ---\n");

        //pai
        System.out.print("Digite o nome do pai a ser criado: ");
        nomeDoPai = input.nextLine();

        System.out.printf("\nQual o sexo de %s?\n \n(M) - Man" +
                "\n(W) - Woman\n" +
                "\nDigite aqui: ", nomeDoPai);
         generoDoPai = Gender.valueOf(input.nextLine());

        System.out.printf("\nQual a cor dos olhos de %s?\n" +
                "\n(B) - Blue\n" +
                "(G) - Green\n" +
                "(D) - Dark\n" +
                "\nDigite aqui: ", nomeDoPai);
        olhoDoPai = EyeColor.valueOf(input.nextLine());

        Person pai = new Person(nomeDoPai,generoDoPai,olhoDoPai);
        System.out.printf("\nPai {%s} criado com sucesso!\n", nomeDoPai);

        //mae
        System.out.print("\nDigite o nome da mãe a ser criado: ");
        nomeDaMae = input.nextLine();

        System.out.printf("\nQual o sexo de %s?\n \n(M) - Man" +
                "\n(W) - Woman\n" +
                "\nDigite aqui: ", nomeDaMae);
        generoDaMae = Gender.valueOf(input.nextLine());

        System.out.printf("\nQual a cor dos olhos de %s?\n" +
                "\n(B) - Blue\n" +
                "(G) - Green\n" +
                "(D) - Dark\n" +
                "\nDigite aqui: ", nomeDaMae);
        olhoDaMae = EyeColor.valueOf(input.nextLine());

        Person mae = new Person(nomeDaMae,generoDaMae,olhoDaMae);
        System.out.printf("\nMãe {%s} criada com sucesso!", nomeDaMae);



    }



}
