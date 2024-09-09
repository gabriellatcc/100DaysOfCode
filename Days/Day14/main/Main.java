package day14;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner e=new Scanner(System.in);
        System.out.println("Insira uma senha: ");
        String senha=e.nextLine();
        ValidadorDeSenhas test01=new ValidadorDeSenhas(senha);
        if(test01.conferirSenha())
        {
            System.out.println("Senha valida.");
        }
        else
        {
            System.out.println("Senha invalida.");
        }
    }
    
}
