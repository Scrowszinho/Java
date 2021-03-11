/*
 * UsaCafeteira.java
 * 
 */

public class UsaCafeteira {
	
	public static void main (String[] args) {
		
		int       k;
		
		Cafeteira nespresso = new Cafeteira(); //103
		
		//nespresso.cor = "preta";
		nespresso.capacidade = 1.5;
		nespresso.setVoltagem220();
		
		nespresso.setFiltro(102); //102
		
		System.out.println("Filtro: " + nespresso.getFiltro() ); //102
		System.out.println("Cor...: " + nespresso.cor );
		System.out.println("Tensao: " + nespresso.getVoltagem() );
		
		Cafeteira arno = new Cafeteira(); //103
		System.out.println("Filtro: " + arno.getFiltro() ); //103
		System.out.println("Filtro: " + nespresso.getFiltro() ); //103
		
		Cafeteira cadence = new Cafeteira("110v", "amarela", 3000, 1.5);
		System.out.println("Filtro: " + cadence.getFiltro() ); 
		
		
		
	}
}

