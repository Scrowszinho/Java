/* Luis Gustavo Godoy Camargo */
import java.util.Scanner;
public class Exer4 {
            public static void main(String[] args){
            Scanner leia = new Scanner(System.in);
            System.out.print("Digite o valor de n: ");
            int n = leia.nextInt();
            int a = 1;
            if(n == 1 ){
            System.out.println("Valor Invalido");
            }
            else if(n>0){
                do{
                
                    System.out.println(a);
                    a++;
                }while(a <= n);
            }
           leia.close();
       }
}