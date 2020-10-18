
/* Luis Gustavo Godoy Camargo */
import java.util.Scanner;

public class Exer9 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.print("\nEntre com um número: ");
        int a = leia.nextInt();
        System.out.print("Entre com outro número: ");
        int b = leia.nextInt();
        mmc(a, b);
        leia.close();
    }

    //
    static void mmc(int a, int b) {
        int n = 2, resul = 1;
        while (a != 1 || b != 1) {
			while (a % n != 0 && b % n != 0) {
				n++;
			}
			if (a % n == 0) {
				a = a / n;
			}
			if (b % n == 0) {
				b = b / n;
			}
			resul *= n;
		}
        System.out.println("\nMMC: "+resul);
    }

}
