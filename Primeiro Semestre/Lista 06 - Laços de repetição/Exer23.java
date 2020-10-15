/* Luis Gustavo Godoy Camargo */
public class Exer23 {
    public static void main(String[] args) {
        int a = 1, b = 0;
        do {
            do {
                System.out.printf("%d x %d = %d\n", a, b, a * b);
                b++;
            } while (b < 11);
            b = 0;
            a++;
            System.out.println("******************");
        } while (a < 11);
    }
}