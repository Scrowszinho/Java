/* Luis Gustavo Godoy Camargo */
import java.io.IOException;
import java.util.Scanner;
 
public class Exer24 {
        public static void main(String[] args) throws IOException {
        String res = "";
        int c = 0, ct =0;
       
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a frase a ser verificada: ");
        res = leia.nextLine();
        int i = 0, n = res.length();
        while (i < n) {
           c = 0;
            while ((i < n) && (res.charAt(i) == '1')) {
              c = c+ 1;
              i = i + 1;
            }
    
            if (c > ct){
               ct = c;
            }
            i = i + 1;
          }	
            System.out.print("Maior sequencia de 1: "+ct);
        leia.close();
    }
}
