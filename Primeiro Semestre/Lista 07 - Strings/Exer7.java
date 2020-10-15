/* Luis Gustavo Godoy Camargo */
import java.io.IOException;
import java.util.Scanner;

public class Exer7 {
    public static void main(String[] args) throws IOException {
        String entrada = "";
		int contador = 0;
        Scanner leia = new Scanner(System.in);
		System.out.print("Entre com uma frase: ");
		entrada = leia.nextLine().toLowerCase();
		
		for ( int caractere = 'a' ; caractere <= 'z' ; caractere++ ) {
			
			contador = 0;
			
			for ( int i = 0 ; i < entrada.length() ; i++ ) {
			
				if ( entrada.charAt(i) == caractere ) {
					contador++;
				}
			}
			
			if ( contador > 0 ) {
				System.out.println("Foram encontrados " + contador + 
								   " caracteres '" + (char)caractere + "'");
			}
		}
        leia.close();
    }
}

