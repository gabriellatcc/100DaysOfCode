package main;
class Classe {
    private int[][] produto;
    private double[] precos;
    public Classe(int[][] p,double[] precos)
    {
        this.produto=p;
        this.precos=precos;
    }
    public double compararPrecos()
    {
        double maiorPreco=precos[0];
        for(int i=1;i<precos.length;i++)
        {
            if (precos[i]>maiorPreco)
            {
                maiorPreco=precos[i];
            }
        }
        return maiorPreco;
    }
    public double fazerMedia()
    {
        double soma=0;
        for(double preco:precos)
        {
            soma+=preco;
        }
        return soma/precos.length;
    }
}


