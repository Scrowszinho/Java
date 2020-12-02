/* Luis Gustavo Godoy Camargo */
import java.io.IOException;
import java.util.Scanner;
 
public class Exer9 {
    public static void main(String[] args) throws IOException {
        String res = "", re = "";
        int c = 0;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a frase a ser verificada: ");
        re = leia.nextLine();
        for ( int i = 0 ; i < re.length() ; i++ ) {
				if (re.charAt(i) == ' '){
					c++;
				}
			}	

        System.out.print("Total de espaços"+res+": "+c);
        leia.close();
    }
}
