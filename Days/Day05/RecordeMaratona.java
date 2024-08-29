package day05;
import java.util.Scanner;
public class RecordeMaratona
{
    public int testes,i,diaMaior;
    public int [][]dia;
    public double []velocidadeMedia;
    public double maiorVelocidade;
    public Scanner e;
        public RecordeMaratona()
        {
            testes=0;
            diaMaior=0;
            maiorVelocidade=0;
            e=new Scanner(System.in);
        }
        public void inserirTestes()
        {
            System.out.println("Informe a quantidade de treinos que quer comparar: ");
            testes=e.nextInt();     
            if(testes<1||testes>30)
            {
            System.out.println("Informe a quantidade de treinos que quer comparar, tem de ser entre 2 a 30: ");
            testes=e.nextInt();                
            }
            dia=new int[testes][2];
            velocidadeMedia=new double[testes];
            for(i=1;i<=testes;i++)
            {
                lerValores();
                compararVelocidade();
            }   
        }
        public void lerValores()
        { 
            for(i=0;i<testes;i++)
            {
                System.out.println("Insira a duracao do treino (em minutos) do dia "+(i+1)+": ");
                dia[i][0]=e.nextInt();   
                System.out.println("Insira a distancia total percorrida (em quilometros) do dia "+(i+1)+": ");
                dia[i][1]=e.nextInt(); 
            }
        }
        public void compararVelocidade()
        {
            for(i=0;i<testes;i++)
            {
                velocidadeMedia[i]=(double)dia[i][1]/dia[i][0];
                if(velocidadeMedia[i]>maiorVelocidade)
                {
                    maiorVelocidade=velocidadeMedia[i];
                    diaMaior=i+1;
                }
            }             
        }
        public void imprimirMaiorVelocidade()
        {
            System.out.println("O dia em que o desempenho foi maior era: "+diaMaior);
        }
        public static void main(String[] args)
        {
            RecordeMaratona treino=new RecordeMaratona();
                treino.inserirTestes();
                treino.imprimirMaiorVelocidade();
        }
}
