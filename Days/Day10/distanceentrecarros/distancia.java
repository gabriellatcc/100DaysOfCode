package main;
import java.util.Scanner;
class Distancia
{
    private int xv, yv, distancia, minutos;
    private Scanner e;

    public Distancia()
    {
        e=new Scanner(System.in);
        xv=60;
        yv=90;
        distancia=0;
        minutos=0;
    }
    
    //getter p distancia: retorna o valor atual da distancia
    public int getDistancia()
    {
        return distancia;//retorna o valor da distancia em kilometros
    }
    //setter p distancia: define o valor da distancia, com validação para garantir que seja maior que 1
    public void setDistancia(int distancia)//parametro: o valor da distância em quilômetros a ser definido
    {
        if(distancia<1)
        {//se a distancia for menor que 1
            throw new IllegalArgumentException("A distância tem que ser maior que 1!");
        }
        this.distancia = distancia;
    }
    
    //getter p minutos: retorna o valor atual dos minutos calculados
    public int getMinutos()
    {
        return minutos; // retorna o valor dos minutos
    }
    //setter p minutos: define o valor dos minutos calculados
    private void setMinutos(int minutos)//o valor dos minutos a ser definido
    {
        this.minutos=minutos;
    }

    public void lerValores()
    {
        System.out.println("Para saber em quantos minutos o carro Y ficara a certa distância do carro X, insira um valor em Km: ");
        try
        {
            setDistancia(e.nextInt());
        }
        catch(IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
            setDistancia(e.nextInt());
        }
    }
    public void calcular()
    {
        setMinutos(getDistancia()*2);
    }
    public void imprimirMinutos()
    {
        System.out.println(getMinutos()+" minutos.");
    }
}
