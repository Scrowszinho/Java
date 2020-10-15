/* Luis Gustavo Godoy Camargo */
import java.io.IOException;
import java.util.Scanner;

public class Exer39 {
    public static void main(String[] args) throws IOException {
        Scanner leia = new Scanner(System.in);
        int res, a = 0,b = 1;
        double r = 0.0;
        do {
            System.out.print("Escreva o valor: ");
            res = leia.nextInt();
            if(res<0){
                System.out.println("Digite um valor positivo");
            }
        } while (res <= 0);
        System.out.print(" "+a);
        a = res;
    do{
        System.out.print(b+"/"+a+" + "); 
        r+= b/a;
        a--;
        b++;
    }while(b<=res);
    System.out.println("\nCalculo final: "+r);

      leia.close();
    }
}
