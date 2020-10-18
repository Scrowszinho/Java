
/* Luis Gustavo Godoy Camargo */
import java.util.Scanner;

public class Exer2 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int num;
        String s;
        System.out.print("[C]Celsius, [F] Fahrenheit e [S] Sair:");
        System.out.print("\nEntre com sua opção: ");
        s = leia.next();
        if (s.equals("c")) {
            System.out.print("Entre com temperatura em Celsius: ");
            num = leia.nextInt();
            celsiuFah(num);
        } else if (s.equals("f")) {
            System.out.print("Entre com temperatura em Fahrenheit: ");
            num = leia.nextInt();
            fahCel(num);
        } else if (s.equals("s")) {

        } else {
            System.out.print("Opção Inválida!");
        }

        leia.close();
    }

    //
    static void celsiuFah(int c) {
        System.out.print("A temperatura em Fahrenheit é: " + ((9 * c / 5) + 32));
    }

    static void fahCel(int c) {
        System.out.print("A temperatura em Celsius é: " + (5 * (c - 32) / 9));
    }

}
