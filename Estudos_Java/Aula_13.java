import java.util.*;
public class Aula_13 {
    public static void main(String[] args){
        final double PI = 3.1456;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor do raio: ");
        double raio = input.nextDouble();

        double area = (raio * raio) * PI;

        System.out.println("O valor da area é: " + area);
        //Quando adicionamos a palavra final na frente de uma varíavel, ela vira uma constante e segura, impossibilidanto a de ser alterada

    }
}
