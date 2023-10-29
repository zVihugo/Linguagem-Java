import java.util.Scanner;
public class Aula_26 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero de 0 a 10: ");
        int numero = input.nextInt();

        for(int i = 0; i <= 10; ++i){   
            if(i ==  numero){
                System.out.println("O seu numero é " + i);
                break;

            }
            else{
                System.out.println("O seu numero não é " + i);
                continue;
            }
        }
    }
}
