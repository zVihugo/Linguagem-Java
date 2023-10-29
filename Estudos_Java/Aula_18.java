import java.util.*;

public class Aula_18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o seu nome? ");
        String nome = input.next();

        System.out.println("Qual a sua idade? ");
        int idade = input.nextInt();

        if(idade >= 18){
            System.out.println("Olá " + nome + ", que legal, você é maior de idade");
        }

        else if(idade<18){
            System.out.println("Olá " + nome + ", você é menor de idade");
        }
    }
}
