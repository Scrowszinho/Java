/*
 * MaiorPesoAntesDaPandemia.java
 * 
 */

public class MaiorPesoAntesDaPandemia {
	
	public static void main (String[] args) {
		
		int[] vetor = { 70, 61, 52, 97, 45 };
		
		imprime ( vetor );
		
		int posicaoDoMaior = buscaMaior ( vetor );
		
		System.out.println ( "O maior peso esta na posicao: " + posicaoDoMaior ); // 3
		
		System.out.println ( "O maior peso: " + vetor[posicaoDoMaior] ); // 97
		
	}
	
	//
	static int buscaMaior ( int[] vetor ) {
		
		int testes = 0,
		    trocas = 0;
		
		int maiorPeso = 0;
		
		for ( int atual = 1 ; atual < vetor.length ; atual++ ) {
			
			testes++;
			
			System.out.print ( ">>> " + vetor [ atual ] + " > " + vetor [ maiorPeso ] );
			
			//testar se posicao atual do vetor eh maior posicao do maior peso
			if ( vetor [ atual ] > vetor [ maiorPeso ] ) {
				
				trocas++;
				
				//maior peso esta na posicao atual
				maiorPeso = atual;
			}
			
			System.out.println( " = " + vetor[maiorPeso] );
		}
		
		System.out.println(">>> Testes: " + testes);
		System.out.println(">>> Trocas: " + trocas);
		
		return maiorPeso;
	}
	
	//
	static void imprime ( int[] vetor ) {
		
		//for ( int i = 0 ; i < vetor.length ; i++ ) {
			
		//	System.out.print ( vetor[i] + " " );
		//}
		
		//System.out.println ();
		
		
		for ( int peso : vetor ) {
			System.out.print ( peso + " " );
		}
		System.out.println ();
	}
	
}

