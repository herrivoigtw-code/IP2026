import java.util.Scanner;

public class Uni3Exe12 {
    public static void main(String[] args) {
        //Entrada:nome, horasTrabalhadas, numDepend, 
        //Saida:nome, salarioBruto, salarioLiquido
        //Processo: salarioBruto = horasTrabalhadas * 10,00 + numDepend * 60,00
        //salarioTRabalho = horasTrabalhalhadas * 10,00
        //desconto = salarioTrabalho*0,135
        //salarioLiquido = salarioTrabalho - desconto + numDepend * 60,00
        //Analise:

        Scanner s = new Scanner(System.in);
        System.out.print("Digite nome: ");
        String nome = s.nextLine();

        System.out.print("Digite horas trabalhadas: ");
        Float horasTrabalhadas = s.nextFloat();

        System.out.print("Digite Dependencias: ");
        Float numDepend = s.nextFloat();

        Float salarioTrabalhoa = horasTrabalhadas * 10.00f;
        Float salarioBruto = salarioTrabalhoa + numDepend * 60.00f;
        Float desconto = salarioTrabalhoa * 0.135f;
        Float salarioLiquido = salarioTrabalhoa - desconto + numDepend * 60.00f;
        System.out.println("O funcionario " + nome + "possui o salario bruto de R$ " + salarioBruto + "e salario liquido de R$ " + salarioLiquido + ".");

        s.close();


    }
}
