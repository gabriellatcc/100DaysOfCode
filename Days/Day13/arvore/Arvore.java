package day13;

public class Arvore {
    int base,espacos,i,j,k;
        public Arvore(int base)
        {
            this.base=base;
        }

        public int getBase()
        {
            return base;
        }
        public void setBase(int base)
        {
            this.base=base;
        }

        public void construirGalhos()
        {
            espacos=base/2;
            for(i= 1;i<=base;i+=2)
            {
                for(j=0;j<espacos;j++)
                {
                    System.out.print(" ");
                }
                for(k=0;k<i;k++)
                {
                    System.out.print("*");
                }
                System.out.println();
                espacos--;
            }
        }
        public void imprimirTronco()
        {
            for(j=0;j<base/2;j++)
            {
                System.out.print(" ");
            }
            System.out.println("*");
            for(j=0;j<(base/2)-1;j++)
            {
                System.out.print(" ");
            }
            System.out.println("***");
        }
}
