package Dia16;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner e=new Scanner(System.in);
        System.out.println("Digite uma senha: ");
        String senha=e.nextLine();
        SenhaForte test01=new SenhaForte(senha);
        test01.julgarSenha();
    }
}
