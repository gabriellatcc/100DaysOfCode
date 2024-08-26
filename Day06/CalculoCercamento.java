package day06;
import java.util.Scanner;
public class CalculoCercamento
{
    public int acaiRestante,i; 
    public double coordenada;
    public double []x,y;
    public Scanner e;
    public double Xc,Yc,somaX,somaY,raioMax,comprimentoFio;
    
        public CalculoCercamento()
        {
            acaiRestante=0;
            somaX=somaY=raioMax=0;
            e=new Scanner(System.in);
        }
        public void lerValores()
        {
            System.out.println("Insira a quantidade de pes de acai restantes na fazenda(3-100000): ");
            acaiRestante=e.nextInt();
            if(acaiRestante<3 || acaiRestante>Math.pow(10, 5))
            {
                 System.out.println("A quantidade deve ser no minimo 3 e no maximo 100000: ");
                acaiRestante=e.nextInt();
            }
            x=new double [acaiRestante];
            y=new double [acaiRestante];
            for(i=0;i<acaiRestante;i++)
            {
                System.out.println("Informe a posicao X do pe "+(i+1)+": ");
                x[i]=e.nextInt();
                if(x[i]>Math.pow(10,3)||x[i]<Math.pow(-10,3))
                {
                   System.out.println("Valor invalido para X do pe "+(i+1)+"! Insira um numero entre -1000 e 1000: ");
                    x[i]=e.nextInt(); 
                }
                System.out.println("Informe a posicao Y do pe "+(i+1)+": ");
                y[i]=e.nextInt();
                if(y[i]>Math.pow(10,3)||y[i]<Math.pow(-10,3))
                {
                   System.out.println("Valor invalido para Y do pe "+(i+1)+"! Insira um numero entre -1000 e 1000: ");
                   y[i]=e.nextInt(); 
                }
            }
        }
        public void calcularPosicao()
        {
            for(i=0;i<acaiRestante;i++) 
            {
                somaX+=x[i];
                somaY+=y[i];
            }
            Xc=somaX/acaiRestante;
            Yc=somaY /acaiRestante;
            for(i=0;i<acaiRestante;i++)
            {
                double distancia=Math.sqrt(Math.pow(x[i]-Xc,2)+Math.pow(y[i]-Yc,2));
                if(distancia>raioMax)
                {
                    raioMax=distancia;
                }
            }
            comprimentoFio=2*3.14*raioMax;
        }
        public void imprimir()
        {
            System.out.printf("Centro da cerca: Xc = %.2f, Yc = %.2f%n", Xc, Yc);
            System.out.printf("Raio da cerca: %.2f%n", raioMax);
            System.out.printf("Metragem do fio eletrificado: %.2f metros%n", comprimentoFio);            
        }
        public static void main(String[] args)
        {
        CalculoCercamento la=new CalculoCercamento();
            la.lerValores();
            la.calcularPosicao();
            la.imprimir();
        }
}
