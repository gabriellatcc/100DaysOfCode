package day08;
import java.util.Scanner;
public class GettersAndSetters
{
    private int num1;
    private int num2;
    private int num3;
    private Scanner e;
        public GettersAndSetters()
        {
            e=new Scanner(System.in);
            num1=num2=num3=0;
        }
        public void lerValores()
        {
            System.out.println("Insira um primeiro valor: ");
            num1=e.nextInt();
            System.out.println("Insira um segundo valor: ");
            num2=e.nextInt();
            System.out.println("Insira um terceiro valor: ");
            num3=e.nextInt();
        }
        //getters
        public int getNum1()
        {
            return num1;
        }
        public int getNum2()
        {
            return num2;
        }
        public int getNum3()
        {
            return num3;
        }
        
        //setters
        public void setNum1(int num1)
        {
            this.num1 = num1;
        }
        public void setNum2(int num2)
        {
            this.num2 = num2;
        }
        public void setNum3(int num3)
        {
            this.num3 = num3;
        }
        public void imprimirValores()
        {
            System.out.println("Seus valores sao: ");
            System.out.println("Primeiro valor: "+this.num1+".");
            System.out.println("Segundo valor: "+this.num2+".");
            System.out.println("Terceiro valor: "+this.num3+".\n");
        }
        public static void main(String[] args)
        {
            GettersAndSetters teste01=new GettersAndSetters();
            teste01.lerValores();
            teste01.imprimirValores();
        }
}
