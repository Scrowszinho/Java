/* Luis Gustavo Godoy Camargo */

public class Exer56 {
    public static void main(String[] args){
        int a = 0,b = 1, c = 0;
        do{
            c = b;
        do {
            a++;
            if (c % a == 0) {
                c += a;
                if( c == b ){System.out.println(c);}
            }
        }while(a != b);
        b++;
        a = 1;
        }while(b<900);
        
     

    }
}
