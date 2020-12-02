/* Luis Gustavo Godoy Camargo */

import java.util.Scanner;

public class QuantitadePerfeitos {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int valor = 0,contador = 0, i=1, j=1,valorFinal=0 ;

        System.out.println("Digite a quantidade de números perfeitos: ");
        valor = input.nextInt();

        while(contador<valor){
            for(; j<i;j++){
                if(i%j==0){
                    valorFinal += j;
                }
            }
            if(valorFinal==i){
                System.out.print(valorFinal+", ");
                contador++;
            }
            j = 1;
            valorFinal = 0;
            i++;
        }
    }
}
