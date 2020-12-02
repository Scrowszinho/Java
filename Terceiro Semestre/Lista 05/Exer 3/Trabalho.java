/*
 * Trabalho.java
 * 
 */

public class Trabalho extends Vaga {
	
	private boolean temporario;
	
	public Trabalho ( ) {
		super ( );
	}	
	
	public Trabalho ( String descricao, double salario, boolean temporario ) {
		super ( descricao, salario );
		setTemporario ( temporario );
	}
	
	public void setTemporario ( boolean temporario ) {
		this.temporario = temporario;
	}
	
	public boolean isTemporario () {
		return temporario;
	}
	
	@Override
	public String toString () {
		return  super.toString() + "; Vaga: " + 
			( temporario ? "temporaria" : "indeterminada" );
	}
}

