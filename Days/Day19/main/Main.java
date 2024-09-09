package day19;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner e=new Scanner(System.in);
        System.out.println("Insira a quantidade de testes que quer fazer: ");
        int testes=e.nextInt();
        e.nextLine();
        for(int i=1;i<=testes;i++)
        {
            System.out.println("Informe um numero: ");
            String m=e.nextLine();
            Leds test01=new Leds(m);
            System.out.println("O numero de leds necessario para construir o numero "+m+" sera "+test01.indicadorDeLeds());
        }
    }  
}
