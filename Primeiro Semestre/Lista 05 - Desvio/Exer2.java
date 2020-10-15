/* Luis Gustavo Godoy Camargo */
import java.util.Scanner;
public class Exer2{
            public static void main(String[] args){
            Scanner leia = new Scanner(System.in);
            System.out.print("Digite seu número: ");
            int op = leia.nextInt();
            if (op >= 0){System.out.println("Número positivo");}
            else {System.out.println("Número negativo");}
        }
}
