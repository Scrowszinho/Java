/* Luis Gustavo Godoy Camargo */
import java.io.IOException;
import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args) throws IOException {
        String res = "";
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite pra ficar em maiusculo: ");
        res = leia.next().toUpperCase();
        System.out.println(res);
        leia.close();
    }
}

