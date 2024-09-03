package main;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int salarioAtual;
        Scanner e=new Scanner(System.in);
        System.out.println("Digite o valor do seu salario atual: ");
        salarioAtual=e.nextInt();
        NovoSalario teste01=new NovoSalario(salarioAtual);
        System.out.println("O valor do seu novo salario e: "+teste01.calcularAumento());
    }
    
}
