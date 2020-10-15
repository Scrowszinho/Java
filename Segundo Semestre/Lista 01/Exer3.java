/* Luis Gustavo Godoy Camargo */
import java.util.Scanner;

public class Exer3 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner ( System.in );
		double  num;
		
		System.out.print("Entre com um numero: ");
		num = leia.nextDouble();
		isPositivo(num);
		
	leia.close();
	}
	

	//
	static void isPositivo ( double n1) {
		if(n1 > 0){
            System.out.print("Número "+n1+" é positivo");
           } 
           else if(n1 == 0){
            System.out.print("Número "+n1+" é zero");
           }
           else {
            System.out.print("Número "+n1+" é negativo");
           }
	}
	

}
