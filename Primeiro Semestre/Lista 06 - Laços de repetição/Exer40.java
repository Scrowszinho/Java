/* Luis Gustavo Godoy Camargo */
import java.io.IOException;
import java.util.Scanner;

public class Exer40 {
    public static void main(String[] args) throws IOException {
        Scanner leia = new Scanner(System.in);
        int res, a = 1, b = 0,c = 0;
        do {
            System.out.print("Escreva o valor: ");
            res = leia.nextInt();
            if(res<0){
                System.out.println("Digite um valor positivo");
            }
        } while (res <= 0);
    do{
        if(a<res/2){
        System.out.print(" "+a);
        a++;
        }
        c = a;
        
     
         if(c>=res/2){
            System.out.print(" "+c);
            c--;   
        }
        b++;
    }while(b<res);


      leia.close();
    }
}
