import java.util.Scanner;
public class Uni3Exe09 {
    //Entradas: raio, altura
    //Saidas: lataOleo
    //Processo: 3,14 * raio * raio * altura
    //Analise:

    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);
       
        System.out.print("Digite o raio: ");
        float raio = e.nextFloat();

        System.out.print("Digite o altura: ");
        float altura = e.nextFloat();
        float lataOleo = 3.14f * raio * raio * altura;

        System.out.println("O volume da lata de óleo é de: " + lataOleo);
        e.close();



    }
}
