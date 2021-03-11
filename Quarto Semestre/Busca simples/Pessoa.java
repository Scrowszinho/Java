/*
 * Pessoa.java
 * 
 */

public class Pessoa {
	
	private String nome;
	private int    pesoAntes;
	private int    pesoDepois;
	private double altura;
	
	public Pessoa ( String nome, int pesoAntes, int pesoDepois, double altura ) {
		
		setPessoa ();
		
		setNome ( nome );
		setPesoAntes ( pesoAntes );
		setPesoDepois ( pesoDepois );
		setAltura ( altura );
	}
	
	private void setPessoa () {
		this.nome = "Joseverson";
		this.pesoAntes = 70;
		this.pesoDepois = 90;
		this.altura = 1.7;
	}
	
	private void setNome ( String nome ) {
		if ( ! nome.isEmpty() ) {
			this.nome = nome;
		}
	}
	
	private void setPesoAntes ( int peso ) {
		if ( peso > 0 ) {
			this.pesoAntes = peso;
		}
	}
	
	private void setPesoDepois ( int peso ) {
		if ( peso > 0 ) {
			this.pesoDepois = peso;
		}
	}
	
	private void setAltura ( double altura ) {
		if ( altura >= 0.5 && altura <= 3.0 ) {
			this.altura = altura;
		}
	}
	
	public String getNome () {
		
		return nome;
	}
	
	public int getPesoAntes () {
		
		return pesoAntes;
	}
	
	@Override
	public String toString () {
		
		return "[" + nome + ", " + 
		             pesoAntes + ", " + 
		             pesoDepois + ", " + 
		             altura + "]";
	}
	
}

