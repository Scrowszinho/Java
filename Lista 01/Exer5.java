/* Luis Gustavo Godoy Camargo */
import java.util.Scanner;

public class Exer5 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner ( System.in );
		double  a,b,c;
		
		System.out.print("Entre com um numero para a: ");
		a = leia.nextDouble();
        System.out.print("Entre com um numero para b: ");
        b = leia.nextDouble();
        System.out.print("Entre com um numero para c: ");
		c = leia.nextDouble();

        delta(a,b,c);
		
	leia.close();
	}
	

	//
	static void delta ( double a1, double b1, double c1) {
        if(a1 != 0){
        double d = (b1*b1)-4*a1*c1;    
        double x = Math.sqrt(d);    
        if(x>=0){
            System.out.printf("Delta: "+(a1*(x*x)+b1*x+c1));
            }
            else{
                System.out.print("Delta: 0");
            }
    }
    else{
        System.out.print("Valor de a é: 0");
    }
	}
	

}
