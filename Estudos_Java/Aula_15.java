import javax.net.ssl.HostnameVerifier;

public class Aula_15 {
    public static void main(String[] args){
        long totalMilisegundos = System.currentTimeMillis() - 10800000;
        
        long totalSegundo = totalMilisegundos/ 1000;
        long segundoAtual = totalSegundo % 60;
        
        long totalMinutos = totalSegundo / 60;
        long minutoAtual = totalMinutos % 60;

        long totalHora = totalMinutos / 60;
        long horaAtual = totalHora % 24;

        System.out.println(horaAtual + ":" + minutoAtual + ":" + segundoAtual);

    }
}

//O método currenTime Millis retorna a quantidade de milisegundos que foram passados a meia noite desde 1970
