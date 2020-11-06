
/* Luis Gustavo Godoy Camargo */
import java.util.Scanner;

public class Exer3 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        double num;
        String s;
        System.out.print("[C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair:");
        System.out.print("\nEntre com sua opção: ");
        s = leia.next();
        //
        if (s.equals("c")) {
            System.out.print("Entre com temperatura em Celsius: ");
            num = leia.nextDouble();
            celsiuFah(num);
            kelvin(num);
        } 
        //

        else if (s.equals("f")) {
            System.out.print("Entre com temperatura em Fahrenheit: ");
            num = leia.nextInt();
            fahCel(num);
            num = (num - 32) * 5/9;
            kelvin(num);
        }
        //
         else if (s.equals("k")) {
            System.out.print("Entre com temperatura em Kelvin: ");
            num = leia.nextInt();
            num = num - 273.15;
            System.out.println("Celsius: "+num);
            celsiuFah(num);
        }
        //
         else if (s.equals("s")) {

        } else {
            System.out.print("Opção Inválida!");
        }

        leia.close();
    }

    //
    static void celsiuFah(double num) {
        System.out.println("A temperatura em Fahrenheit é: " + ((9 * num / 5) + 32));
    }

    static void fahCel(double num) {
        System.out.println("A temperatura em Celsius é: " + (5 * (num - 32) / 9));
    }
    static void kelvin(double num) {
        System.out.println("A temperatura em Kelvin é: " + (num + 273));
    }

}
