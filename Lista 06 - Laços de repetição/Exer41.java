/* Luis Gustavo Godoy Camargo */
import java.io.IOException;
import java.util.Scanner;

public class Exer41 {
    public static void main(String[] args) throws IOException {
        Scanner leia = new Scanner(System.in);
        int res, a = 1;
            System.out.print("Escreva o valor: ");
            res = leia.nextInt();
           
    do{
        System.out.print(""+res+" * ");
        a*= res;
        res--;
    }while(res >= 1);
    System.out.print(" = " + a);

      leia.close();
    }
}
