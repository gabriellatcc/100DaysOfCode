package day20;
import java.util.Scanner;
public class Main//esse codigo foi bom pra reforcar a a funcaozinha que confere a precsenca de letrss maiusculas
{
    public static void main(String[] args)
    {
        Scanner e=new Scanner(System.in);
        System.out.println("Digite palavras juntas, com cada uma com letra maiuscula, para o contador conta-las: ");
        String palavra=e.nextLine();
        Contador test01=new Contador(palavra);
        System.out.println("Existem "+test01.contadorDePalavras()+" palavras no termo digitado.");
    }
}
