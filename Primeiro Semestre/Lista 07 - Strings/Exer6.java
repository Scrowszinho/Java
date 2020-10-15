/* Luis Gustavo Godoy Camargo */
import java.io.IOException;
import java.util.Scanner;
 
public class Exer6 {
    public static void main(String[] args) throws IOException {
        String res = "", re = "";
        int c = 0;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a letra para ser verificada: ");
        res = leia.nextLine();
        System.out.print("Digite a frase a ser verificada: ");
        re = leia.nextLine();
        for ( int v = 0 ; v < re.length() ; v++ ) {
		
			for ( int i = 0 ; i < res.length() ; i++ ) {
			
				if ( res.charAt(i) == re.charAt(v) ) {
					c++;
				}
			}
		}		

        System.out.print("Total de "+res+": "+c);
        leia.close();
    }
}
