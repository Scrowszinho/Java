/* Luis Gustavo Godoy Camargo */
import java.io.IOException;
import java.util.Scanner;
 
public class Exer23 {
    public static void main(String[] args) throws IOException {
        String re = "";
        Scanner leia = new Scanner(System.in);
        String array[] = new String[2];
        System.out.print("Digite a frase a ser verificada: ");
        re = leia.nextLine();
        for ( int i = 0 ; i < re.length() ; i++ ) {
            array = re.split(" ");
			}	
        
        System.out.print("Ultimo nome: "+array[2]);
        leia.close();
    }
}
