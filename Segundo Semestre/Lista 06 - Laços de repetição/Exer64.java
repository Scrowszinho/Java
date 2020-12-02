/* Luis Gustavo Godoy Camargo */
import java.util.Scanner;

public class QTDTermos4 {
    public static void main(String[] args) throws Exception {
       Scanner input = new Scanner(System.in);
       int termos = 0, proximo=0,atual=0,anterior=1,j=2,g=2,contador=0,primo=0;
       String maisMenos = " + ";
       boolean decisao = false;

       System.out.println("Digite a quantidade de termos: ");
       termos = input.nextInt();

       for(int t = 1; t<=termos;t++){

            proximo=atual+anterior;
            
            while(g>0){
                maisMenos = decisao==true ? " + " :" - ";
                for(int i = 1; i<= g;i++){
                    if( g%i==0 || g/i==g){
                        contador++;
                    }
                }
                if(contador==2){
                    primo = g;
                    break;
                }else{
                    j++;
                    g = j;
                }
                contador=0;
            }
            System.out.print(proximo+"/"+primo+maisMenos);
            anterior=atual;
            atual=proximo;
            decisao = !decisao;
       }
    }
}
