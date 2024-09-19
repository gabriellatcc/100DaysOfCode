package main;
public class Classe
{
    private int [] vetor1,vetor2;
    private int m;
        public Classe(int [] v1, int [] v2)
        {
            this.vetor1=v1;
            this.vetor2=v2;
        }
        public int[] getVetor1() {
            return vetor1;
        }
        public void setVetor1(int[] vetor1) {
            this.vetor1 = vetor1;
        }
        public int[] getVetor2() {
            return vetor2;
        }
        public void setVetor2(int[] vetor2) {
            this.vetor2 = vetor2;
        }

        public int imprimirResultado()
        {
            m=0;
            for(int i=0;i<15;i++)
            {
                if(vetor1[i]==vetor2[i])
                {
                    m++;
                }
            }
            return m;
        }
}

