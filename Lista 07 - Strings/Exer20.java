/* Luis Gustavo Godoy Camargo */
import java.io.IOException;
import java.util.Scanner;
 
public class Exer20 {
    public static void main(String[] args) throws IOException {
        String re = "";
        int c = 1;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a frase a ser verificada: ");
        re = leia.nextLine();
        for ( int i = 0 ; i < re.length() ; i++ ) {
				if (re.charAt(i) == ' '){
					c++;
				}
			}	
        
        System.out.print("Total de palavras na frase: "+c);
        leia.close();
    }
}
