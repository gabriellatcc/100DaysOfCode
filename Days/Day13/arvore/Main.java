package day13;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner e=new Scanner(System.in);
        System.out.println("Insira um valor inteiro impar para ser o tamanho da base: ");
        int base=e.nextInt();
        if(base%2==0)
        {
            System.out.println("Por favor, insira um numero impar.");
        }
        else
        { 
            Arvore test01=new Arvore(base);   
            test01.construirGalhos();
            test01.imprimirTronco();
        }
    }
}
