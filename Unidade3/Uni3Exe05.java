import java.util.Scanner;
public class Uni3Exe05 {
    //Entrada:qtdFrangos
    //Saida:valorTotal
    //Processo: qtdFrangos * 11
    //Analise: A somatoria dos aneis da 11 reais.

    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);

        System.out.print("Digite a quantidade de Frangos: ");
        int qtdFrangos = f.nextInt();

        int valorTotal = qtdFrangos * 11;
        System.out.print("O valor a ser pago é de R$: " + valorTotal);
        
        f.close();
    }
    
}
