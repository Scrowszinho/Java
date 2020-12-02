/* Luis Gustavo Godoy Camargo */
public class Exer26 {
    public static void main(String[] args) {
        int a = 1, b = 1,c = 2;
        do {
        System.out.printf(""+a+",");
        do{
            System.out.printf(" "+b+" ");
            b++;
         }while(b<c);
         b = 1;
         c++;
     a++;   
     System.out.println("");
     }while(a<11);
    }
}