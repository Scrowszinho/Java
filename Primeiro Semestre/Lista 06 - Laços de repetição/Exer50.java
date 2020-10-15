/* Luis Gustavo Godoy Camargo */
import java.util.Scanner;

public class TermoEPrimo {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int termoInicial = 0, quantidadeTermos=0,g=1,contador=0,limitador=0;
        String items = " ";

        System.out.println("Digite o termo inicial: ");
        termoInicial = input.nextInt();

        System.out.println("Digite a quaantidade de termos: ");
        quantidadeTermos = input.nextInt();

        while(limitador<=quantidadeTermos){
            for(;g<=termoInicial;g++){
                if( termoInicial%g==0 || termoInicial/g==termoInicial){
                    contador++;
                }
            }
            if(contador==2){
                items += termoInicial+", ";
                limitador++;
            }
            if(limitador==quantidadeTermos){
                break;
            }
            contador = 0;
            g=1;
            termoInicial++;
        }
        System.out.println(items);
    }
}
