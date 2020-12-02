// Luis Gustavo Godoy Camargo
public class UsaLampada {

    public static void main(String[] args){
    Lampada lam;
    int es = (int) (Math.random() * (3 - 1) + 1);
    lam = new Lampada(es);
    lam.lamLampada();   
    
    }
}
