
/* Luis Gustavo Godoy Camargo */
import java.io.IOException;
import java.util.Scanner;

public class Exer19 {
    public static void main(String[] args) throws IOException {
        Scanner leia = new Scanner(System.in);
        Double vm, mt = 0.;
        int es = 0, c = 0,est = 0;
        char res;
        do {
            System.out.print("Escreva a quantidade do valor em estoque: ");
            es = leia.nextInt();
            System.out.print("Escreva o valor de cada mercadoria: ");
            vm = leia.nextDouble();
            c++;
            mt += es*vm;
            est+= es;
            System.out.print("\nMais mercadorias?(s/n) : ");
            res = (char) System.in.read();
        } while (res == 's');
        System.out.println("\nMercadoria em estoque: " + est);
        System.out.println("Média de preço da mercadoria: " + mt/c);
        leia.close();
    }
}
