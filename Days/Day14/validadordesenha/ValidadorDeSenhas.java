package day14;
public class ValidadorDeSenhas
{
    private String senha;
    private boolean temMaiuscula,temMinuscula,temNumero;
    public ValidadorDeSenhas(String Senha)
    {
        this.setSenha(Senha);
        temMaiuscula=false;
        temMinuscula=false;
        temNumero=false;
    }
    public String getSenha()
    {
        return senha;
    }
    public void setSenha(String senha)
    {
        this.senha=senha;
    }
    public boolean conferirSenha()
    {
        return conferirTamanho()&&conferirConteudo();
    }
    private boolean conferirTamanho()
    {
        return senha.length()>=6 && senha.length()<=32;
    }
    private boolean conferirConteudo()
    {
        for(char c:senha.toCharArray())
        {
            if(Character.isUpperCase(c))
            {
                temMaiuscula=true;
            }
            else if(Character.isLowerCase(c))
            {
                temMinuscula=true;
            }
            else if(Character.isDigit(c))
            {
                temNumero=true;
            }
            else
            {
                return false;
            }
        }
        return temMaiuscula&&temMinuscula&&temNumero;
    }
}
