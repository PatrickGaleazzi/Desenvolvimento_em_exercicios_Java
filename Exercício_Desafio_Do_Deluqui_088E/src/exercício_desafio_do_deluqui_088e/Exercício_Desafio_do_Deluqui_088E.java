package exercício_desafio_do_deluqui_088e;
import java.util.Scanner;
public class Exercício_Desafio_do_Deluqui_088E {

    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         
    int x, y, op;
    System.out.println(" \n Digite o valor do primeiro operando: ");
        x = s.nextInt();
        System.out.println(" \n Digite o valor do segundo operando: ");
        y = s.nextInt();
 
        System.out.println(" \n Escolha uma as opções abaixo: ");
 
        System.out.println(" \n 1. Soma ");
        System.out.println(" \n 2. Subtração ");
        System.out.println(" \n 3. Multiplicação ");
        System.out.println(" \n 4. Divisão ");
 
        System.out.println(" \n Digite a opção desejada: ");
        op = s.nextInt();
 
        switch (op) {
            case 1:
                System.out.println(" \n Opção Selecionada: 1. Soma");
                System.out.println(" \n A soma dos dois valores é: " + (x + y));
                break; //fim caso 1
 
            case 2:
                System.out.println(" \n Opção Selecionada: 1. Subtração");
                System.out.println(" \n A subtração dos dois valores é: " + (x - y));
                break; //fim caso 2
 
            case 3:
                System.out.println(" \n Opção Selecionada: 1. Multiplicação");
                System.out.println(" \n A multiplicação dos dois valores é: " + (x * y));
                break; //fim caso 3
 
            case 4:
                System.out.println(" \n Opção Selecionada: 1. Divisão");
                if (y == 0) {
                    System.out.println(" \n Não existe divisão por zero. ");
                } else {
                    System.out.println(" \n A divisão dos dois valores é: " + (x / y));
                }//fim IF/ELSE
                break; //fim caso 4
 
            default:
                System.out.println(" \n Opção Inválida. ");
        } //fim switch/case
    } // fim programa principal
} // fim classe calculadora
