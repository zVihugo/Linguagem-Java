import java.util.*;

public class Aula_14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Gramas: ");
        int grama = input.nextInt();

        int Conversor = grama/1000;
        grama = grama % 1000;

        System.out.println("O total de kilos é: "+ Conversor);
        System.out.println("O total de gramas é: "+ grama);

        System.out.println();
    }
}
