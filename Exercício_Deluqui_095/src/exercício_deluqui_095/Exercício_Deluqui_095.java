package exercício_deluqui_095;
import java.util.Scanner;
public class Exercício_Deluqui_095 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        //Informar se um numero é divisivel por 5 ou nao.
        
        int num;
        
        System.out.println("Informar se um numero é diviivel por 5 ou não: ");
         System.out.println();

         // Entrada de dados
        System.out.println("Entre um numero: ");
        num = teclado.nextInt();
        
        // processamento 
        if (num % 5 == 0) {
        System.out.println("O " +num+" É divisivel por 5.");
        } else {
        System.out.println("O " +num+" Não divisivel por 5.");    
        }
        
        
    }
    
}
