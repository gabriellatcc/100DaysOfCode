package day07;
import java.util.Scanner;
import java.util.Random;
public class ContaDoBanco
{
    public Scanner e;
    public int acao1,acao2,i,tipoDaConta,j;
    public boolean statusAC,encontrado; //t= conta operante f= cancelou conta
    public String []nomeDono,senha;
    public int []numeroDaConta;
    public int [] saldo;
    public int deposito,saque;
    public String nome,senhaEntrada,senhaExclusao;
        public ContaDoBanco()
        {
            e=new Scanner(System.in);
            numeroDaConta=new int[100];//cadastra até 100 usuarios
            nomeDono=new String[100];//nome do cadastrado 1 a 100
            senha=new String[100];//cadastra até 100 senhas
            saldo = new int[100];
            deposito=saque=0;
            statusAC=false;
        }
        public void lerValores()
        {
            System.out.println("Programa do Banco (Pressione Enter para comecar).");
            e.nextLine();
            System.out.println("Escolha um numero para acao:");
            System.out.println("1- Abrir Conta");
            System.out.println("2- Entrar em Conta Existente");
            System.out.println("3- Sair");
            acao1=e.nextInt();
            switch(acao1)
            {
            case 1 -> {
                abrirConta();
                acaoConta();
            }
            case 2 -> {
                entrarConta();
                acaoConta();
            }
            case 3 -> sair();
            default -> System.out.println("Valor invalido!\n Operacao encerrada.");
            }
        }
        
        public void abrirConta()
        {
            e.nextLine(); //limpa buffer
            System.out.println("Insira o tipo de conta que quer abrir:");
            System.out.println("1- Conta Poupanca");
            System.out.println("2- Conta Corrente ");
            tipoDaConta=e.nextInt();
            e.nextLine();
            if(i>=100)
            {
                System.out.println("Limite de contas atingido.");
                return;
            }
            switch(tipoDaConta)
            {
                case 1 ->{
                    saldo[i]+=50;
                    System.out.println("Parabens criou uma conta corrente e ganhou $50");
                    i++;
                    inserirDados();
                    acaoConta();
                    pagarMensalidade();
                    statusAC=true;
            }
                case 2 -> {
                    saldo[i]+=150;
                    System.out.println("Parabens criou uma conta popupanca e ganhou $150");
                    i++;
                    inserirDados();
                    acaoConta();
                    pagarMensalidade();
                    statusAC=true;
            }
                default -> System.out.println("Valor invalido! Escolha 1 para conta POUPANCA ou 2 para CORRENTE.");
            }
        }
        public void inserirDados()
        {            
            e.nextLine();//limpa buffer
            System.out.println("Digite seu nome: ");
            nomeDono[i]=e.nextLine();
            System.out.println("Digite uma senha de 4 digitos: ");
            senha[i]=e.nextLine();
            if(senha[i].length()==4 && senha[i].matches("\\d{4}"))//length=longura igual 4 e matches igual a 4/ digits numbers sem espaço
            {
                System.out.println("Senha valida.");
            }
            else
            {
                System.out.println("Senha invalida. A senha deve ter exatamente 4 dígitos numericos.");
            }
            numeroDaConta[i] = criarNumeroDaConta();
            System.out.println("Seu numero da conta e: "+numeroDaConta[i]);
        }
        public int criarNumeroDaConta()
        {
            Random random = new Random();
            return 1000 + random.nextInt(9000); 
        }
        public void acaoConta()
        {   
            if(i==0)
            {
                System.out.println("Nenhuma conta aberta.");
                return;
            }
            System.out.println("Saldo:"+saldo[i-1]);
            System.out.println("Deseja: ");
            System.out.println("1- Depositar valor");
            System.out.println("2- Sacar valor");
            System.out.println("3- Excluir conta");
            System.out.println("4- Sair");
            acao2=e.nextInt();
            switch(acao2)
            {
                case 1 -> realizarDeposito();
                case 2 -> sacar();
                case 3 -> excluirConta();
                case 4 -> sair();
                default -> System.out.println("Valor inválido! Escolha 1, 2, 3 ou 4.");
            }
        }
        public void realizarDeposito()//deposito
        {
            e.nextLine();//limpa buffer
            System.out.println("Digite o valor de deposito: ");
            deposito=e.nextInt();
            e.nextLine();//limpa o buffer
            if(i<=0 || i>100)
            {
                System.out.println("Nenhuma conta valida encontrada.");
                return;
            }
            if(deposito<=0)
            {
                System.out.println("O valor do deposito deve ser positivo.");
                return;
            }
            saldo[i-1]+=deposito;
            System.out.println("Deposito realizado com sucesso. Novo saldo: " +saldo[i-1]);
            acaoConta();
        }
        public void sacar()//saque
        {
            e.nextLine();
            System.out.println("Insira o valor de saque: ");
            saque=e.nextInt();
            if(statusAC==true)
            {
                if(saque<saldo[i-1])
                {
                    saldo[i-1]-=saque;
                    System.out.println("Saque realizado. Novo saldo: "+saldo[i-1]);
                }
                else
                {
                    System.out.println("Operacao nao pode ser realizada, nao ha saldo suficiente para o saque.");
                }
            }
            acaoConta();
        }
        public void pagarMensalidade()    
        {
            if(tipoDaConta==2)
            {            
                System.out.println("Por ter aberto uma conta corrente, paga $12.");
                saldo[i-1]-=12;                  
            }
            else
            {            
                System.out.println("Por ter aberto uma conta poupanca, paga $20.");                
                saldo[i-1]-=20;
            }
            System.out.println("Agora seu saldo e de: "+saldo[i-1]);  
        }
        
        public void entrarConta()
        {
            e.nextLine(); // limpa o buffer
            System.out.println("Digite seu nome: ");
            nome=e.nextLine();
            System.out.println("Digite sua senha: ");
            senhaEntrada=e.nextLine();
            for(j=0;j<i;j++)
            {
                if(nomeDono[j].equals(nome) && senha[j].equals(senhaEntrada))
                {
                    System.out.println("Login realizado com sucesso.");
                    i=j+1;
                    statusAC=true;
                    return;
                }
                System.out.println("Nome ou senha incorretos. Tente novamente.");//voltar ao menu
            }
        }
        public void verificarUsuario()
        {
            encontrado = false;
            for(j=0;j<i;j++)
            {
                if(nomeDono[j].equals(nomeDono[i]) && senha[j].equals(senha[i]))
                {
                    System.out.println("Login realizado com sucesso. Bem-vindo(a), "+nomeDono[j]+ "!");
                    encontrado=true;
                    break;
                }
            }
            if (!encontrado)
            {
                System.out.println("Nome ou senha incorretos. Tente novamente.");
                entrarConta();
            }
        }
        public void excluirConta()
        {
            e.nextLine();
            System.out.println("Digite seu nome para confirmar a exclusão: ");
            nome=e.next();
            System.out.println("Digite sua senha para confirmar a exclusão: ");
            senhaExclusao=e.next();
            encontrado=false;
            for(j=0;j<i;j++)
            {
                if(nomeDono[j].equals(nome) && senha[j].equals(senhaExclusao))
                {
                    nomeDono[j]=null;
                    senha[j]=null;
                    numeroDaConta[j]=0;
                    saldo[j]=0;
                    System.out.println("Conta excluida com sucesso.");
                    encontrado=true;
                    statusAC=false;
                    break;
                }
            }
        }
        public void sair()
        {
            System.out.println("Voce escolheu sair do sistema. Ate logo!");
            System.exit(0);
        }
        public static void main(String[] args)
        {
            ContaDoBanco teste01=new ContaDoBanco();
            teste01.lerValores();
        }
}
