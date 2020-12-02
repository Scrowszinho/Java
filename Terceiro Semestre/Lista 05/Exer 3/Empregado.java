/*
 * Empregado.java
 * 
 */

public class Empregado extends Candidato {
	
	private String empresa;
	
	public Empregado ( String nome, int idade, String empresa ) {
		super ( nome, idade );
		setEmpresa ( empresa );
	}
	
	public void setEmpresa ( String empresa ) {
		if ( empresa != null && !empresa.isEmpty() ) {
			this.empresa = empresa;
		}
	}
	
	public String getEmpresa () {
		return empresa;
	}
	
	@Override
	public String toString () {
		return  super.toString() + "; Empregado na: " + empresa;
	}
}

