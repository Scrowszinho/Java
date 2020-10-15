/* Luis Gustavo Godoy Camargo */
import java.util.Scanner;

public class QTDTermos3 {
    public static void main(String[] args) throws Exception {
       Scanner input = new Scanner(System.in);
       int termos = 0, proximo=0,atual=0,anterior=1,j=2,g=2,contador=0,primo=0;

       System.out.println("Digite a quantidade de termos: ");
       termos = input.nextInt();

       for(int t = 1; t<=termos;t++){

            proximo=atual+anterior;
            
            while(g>0){
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
            System.out.print(proximo+"/"+primo+" ");
            anterior=atual;
            atual=proximo;
       }
    }
}
