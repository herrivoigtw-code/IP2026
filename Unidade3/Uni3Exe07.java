import java.util.Scanner;
public class Uni3Exe07 {
    //Entrada: qtd350, qtd600, qtd2
    //Saida: qtdLitros
    //Processo: qtd350 * 0.35 + qtd600 * 0.60 + qtd2 * 2
    //Analise: 

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de refrigerante 350ml: ");
        float qtd350 = l.nextFloat();

        System.out.print("Digite a quantidade de refrigerante 600ml: ");
        float qtd600 = l.nextFloat();

        System.out.print("Digite a quantidade de refrigerante 2L: ");
        float qtd2 = l.nextFloat();

        float qtdLitros = qtd350 * 0.35f + qtd600 * 0.60f + qtd2 * 2;
        System.out.print("A quantidade de refrigerante me Litros é de:" + qtdLitros);

        l.close();
    }


    
}
