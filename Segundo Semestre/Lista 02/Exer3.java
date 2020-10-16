/* Luis Gustavo Godoy Camargo */
import java.util.Scanner;
public class Exer3{
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner ( System.in );
		double  num, num1;
		
		System.out.print("Entre com um numero: ");
        num = leia.nextDouble();
        System.out.print("Entre com um numero: ");
		num1 = leia.nextDouble();
		isPositivo(num, num1);
       
		
	leia.close();
	}
	

	//
	static void isPositivo ( double n1, double n2) {
        System.out.print("O maior número é"+Math.max(n1,n2));
        
	}
	

}
