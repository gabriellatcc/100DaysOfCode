package day09;
import java.util.Scanner;
public class Students
{
    private int i,j,n,studants,sumScoresKristen,sumScoresOthers,largerScores;
    private int [][] scores;
    private Scanner e;
        public Students()
        {
            sumScoresKristen=sumScoresOthers=largerScores=0;
            e=new Scanner(System.in);
        }
        public void readIntegers()
        {
            System.out.println("Enter the number of studants (including Kristen): ");
            setStudants(e.nextInt());//setter para validar entrada
            for(i=0;i<studants;i++)
            {
                for(j=0;j<5;j++)
                {
                    System.out.println("Enter the "+(j+1)+"st grade of the studant "+(i+1)+": ");
                    n=e.nextInt();
                        if(n<0||n>100)
                        {
                        System.out.println("Enter the grade number between 0 and 100: ");
                        }
                    scores[i][j]=n;
                }
            }
        }

        public int calculateTotalScore()
        {
            for(j=0;j<5;j++)
            {
                sumScoresKristen+=scores[0][j];
            }
            for(i=1;i<studants;i++)
            {
                for(j=0;j<5;j++)
                {
                    sumScoresOthers+=scores[i][j];
                }
                if(sumScoresOthers>sumScoresKristen)
                {
                    largerScores++;
                }
                sumScoresOthers=0;//reseta para o proximo estudante
            }

            return largerScores;
        }
        
        public void printAwnser()
        {
            System.out.println("Number os students with a higher score than kristen: "+largerScores);
        }
        
        public int getStudants()
        {
            return studants;
        }
        public void setStudants(int studants)
        {
            if(studants<1 || studants>100)
            {
              throw new IllegalArgumentException("Number of students must be between 1 and 100.");
            }
            this.studants=studants;
            this.scores=new int[studants][5];//reinicia o array de pontos quando o numero de estudantes muda
        }

        public int[][] getScores()
        {
            int[][] copy=new int[studants][5];
            for(i=0;i<studants;i++)
            {
                System.arraycopy(scores[i],0,copy[i],0,5);
            }
            return copy;
        }
        public void setScores(int[][] scores)
        {
            if(scores.length!=studants || scores[0].length!= 5)
            {
            throw new IllegalArgumentException("Scores array dimensions must match the number of students and 5 grades.");
            }
            this.scores=scores;
        }

        public int getSumScoresKristen()
        {
            return sumScoresKristen;
        }
        public void setSumScoresKristen(int sumScoresKristen)
        {
            if(sumScoresKristen<0)
            {
            throw new IllegalArgumentException("Sum of scores cannot be negative.");
            }
            this.sumScoresKristen=sumScoresKristen;
        }

        public int getSumScoresOthers()
        {
            return sumScoresOthers;
        }
        public void setSumScoresOthers(int sumScoresOthers)
        {
            if(sumScoresOthers<0)
            {
            throw new IllegalArgumentException("Sum of scores cannot be negative.");
            }
            this.sumScoresOthers=sumScoresOthers;
        }

        public int getLargerScores()
        {
            return largerScores;
        }
        public void setLargerScores(int largerScores) 
        {
            if(largerScores<0)
            {
            throw new IllegalArgumentException("Number of students with higher scores cannot be negative.");
            }
            this.largerScores=largerScores;
        }

        public static void main(String[] args)
        {
            Students test01=new Students();
                test01.readIntegers();
                test01.calculateTotalScore();
                test01.printAwnser();
        }
}
