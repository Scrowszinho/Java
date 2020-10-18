/* Luis Gustavo Godoy Camargo */
import java.util.Scanner;

public class Exer1 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner ( System.in );
		int  num;
		
		System.out.print("Entre com temperatura em Celsius: ");
		num = leia.nextInt();
		celsiuFah(num);
       
		
	leia.close();
	}
	

	//
	 static void celsiuFah ( int c) {
        System.out.print("A temperatura em Fahrenheit é: "+((9*c/5)+32));
	}
	

}
