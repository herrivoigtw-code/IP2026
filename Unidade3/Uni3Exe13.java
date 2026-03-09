import java.util.Scanner;

public class Uni3Exe13 {
    //Entrada: altura, comprimento
    //Saida:  valorFinal
    //Processo: 112.5 * altura * comprimento 
    //Analise: metros

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("digite altura: ");
        double altura = a.nextDouble();

        System.out.print("digite comprimento: ");
        double comprimento = a.nextDouble();

        double valorFinal = 112.5f * altura * comprimento;
        System.out.println("O valor é de R$: " + valorFinal);

        a.close();


    }
    
}
