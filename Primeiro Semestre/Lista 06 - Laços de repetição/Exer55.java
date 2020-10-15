
/* Luis Gustavo Godoy Camargo */
import java.io.IOException;
import java.util.Scanner;

public class Exer55 {
    public static void main(String[] args) throws IOException {
        Scanner leia = new Scanner(System.in);
        int res = 0, a = 0, b = 0;
        System.out.print("Digite um valor a ser verificado: ");
        res = leia.nextInt();
        do {
            a++;
            if (res % a == 0) {
                b += a;
                System.out.println(a);
            }
        } while (b != res);
        if (b == res) {
            System.out.println("Valor digitado é um número perfeito");
        } else {
            System.out.println("Valor digitado não é um número perfeito");
        }
        leia.close();
    }
}
