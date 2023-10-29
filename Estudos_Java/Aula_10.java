import java.util.*;
public class Aula_10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        final double PI = 3.1456;

        System.out.println("Informe o valor do raio: ");
        double raio = input.nextDouble();

        double CalArea = (raio * raio) * PI;

        System.out.println("O valor da area eh: "+ CalArea);
    }
}
