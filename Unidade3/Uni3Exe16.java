import java.util.Scanner;
public class Uni3Exe16 {
//Entrada: valor da compra, valor pago
//Saida: numero minimo de notas e quantidade de notas de 100, 10 e 1
//Processo:
//troco = valorPago - valorCompra
//nota100 = troco / 100
//resto = troco % 100
//nota10 = resto / 10
//nota1 = resto % 10
//totalNotas = nota100 + nota10 + nota1
//Analise: Inteiro

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Digitar valor da Compra: ");
    int valorCompra = s.nextInt();

    System.out.print("digite Valor Pago: ");
    int valorPago = s.nextInt();

    int troco = valorPago - valorCompra;
    int nota100 = troco / 100;
    int resto = troco % 100;
    int nota10 = resto / 10;
    int nota1 = resto % 10;

    int totalNotas = nota100 + nota10 + nota1;

    System.out.print("Quantidade nota: " + totalNotas);
    System.out.print("notas de 100: " + nota100);
    System.out.print("notas de 10: " + nota10);
    System.out.print("notas de 1: " + nota1);

    s.close();



}
}
