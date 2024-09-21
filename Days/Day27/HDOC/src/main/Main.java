package main;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int[][] produto = new int[15][1];
        int[] codigos=new int[15];
        double[] precos=new double[15];
        Scanner e=new Scanner(System.in);
        for(int i=0;i<15;i++)
        {
            System.out.println("Insira o codigo do produto "+(i+1)+": ");
            codigos[i]=e.nextInt();
            System.out.println("Insira o preco do produto "+(i+1)+": ");
            precos[i]=e.nextDouble();
        }
        for(int i=0;i<15;i++)
        {
            produto[i][0]=codigos[i];
        }
        Classe test01 = new Classe(produto, precos);
        System.out.println("Maior preco lido: " +test01.compararPrecos());
        System.out.println("Média aritmetica dos precos dos produtos: "+test01.fazerMedia());
    }
}