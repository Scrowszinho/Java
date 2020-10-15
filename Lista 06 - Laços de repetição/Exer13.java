
/* Luis Gustavo Godoy Camargo */
import java.util.Scanner;

public class Exer13 {
    public static void main(String[] args) {
        int c = 1, n = 0, t = 0;
        Scanner leia = new Scanner(System.in);
        do {
            System.out.print("Digite um valor: ");
            n = leia.nextInt();
            if(n<40){t +=n;}
            c++;
        } while (c < 11);
        System.out.print("Soma dos valores menores que 40: "+t);
        leia.close();
        
    }
}
