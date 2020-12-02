/*
 * Candidato.java
 * 
 */

public class Candidato {
	
	private String nome;
	private int idade;
	
	public Candidato ( String nome, int idade ) {
		setNome ( nome );
		setIdade ( idade );
	}
	
	public void setNome ( String nome ) {
		if ( nome != null && !nome.isEmpty() ) {
			this.nome = nome;
		}
	}
	
	public void setIdade ( int idade ) {
		if ( idade >= 12 ) {
			this.idade = idade;
		}
	}
	
	public String getNome () {
		return nome;
	}
	
	public int getIdade () {
		return idade;
	}
	
	@Override
	public String toString () {
		return "Nome: " + nome + "; Idade: " + idade;
	}
}

