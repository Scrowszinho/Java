
/* Luis Gustavo Godoy Camargo */
import java.io.IOException;
import java.util.Scanner;

public class Exer44 {
    public static void main(String[] args) throws IOException {
        Scanner leia = new Scanner(System.in);
        int res = 1, a = 1;
        System.out.print("Escreva a quantidade de termos fatoriais: ");
        res = leia.nextInt();
        do{
            System.out.print("" + res + " * ");
            a *= res;
            res--;
        }while(res >= 1);
        System.out.print(" = " + a + "\n");
        leia.close();
    }
}