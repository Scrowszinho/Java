/* Luis Gustavo Godoy Camargo */

public class Exer42 {
    public static void main(String[] args) {
        int res = 1, a = 1, c = 1;
        do {
            do {
                System.out.print("" + res + " * ");
                a *= res;
                res--;
            } while (res >= 1);
            System.out.print(" = " + a + "\n");
            a = 1;
            c++;
            res = c;
        } while (c <= 10);

    }
}
