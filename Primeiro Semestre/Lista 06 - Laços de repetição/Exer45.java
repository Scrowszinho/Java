
/* Luis Gustavo Godoy Camargo */
import java.io.IOException;
import java.util.Scanner;

public class Exer45 {
    public static void main(String[] args) throws IOException {
        Scanner leia = new Scanner(System.in);
        int res = 1, a = 1,c = 1;
        System.out.print("Escreva a quantidade de termos fatoriais: ");
        res = leia.nextInt();
        do{
            System.out.print("" + c + " * ");
            a *= res;
            c++;
            res--;
        }while(res >= 1);
        System.out.print(" = " + a + "\n");
        leia.close();
    }
}