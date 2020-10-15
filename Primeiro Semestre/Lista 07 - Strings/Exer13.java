/* Luis Gustavo Godoy Camargo */
import java.io.IOException;
import java.util.Scanner;
 
public class Exer13{
    public static void main(String[] args) throws IOException {
      	Scanner leia = new Scanner ( System.in );
		
		String vogais = "bcdfghjklmnpqrstvwxyz";
		String entrada = "";
		int contador = 0;

		System.out.print("Entre com uma frase: ");
		entrada = leia.nextLine();
		
		entrada = entrada.toLowerCase();
		
		for ( int v = 0 ; v < vogais.length() ; v++ ) {
		
			for ( int i = 0 ; i < entrada.length() ; i++ ) {
			
				if ( entrada.charAt(i) == vogais.charAt(v) ) {
					contador++;
				}
			}
		}		

		System.out.println("Foram encontradas " + 
						   (entrada.length() - contador) + 
						   " consoantes");
        leia.close();
    }
}
