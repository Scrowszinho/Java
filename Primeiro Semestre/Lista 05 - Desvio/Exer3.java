 /* Luis Gustavo Godoy Camargo */
import java.util.Scanner;
public class Exer3 {
            public static void main(String[] args){
            Scanner leia = new Scanner(System.in);
            System.out.print("Digite a quantidade: ");
            Double op = leia.nextDouble();
            if (op > 0 && op < 12){System.out.println("Total a ser pago:R$ "+op*1.3);}
            else {System.out.println("Total a ser pago:R$ "+op*1.0);}
        }
}

