/* Luis Gustavo Godoy Camargo */
import java.util.Scanner;
public class Exer22 {
            public static void main(String[] args){
            Scanner leia = new Scanner(System.in);
            int n, c = 0,ma = 0;
            Double me = 0.;
            do{
            System.out.print("Digite o valor do produto: ");
            n = leia.nextInt();
            c++;
            if (ma < n) {
                ma = n;
            }
            me += n;
            }while(c<15);
            System.out.println("Maior valor lido: "+ma);
            System.out.println("Média dos valores : "+me/15);


           leia.close();
       }
}