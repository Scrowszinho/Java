/* Luis Gustavo Godoy Camargo */
import java.io.IOException;
import java.util.Scanner;

public class Exer43 {
    public static void main(String[] args) throws IOException {
        Scanner leia = new Scanner(System.in);
        int res = 1, a = 1, c = 1, d = 0;
       
        do {
        System.out.print("Escreva a quantidade de fatoriais: ");
        res = leia.nextInt();
        c = res;
        do{
            System.out.print("" + c + " * ");
            a *= c;
            c--;
        }while(c >= 1);
        System.out.print(" = " + a + "\n");
        a = 1;
        res--;
        d ++;
        } while (d<7);
        leia.close();
    }
}
