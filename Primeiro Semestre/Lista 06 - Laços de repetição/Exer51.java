/* Luis Gustavo Godoy Camargo */
import java.io.IOException;
import java.util.Scanner;

public class Exer51 {
    public static void main(String[] args) throws IOException {
        Scanner leia = new Scanner(System.in);
        int res, n1 = 0, n2 = 1, n3;
        System.out.print("Escreva a quantidade de termos: ");
        res = leia.nextInt();
        for (int i = 0; i < res; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }

        leia.close();
    }
}
