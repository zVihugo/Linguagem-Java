import java.util.Scanner;
import java.util.Random;

public class Aula_25 {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        Random e = new Random();

        boolean acertou = false;
        int tentativa = 10,
        numeroSecreto = e.nextInt();
        long chute = 0;
        
        System.out.println("Bem vindo ao jogo acerte o número");
        while(tentativa > 0 && acertou == false){
            System.out.println("Tentativas restantes: " + tentativa);

            System.out.println("Chute um número: ");
            chute = i.nextInt();

            if(chute == numeroSecreto){
                System.out.println("Parabéns, você é foda!");
                acertou = true;
            }
            else{
                System.out.println("Ih, vocÊ errou!!!");
                if(chute > numeroSecreto){
                    System.out.println("O número secreto é menor que o digitado!!");
                }
                else if(chute < numeroSecreto){
                    System.out.println("O número secreto é maior que o digitado!");
                }
            }
            tentativa--;
        }
        System.out.println("O número secreto é: " + numeroSecreto);
    }
}
