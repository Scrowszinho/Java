/*
 * Desempregado.java
 * 
 */

public class Desempregado extends Candidato {
	
	private int meses;
	
	public Desempregado ( String nome, int idade, int meses ) {
		super ( nome, idade );
		setMeses ( meses );
	}
	
	public void setMeses ( int meses ) {
		if ( meses >= 0 ) {
			this.meses = meses;
		}
	}
	
	public int getMeses () {
		return meses;
	}
	
	@Override
	public String toString () {
		return  super.toString() + "; Desempregado: " + meses + " meses";
	}
}

