package main;
class NovoSalario
{
    private double salarioAtual;
    private double salarioNovo;
        public NovoSalario(int salarioAtual)
        {
            this.salarioAtual=salarioAtual;
        } 
        
        public double getSalarioAtual()
        {
            return salarioAtual;
        }
        public void setSalarioAtual(double salarioAtual)
        {
            this.salarioAtual=salarioAtual;
        }
        
        public double getSalarioNovo()
        {
            return this.salarioNovo;
        }
        public void setSalarioNovo()
        {
            this.salarioNovo=salarioNovo;
        }
        
        public double calcularAumento()
        {
            this.salarioNovo=this.salarioAtual*1.25;
            return this.salarioNovo;
        }
}
