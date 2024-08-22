package day02;
import java.util.Scanner;
public class RobbieAndGloria
{
    public int moedas, saltos,i,j,soma;
    public boolean primo;
    public int []valor;
    public Scanner e;
        public RobbieAndGloria()
        {
            saltos=soma=0;
            primo=true;
            e=new Scanner(System.in);
        }
        public void lerValores()
        {
            System.out.println("Insira a quantidade de moedas que Robbie tem (2-20):  ");
            moedas=e.nextInt();            
            if(moedas<2 || moedas>20)
            {
                System.out.println("Erro!! As moedas devem ser no minimo 2 ou maximo 20. Insira um valor valido: ");
                moedas=e.nextInt();
            } 
            valor= new int [moedas];
            System.out.println("Insira os valores das moedas: ");
            for(i=0;i<moedas;i++)
            {
                System.out.println(i+".");
                valor[i]=e.nextInt();
            }            
            System.out.println("Insira a quantidade de Saltos que Gloria quer (1-"+moedas+"): ");
            saltos=e.nextInt();
            if(saltos<1||saltos>moedas)
            {
                System.out.println("Erro!! Os saltos devem ser entre 1 a"+moedas+", é 1 salto por moeda. Insira um valor valido: ");
                saltos=e.nextInt();
            }
        }
        public void fazerConta()
        {
            for(j=0;j<moedas;j++)
            {
                int novoValor=moedas-(saltos*valor[j]);//valor é atualizado
                if(novoValor<0)
                {
                    novoValor=0;
                }
                soma+=novoValor;
            }
        }
        public void conferirPrimo()
        {          
            if(soma==2)
            {
                primo=true;
            }
            if(soma<=1)
            {
                primo=false;
            }
            if(soma%2==0)
            {
                primo=false;
            }
            else
            {
                for(i=3;i<=soma;i++)
                {
                    if(soma%i==0)
                    {
                    primo=false;
                    }
                }
            }
        }
        public void imprimirResposta()
        {
            if(primo==true)
            {
               System.out.println("Você e so uma sucata prateada, Robbie, um aviaozao enferrujado");
            }
            else
            {
               System.out.println("Robo mala! Eu vou te bater!");
            }                
        }
        public static void main(String[] args)
        {
        RobbieAndGloria play1=new RobbieAndGloria();
            play1.lerValores();
            play1.fazerConta();
            play1.conferirPrimo();
            play1.imprimirResposta();
        }
}
