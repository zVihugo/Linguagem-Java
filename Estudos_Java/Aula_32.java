public class Aula_32{
    public static void main(String[] args){
        int i;
        int[] x = new int[5];


        //esse método abaixo, é utilizado para jogar valores ao seu vetor
        java.util.Arrays.fill(x, 2, 5, 3);

        for(i = 0; i < x.length; ++i){
            System.out.println(x[i]);
        }
    }
}

//length equivale ao tamanho do vetor