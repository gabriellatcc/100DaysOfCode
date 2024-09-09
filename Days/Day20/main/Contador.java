package day20;
public class Contador
{
    private int quantidade=1;
    private String palavraAserAnalisada;
        public Contador(String palavra)
        {
            this.palavraAserAnalisada=palavra;
        }   
        public String getPalavraAserAnalisada()
        {
            return palavraAserAnalisada;
        }
        public void setPalavraAserAnalisada(String palavraAserAnalisada)
        {
            this.palavraAserAnalisada=palavraAserAnalisada;
        } 
        public int contadorDePalavras()
        {
            for(char c:palavraAserAnalisada.toCharArray())
            {
                if(Character.isUpperCase(c))
                {
                    quantidade++;
                }
            }
            return quantidade;
        }
}
