// Luis Gustavo Godoy Camargo
public class UsaLampada {

    public static void main(String[] args){
    Lampada led;
    led = new Lampada("Fiat Lux", "Super Led", "Led", true);
    System.out.println("Marca: "+led.marca);
    System.out.println("Modelo: "+led.modelo);
    System.out.println("Tipo: "+led.tipo);
    if(led.on == true){
        System.out.println("Led está ligado");
    }
    else{
        System.out.println("Led está desligado");   
    }
    }

}
