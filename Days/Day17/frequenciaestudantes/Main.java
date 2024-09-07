import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner e=new Scanner(System.in);
        System.out.println("Insira o numero de casos de teste: ");
        int t=e.nextInt();
        e.nextLine();        
        for(int i=0;i<t;i++)
        {
            System.out.println("Insira o numero de estudantes na turma: ");
            int n=e.nextInt();
            e.nextLine();
            if(n==0)
            {
                System.out.println("Nenhum estudante na turma.");
                continue;
            }
            System.out.println("Insira os nomes dos estudantes, separados por um espaco: ");
            String [] nomes=e.nextLine().split(" ");
            System.out.println("Insira os registros de frequencia (A,P ou M),separados por um espaco: ");
            String [] frequencias=e.nextLine().split(" ");
            FrequenciaEstudantes turma=new FrequenciaEstudantes(n,nomes,frequencias);
            turma.calcularFrequencia();
        }
        e.close();
    }
}
