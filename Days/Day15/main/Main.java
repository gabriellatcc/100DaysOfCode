package Day15;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner e=new Scanner(System.in);
        System.out.println("Digite uma senha que apenas contenha letras minusculas e maiuculas: ");
        String nome=e.nextLine();
        CriaRaParaSenha test01=new CriaRaParaSenha(nome);
        test01.imprimirRa();
    }    
}

