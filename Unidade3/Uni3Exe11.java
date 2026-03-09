import java.util.Scanner;

public class Uni3Exe11 {
    //Entrada:celsius
    //Saida:fahrenheit
    //Processo: (9/5) * celsius + 32
    //Analise:

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        System.out.print("escreva a temperatura: ");
        float celsius = c.nextFloat();
        float fahrenheit = 1.8f * celsius + 32;
        System.out.println("A temperatura é: " + fahrenheit);

        c.close();
    }

    
}
