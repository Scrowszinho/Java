
/* Luis Gustavo Godoy Camargo */
import java.util.Scanner;

public class Exer6{

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.print("Entre com um número: ");
        int a = leia.nextInt();
        System.out.print("Entre com outro número: ");
        int b = leia.nextInt();
        for (int i = a; i <= b; i++) {
            if( primo(i) )
                System.out.print(i + " ");
        }    
    
        leia.close();
    }

    //
    private static boolean primo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    }


}
