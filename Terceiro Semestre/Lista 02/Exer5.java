/* Luis Gustavo Godoy Camargo */
import java.util.Scanner;
public class Exer5{
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner ( System.in );
		int a,b,c;
		
		System.out.print("Entre com um a: ");
        a = leia.nextInt();
        System.out.print("Entre com um b: ");
        b = leia.nextInt();
        System.out.print("Entre com um c: ");
		c = leia.nextInt();
		int maior =  maior(a, b, c);
		System.out.print("Maior: "+maior);
		leia.close();
	}

	public int maior ( int a, int b ) {
	if(a > b){
		return a;
	}
	else{
		return b;
	}
	}
	//
	public static int maior ( int a, int b, int c ) {
		if(c > a && c > b){
			return c ;
		}
		else if(b> c && b > a){
			return b;
		}
		else {
			return a;
		}
		
	}
	
	

}
