import java.util.Scanner;

public class Uni3Exe08 {
    //entrdas:valorDolar, cotaçaoDolar
    //saidas:valorReais
    //Processo: valorDolar * cotaçaoDolar
    //Analise:

    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.print("Digite valor: ");
        float valorDolar = d.nextFloat();

        System.out.print("Digite cotação dolar: ");
        float cotacaoDolar = d.nextFloat();

        float valorReais = valorDolar * cotacaoDolar;

    System.out.print("O valor em reais é de R$: " + valorReais);

    d.close();
    }


    
}
