import java.util.Scanner;
public class Aula_30 {
    public static void main(String[] arg){
        //vetores

        Scanner input = new Scanner(System.in);

        int numAlunos = 5;
        double[] notaAlunos = new double[numAlunos]; //Declaração de um vetor

        for(int i = 0; i < numAlunos; i++){
            System.out.println("Digite a nota do " + (i+1) + " aluno");
            notaAlunos[i] = input.nextDouble();
        }
        for(int i = 0; i < numAlunos; i++){
            System.out.println("Nota do " + (i + 1) + "º aluno: " + notaAlunos[i]);
        }
    }
}
