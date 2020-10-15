/* Luis Gustavo Godoy Camargo */
import java.io.IOException;
import java.util.Scanner;

public class Exer4 {
    public static void main(String[] args) throws IOException {
        String res = "";
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite números: ");
        res = leia.next();
        for ( int i = 0 ; i < res.length() ; i++ ) {
        System.out.println(res.charAt(i));
        }
        leia.close();
    }
}

