/* Luis Gustavo Godoy Camargo */
import java.io.IOException;
import java.util.Scanner;
 
public class Exer18 {
    public static void main(String[] args) throws IOException {
        String res = "";
        int c = 0;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a frase a ser verificada: ");
        res = leia.nextLine();
     
			for ( int i = 0 ; i < res.length() ; i++ ) {
				if ( res.charAt(i) == '1' || res.charAt(i) == '0' ) {
					c++;
                }
		}		
        if(c == res.length()){
        System.out.print("É uma sequência de 8bit’s");
        }
        else{
            System.out.print("Não é uma sequência de 8bit’s");
        }
        leia.close();
    }
}
