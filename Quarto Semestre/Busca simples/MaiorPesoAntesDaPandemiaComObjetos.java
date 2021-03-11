/*
 * MaiorPesoAntesDaPandemiaComObjetos.java
 * 
 */

public class MaiorPesoAntesDaPandemiaComObjetos {
	
	public static void main (String[] args) {
		
		Pessoa pessoa1 = new Pessoa ( "Oracio", 70, 90, 1.72 );
		Pessoa pessoa2 = new Pessoa ( "Gilberto", 61, 59, 1.63 );
		
		Pessoa[] voluntarios = {
			pessoa1, 
			pessoa2,
			new Pessoa ( "Lidia" , 52, 69, 1.56 ),
			new Pessoa ( "Marisa", 97, 82, 1.91 ),
			new Pessoa ( "Carla" , 45, 79, 1.68 )
		};
		
		imprime ( voluntarios );
		
		int posicaoMaiorPeso = buscaMaior ( voluntarios );
		
		System.out.println ( "Posicao da pessoa de maior peso: " + posicaoMaiorPeso);
		System.out.println ( "Pessoa de maior peso" );
		System.out.println ( "Nome: " + voluntarios[posicaoMaiorPeso].getNome() );
		System.out.println ( "Peso Antes: " + voluntarios[posicaoMaiorPeso].getPesoAntes() );
	}
	
	//
	static int buscaMaior ( Pessoa[] voluntarios ) {
		
		int maiorPeso = 0;
		
		//for ( Pessoa pessoa : voluntarios ) {
		for ( int atual = 1 ; atual < voluntarios.length ; atual++ ) {
			
			//testar se posicao atual do vetor de voluntarios eh maior que a posicao do maior peso
			if ( voluntarios [ atual ].getPesoAntes() > voluntarios [ maiorPeso ].getPesoAntes() ) {	
				
				//maior peso tem que ser a posicao atual
				maiorPeso = atual;
			
			}
		}
		
		return maiorPeso;
	}
	
	
	//
	static void imprime ( Pessoa[] cobaias ) {
		
		//for ( int i = 0 ; i < cobaias.length ; i++ ) {
		//	System.out.println ( cobaias[i] );
		//}
		//System.out.println ();
		
		for ( Pessoa pessoa : cobaias ) {
			System.out.println ( pessoa );
		}
		System.out.println ();
		
	}
}

