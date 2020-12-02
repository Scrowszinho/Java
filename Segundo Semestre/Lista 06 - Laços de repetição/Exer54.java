/* Luis Gustavo Godoy Camargo */
import java.io.IOException;
import java.util.Scanner;

public class Exer54 {
    public static void main(String[] args) throws IOException {
        Scanner leia = new Scanner(System.in);
        int res,res2, n1 = 0, n2 = 1, n3;
        System.out.print("Escreva o primeiro termo: ");
        res = leia.nextInt();
        System.out.print("Escreva o segundo termo: ");
        res2 = leia.nextInt();
        for (int i = 0; i < res2; i++) {
            n3 = n1 + n2;
            if(n3>=res && n3<= res2){
            System.out.print(" " + n3);
            }
            n1 = n2;
            n2 = n3;
        }

        leia.close();
    }
}
