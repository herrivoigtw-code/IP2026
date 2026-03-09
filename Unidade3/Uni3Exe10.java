import java.util.Scanner;

public class Uni3Exe10 {
    //Entrada:catetoOposto,catetoAdjacente 
    //Saida:hipotenusa
    //Processo: hipotesa²=catetoOposto² + catetoAdjacente²
    //hipotenusa= raiz quadrada (hipotenusa)
    //Analise:

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Cateto Oposto: ");
        double catetoOposto = s.nextDouble();

        System.out.print("Cateto Adjacente: ");
        double catetoAdjacente = s.nextDouble();

        double hipotenusa = (catetoOposto * catetoOposto) +
                            Math.pow(catetoAdjacente, 2);
        
        hipotenusa = Math.sqrt(hipotenusa);
        System.out.println("Hipotenusa = " + hipotenusa);                    

        s.close();
    }

    
}
