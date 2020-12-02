/* Luis Gustavo Godoy Camargo */
public class Exer29 {
    public static void main(String[] args) {
        int a = 1, c = 1;
        do {
            System.out.printf("" + a + ",");
            do {
                System.out.printf(" " + c + " ");
                c +=2;
            } while (c < 11);
            a++;
            c = a;
            System.out.println("");
        } while (a < 11);
    }
}