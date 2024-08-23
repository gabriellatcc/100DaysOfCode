package day03;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
//838

public class DiferentesDatas
{
    public LocalDate instanteI,instanteF,mes;
    public long resultado;
    public int testes,i;
    public Scanner e;
        public DiferentesDatas()
        {
            testes=0;
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
                    calcularDiferenca();
                    imprimirDiferenca();
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
            System.out.println("Informe a data inicial(AAAA-MM-DD): ");
            String dataInicialStr=e.nextLine();
            instanteI=LocalDate.parse(dataInicialStr);
            System.out.println("Informe a data final(AAAA-MM-DD): ");
            String dataFinalStr=e.nextLine();
            instanteF=LocalDate.parse(dataFinalStr);          
        }  
        public void calcularDiferenca()
        {
            resultado= ChronoUnit.DAYS.between(instanteI, instanteF);
        }    
        public void imprimirDiferenca()
        {
            System.out.printf("Diferenca: "+resultado+" dias.\n");
        }
        public static void main(String[] args)
        {
            DiferentesDatas teste1=new DiferentesDatas();
            teste1.lerValores();
            teste1.calcularDiferenca();
            teste1.imprimirDiferenca();
        }
}

