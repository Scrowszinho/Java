// Luis Gustavo Godoy Camargo
public class Comanda{
    float pre;
    int tp;
    boolean sn;


public Comanda(float pre, int tp, boolean sn2 ) {
    this.pre = pre;
    this.tp = tp;
    this.sn = sn2;
}
public float comCom () {
    if(this.sn == true){
     return (float) ((this.pre / this.tp) * 1.1);
    }
    else{
        return (float) ((this.pre / this.tp) );   
    }
    }

}