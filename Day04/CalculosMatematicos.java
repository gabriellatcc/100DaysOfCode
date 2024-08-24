package day04;
import java.util.Scanner;
public class CalculosMatematicos
{
    public int i,x,y,testes,r1,r2,r3,maior;
    public Scanner e;
        public CalculosMatematicos()
        {
            testes=x=y=0;
            e=new Scanner(System.in);
        }
        public void inserirTestes()
        {
            System.out.println("Informe a quantidade de testes que quer fazer: ");
            testes=e.nextInt();
            if(testes!=1)
            {
                for(i=1;i<=testes;i++)
                {
                    lerValores();
                    calcular();
                    imprimirGanhador();
                }
            }
            if(testes<0)
            {
            System.out.println("Informe a quantidade de testes, tem de ser no mínimo 1: ");
            testes=e.nextInt();                
            }
        }
        public void lerValores()
        {
            System.out.println("Insira um valor inteiro para x: ");
            x=e.nextInt();
            System.out.println("Insira um valor inteiro para y: ");
            y=e.nextInt();
        }
        public void calcular()
        {
            r1=(int)Math.pow(3*x,2)+(int)Math.pow(y,2);
            r2=2*(int)Math.pow(x,2)+(int)Math.pow(5*y,2);
            r3=-100*x+(int)Math.pow(y,3);
        }
        public void imprimirGanhador()
        {
         if(r1>=r2&&r1>=r3)
        {
            maior=r1;
            System.out.printf("Rafael ganhou");
        }
        else if(r2>=r1&&r2>=r3)
        {
            maior=r2;
            System.out.println("Beto ganhou");
        }
        else
        {
            maior=r3;
            System.out.println("Caelos ganhou");
        }
        }
        public static void main(String[] args)
        {
            CalculosMatematicos teste1=new CalculosMatematicos();
                teste1.inserirTestes();
                teste1.lerValores();
                teste1.calcular();
                teste1.imprimirGanhador();
        }
}
