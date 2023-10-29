import java.util.Scanner;

import javax.security.auth.callback.TextOutputCallback;
public class Aula_35 {
   
    public static void main(String[] args){
        final int Total_aluno = 5;
        final int Total_bimestres = 4;
        final double Nota_minina = 70.0;

        Scanner input = new Scanner(System.in);
        String[] nomeAlunos = new String[Total_aluno];
        double[][] notaAlunos = new double[Total_aluno][Total_bimestres];
        double[] mediaAlunos = new double[Total_aluno];

        //Nome dos alunos
        for(int i = 0; i < Total_aluno; i++){
            System.out.println("Informe o nome do " + (i+1) + " aluno: ");
            nomeAlunos[i] = input.nextLine(); 
        }
        
        //Obter nota dos alunos durante os bimestres

        for(int i = 0; i < Total_aluno; i++){
            for(int l = 0; l < Total_bimestres; l++){
                System.out.println("Informe a nota do aluno " + nomeAlunos[i] + " para o " + (l+1) + " bimestre:");
                notaAlunos[i][l] = input.nextDouble();
            }
        }

        //calculo da media dos alunos

        for(int i = 0; i < Total_aluno; i++){
            for(int l = 0; l < Total_bimestres; l++){
                mediaAlunos[i] = notaAlunos[i][l]; 
            }
            mediaAlunos[i]/= Total_bimestres;
        }

        //situacao de cada aluno

        System.out.println("=======RESULTADO FINAL=======");

        for(int i = 0; i < Total_aluno; i++){
            if (mediaAlunos[i] >= Nota_minina){
                System.out.println("O aluno " + nomeAlunos[i] + " foi aprovado, com a média de: " + mediaAlunos[i]);
            }
            else{
                System.out.println("O aluno " + nomeAlunos[i] + " foi reprovado, com a média de: " + mediaAlunos[i]);
            }
        }
    }
}
