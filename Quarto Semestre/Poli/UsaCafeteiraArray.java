/*
 * UsaCafeteiraArray.java
 * 
 */

import java.util.Arrays;

public class UsaCafeteiraArray {
	
	public static void main (String[] args) {
		
		int array[] = new int[5];
		
		Cafeteira cafeteiras[] = new Cafeteira[10];
		
		for ( int i = 0 ; i < cafeteiras.length ; i++ ) {
			cafeteiras[i] = new Cafeteira("110v", "vermelha", 1.0);
		}
		
		//cafeteiras[0] = new Cafeteira("110v", "amarela", 3000, 1.5);
		//cafeteiras[5] = new Cafeteira("220v", "preta", 103, 1);
		
		System.out.println( Arrays.toString ( cafeteiras ) );

		
		
	}
}

