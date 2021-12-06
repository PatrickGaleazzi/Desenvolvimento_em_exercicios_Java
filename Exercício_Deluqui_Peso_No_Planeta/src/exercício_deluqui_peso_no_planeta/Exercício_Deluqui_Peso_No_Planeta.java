package exercício_deluqui_peso_no_planeta;
import java.util.Scanner;
public class Exercício_Deluqui_Peso_No_Planeta {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double pesoNaTerra;
        int numeroDoPlaneta;
        double pesoNoPlaneta;
        String nomeDoPlaneta;

        System.out.println(" calcula o peso de um terraque em outro planeta.");
        System.out.println("===============================================");
        System.out.println();

        // entarad de dados
        pesoNaTerra = 0;
        System.out.print("Entre seu peso na terra em Kg: ");
        pesoNaTerra = teclado.nextDouble();
        System.out.println(" #	gravidade relativa	Planeta");
        System.out.println(" 1		0,37		Mercurio");
        System.out.println(" 2		0,88		Venus");
        System.out.println(" 3		0,38		Marte");
        System.out.println(" 4		2,64		Jupiter");
        System.out.println(" 5		1,15		Saturno");
        System.out.println(" 6		1,17		Urano");
        System.out.print("Escolha o numero do planeta desejado: ");
        numeroDoPlaneta = teclado.nextInt();

        // processmaneto
        pesoNoPlaneta = 0;
        nomeDoPlaneta = "";
        switch (numeroDoPlaneta) {
            case 1: {
                pesoNoPlaneta = pesoNaTerra / 10 * 0.37;
                nomeDoPlaneta = "Mercurio";
                break;
            }
            case 2: {
                pesoNoPlaneta = pesoNaTerra / 10 * 0.88;
                nomeDoPlaneta = "venus";
                break;
            }
            case 3: {
                pesoNoPlaneta = pesoNaTerra / 10 * 0.38;
                nomeDoPlaneta = "Mearte";
                break;
            }
            case 4: {
                pesoNoPlaneta = pesoNaTerra / 10 * 2.64;
                nomeDoPlaneta = "Jupiter";
                break;
            }
            case 5: {
                pesoNoPlaneta = pesoNaTerra / 10 * 1.15;
                nomeDoPlaneta = "Saturno";
                break;
            }
            case 6: {
                pesoNoPlaneta = pesoNaTerra / 10 * 1.17;
                nomeDoPlaneta = "Urano";
                break;
            }
            default: {
                System.out.println("Numero do planeta INVALIDO.");
            }
        }

        // saida de dados
        if (pesoNoPlaneta != 0) {
            System.out.println();
            System.out.println("O peso na terra = " + pesoNaTerra);
            System.out.println("Peso no planeta "
                    + nomeDoPlaneta.toUpperCase() + " = " + pesoNoPlaneta);
        }
    }

}
