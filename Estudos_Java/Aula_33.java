public class Aula_33 {
    public static void main(String[] args){
        //Algoritmo de ordenação bubble sort

        int vetor[] = {1,2,3,5,6,8};
        int aux;
        boolean controle;

        for(int i = 0; i < vetor.length; ++i){
            controle = true;
            for(int j = 0; j < (vetor.length - 1); j++){
                if(vetor[j] > vetor[j+1]){
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
            if(controle){
                break;
            }
        }
        
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
    }
}
