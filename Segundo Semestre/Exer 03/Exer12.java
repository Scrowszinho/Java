
/* Luis Gustavo Godoy Camargo */
import java.util.Scanner;

public class Exer12 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        double num;

        System.out.print("Entre com um numero: ");
        num = leia.nextDouble();
        if (num <= 0) {
            System.out.print("Erro! Valor inválido.");

        } else {
            perfeito(num);
        }

        leia.close();
    }

    //
    static void perfeito(double x) {
        
        for (int i=1;i<=x;i++) 
        { 
          int soma=0; 
          for (int j=1;j<i;j++) {
            if (i%j==0)  
            soma=soma+j; 
          } 
        if (soma==i){ 
            System.out.printf("%d ",i); 
        }    
    }

    }

}
