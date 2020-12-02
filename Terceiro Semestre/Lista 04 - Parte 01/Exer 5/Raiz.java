// Luis Gustavo Godoy Camargo
public class Raiz {
    int a;
    int b;
    int c;
    int d;
    public Raiz(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

private void raiDelta() {
    this.d = (b*b)-(4*a*c);
}

public void raiRaiz(){
    raiDelta();
   if(this.d<0){
    System.out.println("Delta negativo.");   
   } 
   else if(this.d == 0){
    System.out.println("Equação:" + (-b+d)/(2*a));   
   }
   else{
    d = (int) Math.sqrt(d);
    System.out.println("Equação positiva:" + (-b+d)/(2*a));    
    System.out.println("Equação negativa:" + (-b-d)/(2*a));    

   }

}


}