public class Aula_42 {
    public static void main(String[] args){

        TV tele = new TV();
        tele.ligar();
        tele.aumentarVolume();
        tele.aumentarVolume();

        System.out.println("Esta televisão é da marca " + tele.fabricante + ". A televisão está " + (tele.ligado == true? "ligada" : "desligada") + " , e o volume é " + tele.volume);
        

    }
}
