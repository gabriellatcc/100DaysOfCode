package hdoc28;
class Classe
{
    private int []x,m;
    private StringBuilder sb;
        public Classe(int []a)
        {
            this.x=a;
            this.m=new int[10];
            this.sb=new StringBuilder();
        }
        public String getSB()
        {
            return sb.toString();
        }
        public String imprimirResposta()
        {
            sb.setLength(0);
            for(int i=0;i<10;i++)
            {
                m[i]=x[i]*5;
                sb.append(m[i]).append(" ");
            }
            return sb.toString();
        }     
}