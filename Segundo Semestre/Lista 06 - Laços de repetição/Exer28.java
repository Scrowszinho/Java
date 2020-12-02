/* Luis Gustavo Godoy Camargo */
public class Exer28 {
    public static void main(String[] args) {
        int a = 1, b = 1, c = 10;
        do {
            System.out.printf("" + a + ",");
            do {
                b++;
                System.out.printf(" " + b + " ");
            } while (b < c);

            b = a + 1;
            a++;

            System.out.println("");
        } while (a < 11);
    }
}