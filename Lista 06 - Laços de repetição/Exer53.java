/* Luis Gustavo Godoy Camargo */


public class Exer53 {
    public static void main(String[] args){
        long n1 = 0, n2 = 1, n3;
        for (int i = 1; i < 250; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
