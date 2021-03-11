/*
 * Cafeteira.java 
 * 
 */

public class Cafeteira {
	
	private String voltagem;   // 110v, 220v
	private String cor;        // preta, vermelha, branca
	private double capacidade; // 1L, 1,5L
	
	public Cafeteira () {
		this.voltagem = "110v";
		cor = "preta";
		capacidade = 1;
	}
	
	public Cafeteira (String voltagem, String cor, double capacidade) {
		
		this.voltagem = "110v";
		setVoltagem ( voltagem );
		
		this.cor = "preta";
		setCor ( cor );
		
		this.capacidade = 1;
		setCapacidade ( capacidade );

	}
	
	public void setVoltagem ( String voltagem ) {
		if ( ! voltagem.isEmpty() ) {
			this.voltagem = voltagem;
		}
	}
	
	public void setCor ( String cor ) {
		if ( ! cor.isEmpty() ) {
			this.cor = cor;
		}
	}
	
	public void setCapacidade ( double capacidade) {
		if ( capacidade > 0.0 ) {
			this.capacidade = capacidade;
		}
	}
	
	public String getVoltagem () {
		return voltagem;
	}
	
	public String getCor () {
		return cor;
	}
	
	public double getCapacidade () {
		return capacidade;
	}
	
	@Override
	public String toString () {
		return "[" + voltagem + ", " + cor +  ", " + capacidade + "]";
	}
}

