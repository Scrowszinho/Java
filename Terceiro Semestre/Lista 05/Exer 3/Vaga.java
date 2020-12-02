/*
 * Vaga.java
 * 
 */

public class Vaga {
	
	private String descricao;
	private double salario;

	public Vaga ( ) {

	}
	
	public Vaga ( String descricao, double salario ) {
		setDescricao ( descricao );
		setSalario ( salario );
	}
	
	public void setDescricao ( String descricao ) {
		if ( descricao != null && !descricao.isEmpty() ) {
			this.descricao = descricao;
		}		
	}
	
	public void setSalario ( double salario ) {
		if ( salario >= 0 ) {
			this.salario = salario;
		}
	}
	
	public String getDescricao () {
		return descricao;
	}
	
	public double getSalario () {
		return salario;
	}
	
	@Override
	public String toString () {
		return  "Descricao da vaga: " + descricao + "; Salario: R$ " + salario;
	}
}

