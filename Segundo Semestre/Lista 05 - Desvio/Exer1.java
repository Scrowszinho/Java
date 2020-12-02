/* Luis Gustavo Godoy Camargo */
import java.util.Scanner;
public class Exer1{
            public static void main(String[] args){
            Scanner leia = new Scanner(System.in);
            System.out.print("Digite seu número: ");
            int op = leia.nextInt();
            if (op > 10){System.out.println("Número maior que 10");}
            else {System.out.println("Número menor que 10");}
        }
}