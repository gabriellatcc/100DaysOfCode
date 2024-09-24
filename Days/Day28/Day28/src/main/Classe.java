package main;
class Classe
{
    private double [] n;
    private double r;
        public Classe(double []n)
        {
            this.n=n;
            n=new double [2];
        }
        public double imprimirDivisao()
        {
            return n[0]/n[1];
        }
}

