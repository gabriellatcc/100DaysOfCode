package main;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int distancia;
        Scanner s=new Scanner(System.in);
        System.out.println("Informe a distancia em Km: ");
        distancia=s.nextInt();
        Distancia teste01=new Distancia();
        teste01.setDistancia(distancia);  // Passa a distância para a classe CalculoDistanciaCarros
        teste01.calcular();  // Realiza o cálculo com base na distância
        System.out.println("Tempo em minutos: " + teste01.getMinutos());
    }
}
