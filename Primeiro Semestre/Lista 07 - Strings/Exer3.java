/* Luis Gustavo Godoy Camargo */
import java.io.IOException;
import java.util.Scanner;

public class Exer3 {
    public static void main(String[] args) throws IOException {
        String res = "";
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite pra ficar em maiusculo: ");
        res = leia.next().toLowerCase();
        System.out.println(res);
        leia.close();
    }
}

