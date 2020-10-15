
/* Luis Gustavo Godoy Camargo */
import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {
        int n1 = 0,n2 = 0,t = 0;
        Scanner leia = new Scanner(System.in);
        do{
        System.out.print("Digite o valor do primeiro número : ");   
        n1 = leia.nextInt();
        System.out.print("Digite o valor do segundo número : ");   
        n2 = leia.nextInt();
        }while(n2<n1);
        
        do{
            t+=n1;
            n1++;
          }while(n1 <= n2);
        System.out.println("Soma dos valores: "+t);
        leia.close();
    }
}
