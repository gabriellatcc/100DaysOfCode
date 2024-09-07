public class FrequenciaEstudantes
{
    private int nEstudantes;
    private String [] nomesEstudantes;
    private String [] frequenciaEstudantes;
    private double frequencia,presencas,totalAulas;
        public FrequenciaEstudantes(int N,String [] nomes,String [] frequencias)
        {
            this.nEstudantes=N;
            this.nomesEstudantes = nomes;
            this.frequenciaEstudantes = frequencias;
        }
        public int getNEstudantes()
        {
            return nEstudantes;
        }
        public void setNEstudantes(int nEstudantes)
        {
            this.nEstudantes=nEstudantes;
        }
        public String[] getNomes()
        {
            return nomesEstudantes;
        }
        public void setNomes(String[] nomesEstudantes)
        {
            this.nomesEstudantes=nomesEstudantes;
        }
        public String[] getFrequencias()
        {
            return frequenciaEstudantes;
        }
        public void setFrequencias(String[] frequencias)
        {
            this.frequenciaEstudantes = frequencias;
        }
        public void calcularFrequencia()
        {
            StringBuilder estudantesFaltosos=new StringBuilder();
            for(int i=0;i<nEstudantes;i++)
            {
                String nome=nomesEstudantes[i];
                String registro=frequenciaEstudantes[i];
                totalAulas=registro.length();
                presencas=0;
                for(char status:registro.toCharArray())
                {
                    if(status=='P')
                    {
                        presencas++;
                    }
                    else if(status=='M')
                    {
                        totalAulas--;
                    }
                }
                if(frequencia<75.0) {
                    if(estudantesFaltosos.length()>0)
                    {
                        estudantesFaltosos.append(" ");
                    }
                    estudantesFaltosos.append(nome);
                }
                if(estudantesFaltosos.length()>0)
                {
                System.out.println("Estudantes Faltosos:"+estudantesFaltosos.toString());
                }
            }
        }
}


