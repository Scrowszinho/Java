/* Luis Gustavo Godoy Camargo */
import java.util.Scanner;

public class InverterPrimos {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int valor = 0, contador=0,g=1, i=1 ,resultado=1, menorValor=2, maiorValor=0;
        String items = " ";

        System.out.println("Digite a quantidade da sequencia: ");
        valor = input.nextInt();

        while(resultado<=valor){
            for(;g<=i;g++){
                if( i%g==0 || i/g==i){
                    contador++;
                }
            }
            if(contador==2){
                if(i>maiorValor){
                    maiorValor = i;
                }
                resultado++;
            }
            contador = 0;
            g = 1;
            i++;
        }
        g = 1;
        for(;maiorValor>=menorValor;maiorValor--){
            for(;g<=maiorValor;g++){
                if( maiorValor%g==0 || maiorValor/g==maiorValor){
                    contador++;
                }
            }
            if(contador==2){
                items += maiorValor+", ";
            }
            contador = 0;
            g = 1;
        }
        System.out.println(items);
    }
}
