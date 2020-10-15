/* Luis Gustavo Godoy Camargo */
import java.util.Scanner;

public class Exer2 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner ( System.in );
		double  num;
		
		System.out.print("Entre com um numero: ");
		num = leia.nextDouble();
		boolean zero =  isZero(num);
       if(zero == true ){
        System.out.print("Número "+num+" é zero");
       } 
       else {
        System.out.print("Número "+num+" não é zero");
       }
		
	leia.close();
	}
	

	//
	static boolean isZero ( double n1) {
		return n1 == 0;
	}
	

}
