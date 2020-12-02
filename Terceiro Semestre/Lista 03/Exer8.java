/* Luis Gustavo Godoy Camargo */
import java.util.Scanner;

public class Exer8 {    
        
        public static void main(String[] args) {
            Scanner leia = new Scanner(System.in);
            System.out.print("\nEntre com um número: ");
            int a = leia.nextInt();
            int[] b = new int [a];
            for(int i = 0 ; i <a; i++){
            System.out.print("Entre com um número: ");
            b[i] = leia.nextInt();
            if(b[i]<0){
            System.out.print("\nNúmero negativo, digite outro\nEntre com um número: ");
            b[i] = leia.nextInt();
            }
        }
            System.out.println("MDC: " + mdcLista(b));
           leia.close();
        }
        //Realiza o calculo    
        public static int mdc(int a, int b){        
            while(b != 0){
                int r = a % b;
                a = b;
                b = r;
            }
            return a;
        }
        
        //Calcula o MDC de uma lista de números
        public static int mdcLista(int[] numberList){
            int mdcResultado = numberList[0];
            for(int i = 1; i < numberList.length; i++){
                mdcResultado = mdc(mdcResultado, numberList[i]);
            }
            return mdcResultado;
        }

    }