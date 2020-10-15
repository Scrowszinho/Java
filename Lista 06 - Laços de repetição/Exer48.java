/* Luis Gustavo Godoy Camargo */
import java.util.Scanner;

public class QuantidadeTermosPrimos {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int valor = 0, contador=0,g=1, i=1 ,resultado=1;
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
                items += i+", " ;
                resultado++;
            }
            contador = 0;
            g = 1;
            i++;
        }
        System.out.println(items);
    }
}
