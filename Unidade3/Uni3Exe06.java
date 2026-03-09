import java.util.Scanner;
public class Uni3Exe06 {
    //Entrada: pesoTotal
    //Saída: valorPagar
    //Processo: pesoComida = pesoTotal - 0,75
    //valorPagar = pesoComida * 25
    //Analise: o peso é medido em Kg

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        
        System.out.print("Digite o peso: ");
        float pesoTotal = p.nextFloat();

        float pesoComida = pesoTotal - 0.75f;
        float valorPagar = pesoComida * 25f;

        System.out.print("O valor a ser pago é de R$: " + valorPagar);
        p.close();
    }


    
}
