
/* Luis Gustavo Godoy Camargo */
import java.util.Scanner;

public class Exer11 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        double num;

        System.out.print("Entre com um numero: ");
        num = leia.nextDouble();
        boolean perf = perfeito(num);
        if (perf == true) {
            System.out.print("Número " + num + " é perfeito");
        } else {
            System.out.print("Número " + num + " não é perfeito");
        }

        leia.close();
    }

    //
    static boolean perfeito(double x) {
        int valor = 0;
        for (int j = 1; j < x; j++) {

            if (x % j == 0)
                valor += j;

        }
        if (valor == x){
            return true;
        }
        else{
            return false;
        }
    }

}
