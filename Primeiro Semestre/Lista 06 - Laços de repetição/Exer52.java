
/* Luis Gustavo Godoy Camargo */
import java.io.IOException;
import java.util.Scanner;

public class Exer52 {
    public static void main(String[] args) throws IOException {
        Scanner leia = new Scanner(System.in);
        int res, n1 = 0, n2 = 1, n3;
        System.out.print("Escreva o número a ser verificado: ");
        res = leia.nextInt();
        for (int i = 0; i < res; i++) {
            n3 = n1 + n2;
            if (n3 == res) {
                System.out.print("Número faz parte da sequência");
            }
            n1 = n2;
            n2 = n3;
        }

        leia.close();
    }
}
