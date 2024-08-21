package day01;
import java.util.Scanner;
public class DuracaoDeJogo
{
    public int []n;
    public int m1,m2, resposta,md,hd;
    public Scanner e;
        public DuracaoDeJogo()
        {
            n=new int[4];
            e=new Scanner(System.in);
        }
        public void lerValores()
        {
            System.out.println("Para ver o tempo de duracao de um jogo, digite em formato 24h:");
            System.out.println("Hora e minuto do inicio do jogo: ");
            n[0]= lerHora("inicio");
            n[1]= lerMinuto("inicio");
            System.out.println("Hora e minuto do termino de jogo: ");
            n[2]=lerHora("termino");
            n[3]=lerMinuto("termino");            
        }
        private int lerHora(String tipo)
        {
        int hora;
        while(true)
        {
            System.out.print("Digite a hora do "+tipo+" (0-23): ");
            hora=e.nextInt();
            if(hora>=0&&hora<=23)
            {
                return hora;
            }
            else
            {
                System.out.println("Hora invalida! Deve estar entre 0 e 23.");
            }
        }
        }
        private int lerMinuto(String tipo)
        {
        int minuto;
        while(true)
        {
            System.out.print("Digite o minuto do "+tipo+" (0-59): ");
            minuto=e.nextInt();
            if(minuto>=0&&minuto<=59)
            {
                return minuto;
            }
            else
            {
                System.out.println("Minuto invalido! Deve estar entre 0 e 59.");
            }
        }
        }
        public void calcularMinutos()
        {
            m1=(n[0]*60)+n[1];
            m2=(n[2]*60)+n[3];
            resposta=m2-m1;
        }
        public void converterHoras()
        {
            if(resposta<0)
            {
            resposta+=24*60;
            }
            md=resposta%60;
            hd=resposta/60;
        }
        public void imprimirDuracaoDeJogo()
        {
            System.out.println("O jogo durou "+hd+" hora(s) e "+md+" minutos");
        }
        public static void main(String[] args)
        {
        DuracaoDeJogo jogo=new DuracaoDeJogo();
            jogo.lerValores();
            jogo.calcularMinutos();
            jogo.converterHoras();
            jogo.imprimirDuracaoDeJogo();   
        }
}