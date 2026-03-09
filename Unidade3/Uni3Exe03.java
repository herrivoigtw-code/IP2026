import java.util.Scanner;

public class Uni3Exe03 {
    //Entrada:precoLitro, pagamento
    //Saida: o motorista conseguiu colocar: total litros.
    //Processo: totalLitro= pagamento/precoLitro
    //Analise:

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.print("Digite preço: ");
        float precoLitro = l.nextFloat();

        System.out.print("Digite pagamento: ");
        float pagamento = l.nextFloat();

        float total = pagamento / precoLitro;
        System.out.print("Total L: " + total);

        l.close();
    }
    
}
