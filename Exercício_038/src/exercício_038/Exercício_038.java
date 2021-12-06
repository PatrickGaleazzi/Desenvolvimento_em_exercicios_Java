package exercício_038;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Exercício_038 {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       DecimalFormat df = new DecimalFormat("#,##0.00");
       
// declaração de variaveis
         double num, parte;
       
       
        // informar para que serve o programa 
        System.out.println("Programa para exibir a terça parte de um número real: ");
        System.out.println();
        // Entrada de dados
        System.out.println("Escreva o número a ser dividido: ");
        num = teclado.nextDouble();
        // processamento 
        parte = num /3.0;
        // Saída de dados
        System.out.println("A terça parte de = " + num +" é: "+ parte);
        
        System.out.println(
                NumberFormat.getCurrencyInstance().format(12345678.90));
        
        
        
    
    
}
}
