/* Luis Gustavo Godoy Camargo */
import java.io.IOException;
import java.util.Scanner;

 
public class Exer22 {
    public static void main(final String[] args) throws IOException {
        String res = "", ana = "ana";
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite: ");
        res = leia.nextLine();
        leia.close();
        int ct = 0;
      int n = res.length();
      int m = ana.length(), i, j;
      for (i=0; i<n; i++) {

        if (Character.toUpperCase(res.charAt(i)) == Character.toUpperCase(ana.charAt(0))) {
           j = 1;
           while (((i+j) < n) && (j < m) && (Character.toUpperCase(res.charAt(i+j)) == Character.toUpperCase(ana.charAt(j)))) {

             j = j + 1; // proximo caractere da palavra

             if (j == m)
                ct = ct + 1; // encontrou uma ocorrencia da palavra na frase
           }
        }
      }

      System.out.printf("\nA palavra foi encontrada %d vezes na frase.\n", ct);
        
    }
}
