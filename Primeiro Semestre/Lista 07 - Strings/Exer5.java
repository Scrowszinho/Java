/* Luis Gustavo Godoy Camargo */
import java.io.IOException;
import java.util.Scanner;
 
public class Exer5 {
    public static void main(String[] args) throws IOException {
        String res = "";
        int c = 0;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite: ");
        res = leia.nextLine();
        for ( int i = 0 ; i < res.length() ; i++ ) {
        if (res.charAt(i) == 'a')
        {
        c++;    
        }
        }
        System.out.print("Total de a: "+c);
        leia.close();
    }
}
