import java.util.Scanner;

public class Uni3Exe14 {
    //Entrada: distancia, tempo
    //Saída: velocidadeMedia, combustivel
    //Processo: 
    // velocidadeMedia = distancia / tempo
    // combustivel= distancia / 12
    //Analise:

    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print("Digite distância: ");
        float distancia = m.nextFloat();

        System.out.print("Digite tempo: ");
        float tempo = m.nextFloat();

        float velocidadeMedia = distancia / tempo;
        float combustivel = distancia / 12;

        System.out.println("A velocidade média foi de " + velocidadeMedia + "km/h e a quantidade de combustível usado foi " + combustivel + " litros.");

        m.close();


    }
    
}
