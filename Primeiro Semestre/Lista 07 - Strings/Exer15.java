/* Luis Gustavo Godoy Camargo */
import java.io.IOException;
import java.util.Scanner;
 
public class Exer15 {
    public static void main(String[] args) throws IOException {
        String res = "";
        int c = 0;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a frase a ser verificada: ");
        res = leia.nextLine().toUpperCase();
        for ( int v = 0 ; v <= 9 ; v++ ) {
		
			for ( int i = 0 ; i < res.length() ; i++ ) {
			
				if ( res.charAt(i) == v ) {
					c++;
				}
			}
        }	
        System.out.print("\nTotal de números: "+c);

        leia.close();

    }
}
