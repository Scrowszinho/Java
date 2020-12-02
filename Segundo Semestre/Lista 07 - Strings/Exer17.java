/* Luis Gustavo Godoy Camargo */
import java.io.IOException;
import java.util.Scanner;
 
public class Exer17 {
    public static void main(String[] args) throws IOException {
        String res = "" , re = "";
        int c = 0, i = 0;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a frase a ser verificada: ");
        res = leia.nextLine();
        System.out.print("Digite a segunda frase a ser verificada: ");
        re = leia.nextLine();
        if(re.length() == res.length()){
        do{
			
				if ( res.charAt(i) == re.charAt(i) ) {
				c++;
				}
            i++;    
            }while(i <res.length());		
                }
        if(c == res.length()){
        System.out.print("As frases são iguais");
        }
        leia.close();
    }
}
