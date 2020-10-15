/* Luis Gustavo Godoy Camargo */

import java.util.Scanner;

public class QTDTermos2 {
    public static void main(String[] args) throws Exception {
       Scanner input = new Scanner(System.in);
       int termos = 0, superior = 2;
       String maisMenos = " + ";
       boolean decisao = true;
       
       System.out.println("Digite a quantidade de termos: ");
       termos = input.nextInt();

       for(int i = 1; i<=termos; i++){
            maisMenos = decisao==true ? " + " :" - ";
            superior *= i;
            System.out.print(i==termos ? superior+"/"+1+"("+(superior+1)+")" : superior+"/"+1+"("+(superior+1)+")"+maisMenos);
            decisao = !decisao;
       }

    }
}
