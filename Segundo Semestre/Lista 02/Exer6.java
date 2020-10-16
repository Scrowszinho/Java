/* Luis Gustavo Godoy Camargo */
import java.util.Scanner;
public class Exer6{
    
    public static double me = 1000000;
	public static void main (String[] args) {
		
		Scanner leia = new Scanner ( System.in );
        double  num;
        String sn = "";
		do{
		System.out.print("Entre com um numero: ");
        num = leia.nextDouble();
        System.out.print("Ler outro número?(s/n): ");
        sn = leia.next();
        isPositivo(num,sn);
        }while(!sn.equalsIgnoreCase("n"));

		
	leia.close();
	}
	

	//
	static void isPositivo ( double n1, String n) {
        if(n1 < me){
            me = n1;
        }
        if(!n.equalsIgnoreCase("s")){
        System.out.print("Menor número digitado: "+me);
        }
	}
	

}
