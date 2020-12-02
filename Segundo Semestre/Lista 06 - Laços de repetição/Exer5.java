/* Luis Gustavo Godoy Camargo */
import java.util.Scanner;
public class Exer5 {
            public static void main(String[] args){
            Scanner leia = new Scanner(System.in);
            int a = 1;
            int n;
            do{
                System.out.print("Digite o valor de n: ");
                n = leia.nextInt();
           }while(n<= 0);
             
           do{               
                    System.out.println(a);
                    a++;
                }while(a <= n);
            
           leia.close();
       }
}