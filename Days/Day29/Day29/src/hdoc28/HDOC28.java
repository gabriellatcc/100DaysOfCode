package hdoc28;
import java.util.Scanner;
public class HDOC28
{
    public static void main(String[] args)
    {
        Scanner e=new Scanner(System.in);
        int [] a=new int [10];
        for(int i=0;i<10;i++)
        {
            System.out.println("Valor "+(i+1)+":");
            a[i]=e.nextInt();
        }
        Classe test01=new Classe(a);
        System.out.println("Os valores inseridos multiplicados por 5: "+test01.imprimirResposta());
    }
}