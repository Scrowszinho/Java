    /* Luis Gustavo Godoy Camargo */
import java.util.Scanner;
public class Exer7 {
            public static void main(String[] args){
            Scanner leia = new Scanner(System.in);
            int a = 1;
            int n;
            do{
                System.out.print("Digite o valor de n: ");
                n = leia.nextInt();
           }while(n < 1 || n > 10);
             
           do{               
            System.out.printf("%d X %d = %d\n",n,a,a*n);
                    a++;
                }while(a <= 10);
           leia.close();
       }
}
  