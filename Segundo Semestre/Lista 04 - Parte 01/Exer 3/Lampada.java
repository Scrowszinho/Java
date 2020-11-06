// Luis Gustavo Godoy Camargo
public class Lampada {
    int es;

    public Lampada(int es) {
        this.es = es;
    }

public void lamLampada () {
    if(this.es == 0){
    System.out.println("Lampada ligada");
    }
    else if(this.es == 1){
        System.out.println("Lampada desligada");
        }
        else{
            System.out.println("Meia luz");
            }
}

}