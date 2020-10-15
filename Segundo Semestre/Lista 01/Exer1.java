/* Luis Gustavo Godoy Camargo */
import java.util.Scanner;

public class Exer1 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner ( System.in );
		double  num;
		
		System.out.print("Entre com um numero: ");
		num = leia.nextDouble();
		boolean positivo =  isPositivo(num);
       if(positivo == true ){
        System.out.print("Número "+num+" é positivo");
       } 
       else {
        System.out.print("Número "+num+" é negativo");
       }
		
	leia.close();
	}
	

	//
	static boolean isPositivo ( double n1) {
		return n1 >= 0;
	}
	

}
