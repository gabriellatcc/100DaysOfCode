package day18;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int testes;
        Scanner e=new Scanner(System.in);
        System.out.println("Insira a quantidade de testes que quer fazer: ");
        testes=e.nextInt();
        e.nextLine();
        while(testes>0)
        {
            IdiomaFalado test01=new IdiomaFalado();
            test01.lerValores();
            System.out.println("O idioma que sera falado no grupo sera o: "+test01.imprimirResposta());
            testes--;
        }
    }
    
}
