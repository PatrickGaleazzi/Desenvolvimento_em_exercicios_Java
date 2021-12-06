package exercício_deluqui_098;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercício_Deluqui_098 {

    public static void main(String[] args) {
 Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.00");
        double salarioBruto;
        double prestacao;
        double percentualSB;

        System.out.println("Calcula se e possivel fazer esmprestimo");
        System.out.println("para funcionario estatutario do Rio De Janeiro.");
        System.out.println("limite de 30% do SALARIO BRUTO");
        System.out.println();

        // entrada de dados
        System.out.print("Entre um salario bruto em R$ ");
        salarioBruto = teclado.nextDouble();
        System.out.print("ENtre o valor da prestação em R$  ");
        prestacao = teclado.nextDouble();
        
        // processmaneto
        percentualSB = prestacao * 100 / salarioBruto;
        if (percentualSB > 30.0) {
            // saida de dados 1
            System.out.println("NAO e possivel conceder o emprestimo = " 
                        + df.format(percentualSB) + "%");
        } else {
            // saida de dados 2
            System.out.println("E possivel conceder o emprestimo = " 
                        + df.format(percentualSB)+ "%");
        }
    }

}

    }
    
}
