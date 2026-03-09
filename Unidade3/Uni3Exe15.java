import java.util.Scanner;

public class Uni3Exe15 {
//Entrada: numeroInteiro
//Saida:centenas, dezenas e unidades
//Processo:
//centena = numero / 100
//resto = numero % 100
//dezena = resto / 10
//unidade = resto % 10
//Analise: decompor um número em centenas, dezenas e unidades

public static void main(String[] args) {

    Scanner c = new Scanner(System.in);
    System.out.print("Digite valor: ");
    int numeroInteiro = c.nextInt();

    int centena = numeroInteiro / 100;
    int resto = numeroInteiro % 100;
    int dezena = resto / 10;
    int unidade = resto % 10;

    System.out.print("centenas: " + centena + "dezenas:" + dezena + "unidades" + unidade);

    c.close();
}
}