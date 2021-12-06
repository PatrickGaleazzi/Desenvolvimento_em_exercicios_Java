package exercício_deluqui_092;
import java.util.Scanner;
public class Exercício_Deluqui_092 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
//Construir um algoritmo que leia dois numeos inteiros
//e faca sua adição. Caso o valor somado seja maiosr que 20,
//este devera ser apresentado somandos-se o valor 8.
//Caso o valor somado seja menor ou igual a 20,
//este valor deverá ser apresentado subtraindo-se 5.
        
        int num1;
        int num2;
        int soma;

        // informar para que serve o programa 
        System.out.println("leia dois numeos inteiros e faca sua adição: ");
        System.out.println("Soma > 20 adiciona 8.");
        System.out.println("Soma <- 20 subtrai 5.");
        System.out.println();

        // Entrada de dados
        System.out.println("Digite o primero numero inteiro 1: ");
        num1 = teclado.nextInt();
        System.out.println("Digite o segundo numero inteiro 2: ");
        num2 = teclado.nextInt();

        // processamento
        soma = 0;
        soma = num1 + num2;
        if (soma > 20) {
            soma = soma + 8;
        } else {
            soma = soma - 5;
        }

        // Saída de dados
        System.out.println(" Resultado = " + soma);

    }
    
}
