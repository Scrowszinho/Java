/*
 * Estagio.java
 * 
 */

public class Estagio extends Vaga {
	
	private int tempo;

	public Estagio ( ) {
		super ( );
	}
	
	public Estagio ( String descricao, double salario, int tempo ) {
		super ( descricao, salario );
		setTempo ( tempo );
	}
	
	public void setTempo ( int tempo ) {
		if ( tempo > 0 ) {
			this.tempo = tempo;
		}
	}
	
	public int getTempo () {
		return tempo;
	}
	
	@Override
	public String toString () {
		return  super.toString() + "; Tempo (em meses): " + tempo;
	}
}

