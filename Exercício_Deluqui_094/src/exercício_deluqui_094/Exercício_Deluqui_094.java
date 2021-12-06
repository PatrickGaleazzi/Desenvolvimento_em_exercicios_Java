package exercício_deluqui_094;
import java.util.Scanner;
public class Exercício_Deluqui_094 {

    public static void main(String[] args) {
Scanner teclado = new Scanner (System.in);
    
    //Entrar com um numero e imprimir a seguintes mensagens:
    //É multpilo de 3 
    //Não é multiplo de 3
    
        int num;

        System.out.println("Verifica se um numero é multiplo de 3: ");
        System.out.println();

        // Entrada de dados
        System.out.println("Entre um numero: ");
        num = teclado.nextInt();
        
        // processamento 
        if (num % 3 == 0) {
        System.out.println("O " +num+" É multiplo de 3.");
        } else {
        System.out.println("O " +num+" Não é multiplo de 3.");    
        }
        
       
    
    }
    
}
