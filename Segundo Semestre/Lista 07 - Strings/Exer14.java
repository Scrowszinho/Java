
/* Luis Gustavo Godoy Camargo */
import java.io.IOException;
import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) throws IOException {
        Scanner leia = new Scanner(System.in);
        char caractere = 'a';
        String entrada = "";
        String saida = "";
        System.out.print("Entre com uma frase: ");
        entrada = leia.nextLine().toLowerCase();

        for (int i = 0; i < entrada.length(); i++) {

            if (entrada.charAt(i) == caractere) {
                saida += "*";
            } else {
                saida += entrada.charAt(i);
            }

        }

        System.out.println("\n\tA saida eh: " + saida);
        leia.close();
    }
}
