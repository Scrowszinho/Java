/* Luis Gustavo Godoy Camargo */
import java.util.Scanner;

public class Exer1 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner ( System.in );
		double  num, num1;
		
		System.out.print("Entre com um numero: ");
        num = leia.nextDouble();
        System.out.print("Entre com um numero: ");
		num1 = leia.nextDouble();
		boolean positivo =  isPositivo(num, num1);
       if(positivo == true ){
        System.out.print("O maior número é"+num);
       } 
       else {
        System.out.print("O maior número é"+num1);
       }
		
	leia.close();
	}
	

	//
	static boolean isPositivo ( double n1, double n2) {
		return n1 >= n2;
	}
	

}
