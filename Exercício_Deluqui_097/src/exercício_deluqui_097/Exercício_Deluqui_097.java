package exercício_deluqui_097;

import java.util.Scanner;

public class Exercício_Deluqui_097 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Entrar um numero e infomar se ele e divisivel
        //por 10, por 5, por 2 ou se nao e divisivel por nenhum destes
        int num;

        System.out.println("Informar se um numero é diviivel por 10: ");
        System.out.println("Informar se um numero é diviivel por 5: ");
        System.out.println("Informar se um numero é diviivel por 2: ");
        System.out.println("Não é divisivel por nenhum dos anteriores: ");
        System.out.println();

        // Entrada de dados
        System.out.println("Entre um numero: ");
        num = teclado.nextInt();

        // processamento 
        if (num % 10 == 0) {
            System.out.println("O " + num + " É divisivel por 10.");
        } else {
            System.out.println("O " + num + " Não divisivel por 10:");
            if (num % 5 == 0) {
                System.out.println("O " + num + " É divisivel por 5.");
            } else {
                System.out.println("O " + num + " Não divisivel por 5: ");
                if (num % 2 == 0) {
                    System.out.println("O " + num + " É divisivel por 2.");
                } else {
                    System.out.println("O " + num + " Não divisivel por 2: ");
                }

            }
        }