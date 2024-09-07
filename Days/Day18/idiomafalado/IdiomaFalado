package day18;
import java.util.Scanner;
public class IdiomaFalado
{
    private int grupo;
    private String resposta;
    private Scanner e;
        public IdiomaFalado()
        {
            e=new Scanner(System.in);
        }
        public void lerValores()
        {
            System.out.println("Insira a quantidade de pessoas no grupo: ");
            grupo=e.nextInt();
            e.nextLine();
            String [] idiomas=new String[grupo];
            for(int i=0;i<grupo;i++)
            {
                System.out.println("Insira o idiomas falado pela pessoa "+(i+1)+": ");
                idiomas[i]=e.nextLine(); 
            }
            resposta=analisarIdiomas(idiomas);
        }
        public String analisarIdiomas(String[] idiomas)
        {
            String idiomaNativo=idiomas[0];
            boolean todosMesmoIdioma=true;
            for(int j=1;j<idiomas.length;j++)
            {
                if(!idiomas[j].equals(idiomaNativo))
                {
                    todosMesmoIdioma=false;
                    break;
                }
            }
            if(todosMesmoIdioma)
            {
                return idiomaNativo;
            }
            else
            {
                return "ingles";
            }
        }
        public String imprimirResposta()
        {

            return resposta;
        }
}
