package main;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner e=new Scanner (System.in);
        double []n=new double [2];
        System.out.println("Digite o primeiro valor:");
        n[0]=e.nextDouble();
        System.out.println("Digite o segundo valor (nao pode ser zero):");
        n[1]=e.nextDouble();
        while(n[1]==0)
        {
            System.out.println("VALOR INVALIDO");
            System.out.println("Digite um novo valor (nao pode ser zero):");
            n[1] = e.nextDouble();
        }
        Classe test01=new Classe(n);
        System.out.println("Resultado da divisao: " + test01.imprimirDivisao());
    }
}