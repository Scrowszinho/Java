
/* Luis Gustavo Godoy Camargo */
import java.util.Scanner;

public class Exer20 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int c = 0, ma = 0, me = 0, n;
        do {
            System.out.print("Digite um valor: ");
            n = leia.nextInt();
            c++;
            if (ma < n) {
                ma = n;
            }
            if (me > n) {
                me = n;
            }
        } while (c < 100);
        System.out.println("\nMaior valor: " + ma);
        System.out.println("Menor valor: " + me);
        leia.close();
    }
}