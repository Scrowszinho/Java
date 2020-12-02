
/* Luis Gustavo Godoy Camargo */
import java.util.Scanner;

public class Exer21 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int c = 0, ma = 0, n, na;
        double me = 0.;
        System.out.print("Digite um valor de números a ser lidos: ");
        n = leia.nextInt();
        do {
            System.out.print("Digite um valor: ");
            na = leia.nextInt();
            c++;
            if (ma < n) {
                ma = na;
            }
            me += na;
        } while (c < n);
        System.out.println("\nMaior valor: " + ma);
        System.out.println("Média dos valores: " + me / n);
        leia.close();
    }
}