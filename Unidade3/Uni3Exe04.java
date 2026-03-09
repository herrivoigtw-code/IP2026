import java.util.Scanner;

public class Uni3Exe04 {
    //Entrada: noto1, nota2, nota3
    //Saida:media
    //Processo: (nota1 * 5 + nota2 * 3 + nota3 * 2)/10
    //Analise:

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("digite nota: ");
        float nota1 = leitor.nextFloat();

        System.out.print("digite nota: ");
        float nota2 = leitor.nextFloat();

        System.out.print("digite nota: ");
        float nota3 = leitor.nextFloat();

        float media = (nota1 * 5 + nota2 * 3 + nota3 * 2) / 10f;
        System.out.print("media: " + media);

        leitor.close();
    }
    }
    
    

