public class Aula_29 {
    public static void main(String[] args){
        int a = 10;
        int b = a++;
        ++a; //pré-incremento - adiciona um ao valor 10

        a++; //pós-incremento - adiciona um ao valor 10

        System.out.println(a);
        System.out.println(b);

        //pré-incremento o valor é adicionado primeiro
        //pós-incremento o valor é adicionado depois de atribuido
    }
}   
