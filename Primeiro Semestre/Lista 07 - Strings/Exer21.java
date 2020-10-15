/* Luis Gustavo Godoy Camargo */
import java.io.IOException;
import java.util.Scanner;
 
public class Exer21 {
    public static void main(String[] args) throws IOException {
        String re = "";
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a frase a ser verificada: ");
        re = leia.nextLine();
        for ( int i = 0 ; i < re.length() ; i++ ) {
            System.out.print(re.charAt(i));
				if (re.charAt(i) == ' '){
                    System.out.println();
				}
			}	
        
       
        leia.close();
    }
}
