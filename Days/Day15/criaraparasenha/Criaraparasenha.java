package Day15;
public class CriaRaParaSenha
{
    private String nome;
    private String ra;
    private int i;
    public CriaRaParaSenha(String nome)
    {
        this.nome=nome;
        this.ra="";
        criarRa();
    }
    public String getNome()
    {
        return nome;
    }
    public String getRa()
    {
        return ra;
    }
    
    private void criarRa()
    {
        StringBuilder raTemp = new StringBuilder();
        for(i=0;i<Math.min(nome.length(),12);i++)
        {
            char c=nome.charAt(i);
            if(c=='G' || c=='Q' || c=='a' || c=='k' || c=='u') 
            {
                raTemp.append('0');
            } 
            else if(c == 'I' || c == 'S' || c == 'b' || c == 'l' || c == 'v')
            {
                raTemp.append('1');
            } 
            else if(c == 'E' || c == 'O' || c == 'Y' || c == 'c' || c == 'm' || c == 'w')
            {
                raTemp.append('2');
            }
            else if(c == 'F' || c == 'P' || c == 'Z' || c == 'd' || c == 'n' || c == 'x')
            {
                raTemp.append('3');
            }
            else if(c == 'J' || c == 'T' || c == 'e' || c == 'o' || c == 'y')
            {
                raTemp.append('4');
            }
            else if(c == 'D' || c == 'N' || c == 'X' || c == 'f' || c == 'p' || c == 'z')
            {
                raTemp.append('5');
            }
            else if(c == 'A' || c == 'K' || c == 'U' || c == 'g' || c == 'q')
            {
                raTemp.append('6');
            }
            else if(c == 'C' || c == 'M' || c == 'W' || c == 'h' || c == 'r')
            {
                raTemp.append('7');
            }
            else if(c == 'B' || c == 'L' || c == 'V' || c == 'i' || c == 's')
            {
                raTemp.append('8');
            }
            else
            {
                raTemp.append('9');
            }
        }
        ra = raTemp.toString();
    }    
    public void imprimirRa()
    {
        System.out.println("Sua senha RA: "+ra);
    }
}

