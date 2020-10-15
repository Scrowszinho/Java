/* Luis Gustavo Godoy Camargo */
import java.io.IOException;
import java.util.Scanner;
 
public class Exer12{
    public static void main(String[] args) throws IOException {
        String res = "";
        String vogais = "aeiou";
        int c = 0;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a frase a ser verificada: ");
        res = leia.nextLine();
        for ( int v = 0 ; v < vogais.length() ; v++ ) {
		
			for ( int i = 0 ; i < res.length() ; i++ ) {
			
				if ( res.charAt(i) == vogais.charAt(v) ) {
					c++;
				}
			}
		}		

        System.out.print("Total de vogais: "+c);
        leia.close();
    }
}
