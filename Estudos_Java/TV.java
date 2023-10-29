public class TV {
    //Representação dos atributos de uma TV

    String fabricante = "Sony";
    int volume = 0;
    int canal = 1;
    boolean ligado = false;
    int polegadas = 32;


    public void aumentarVolume(){
       if(volume >= 10){
        return;
       } 
        volume++;
    }
    
    public void DiminuirVolume(){
        if(volume <= 0){
         return;
        } 
         volume--;
    }

    public void ligar(){
        ligado = true;
    }
    public void desligar(){
        ligado = false;
    }
}
