package Dia16;
public class SenhaForte
{
    private String senhaCL;
    private int nTamanho,i;
    private boolean tamanhoBom,caracMaius,caracMinus,caracEspe,caracDigito;
    public SenhaForte(String senha)
    {
        this.senhaCL=senha;
    }
    public String getSenhaCL()
    {
        return senhaCL;
    }
    public void setSenhaCL(String senhaCL)
    {
        this.senhaCL=senhaCL;
    }
    public void julgarSenha()
    {
        julgarTamanho();
        boolean resultado=confirmarCaracteres();
        if (resultado)
        {
            System.out.println("A senha é forte.");
        }
    }
    public void julgarTamanho()
    {
        if(senhaCL.length()>=6)
        {
            tamanhoBom=true;
        }
        else
        {
            tamanhoBom=false;
            nTamanho=senhaCL.length();
            for(i=1;i<6;i++)
            {
                if(6-nTamanho==i)
                {
                    System.out.println("A senha e curta, precisa de mais "+i+" caractere(s).");
                }
            }
        }
    }
    
    private boolean confirmarCaracteres()
    {
        for(char c:senhaCL.toCharArray())
        {
            if(Character.isUpperCase(c))
            {
                caracMaius=true;
            }
            if(Character.isLowerCase(c))
            {
                caracMinus=true;
            }
            if(Character.isDigit(c))
            {
                caracDigito=true;
            }
            if ("!@#%^&*()-+".indexOf(c) >= 0)
            {
                caracEspe = true;
            }
        }
            if(!caracMaius)
            {
                System.out.println("A senha deve ter pelo menos 1 caractere maiusculo.");
            }
            if(!caracMinus)
            {
                System.out.println("A senha deve ter pelo menos 1 caractere minusculo.");
            }            
            if(!caracDigito)
            {
                System.out.println("A senha deve ter pelo menos 1 digito (ex.: 0123456789).");
            }
            if(!caracEspe)
            {
                System.out.println("A senha deve ter pelo menos 1 caractere especial (!, @, #, etc.).");
            }  
        return caracMaius&&caracMinus&&caracDigito&&caracEspe;
    }   
}


