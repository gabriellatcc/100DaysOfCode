package main;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        int []v1=new int[15];
        int []v2=new int[15];
        Scanner e=new Scanner(System.in);
        System.out.println("Preencha o vetor 1:");
        for(int i=0;i<15;i++)
        {
            System.out.print("Valor "+(i+1)+" para o vetor 1: ");
            v1[i]=e.nextInt();
        }
        System.out.println("Preencha o vetor 2:");
        for (int i=0;i<15;i++)
        {
            System.out.print("Valor "+(i+1)+" para o vetor 2: ");
            v2[i]=e.nextInt();
        }
        Classe test01=new Classe(v1,v2);
        System.out.println("A quantidade de vezes que V1 e V2 possuem" 
        +"os mesmos numeros e nas mesmas posições e de: "+test01.imprimirResultado());
    }
}


