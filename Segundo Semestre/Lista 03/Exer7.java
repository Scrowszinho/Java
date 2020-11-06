
/* Luis Gustavo Godoy Camargo */
import java.util.Scanner;

public class Exer7 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.print("\nEntre com um número: ");
        int a = leia.nextInt();
        System.out.print("Entre com outro número: ");
        int b = leia.nextInt();
        mdc(a, b);
        leia.close();
    }

    //
    static void mdc(int a, int b) {
        int resto = 0;
        while (b != 0) {
            resto = a % b;
            a = b;
            b = resto;
        }
        System.out.println("\nMDC: "+a);
    }

}
