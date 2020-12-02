/*
 * CandidatoVaga.java
 * 
 */

public class CandidatoVaga {
	
	private Candidato candidato;
	private Vaga vaga;
	private boolean contratado;
	
	public CandidatoVaga () {}
	
	public CandidatoVaga ( Candidato candidato, Vaga vaga ) {
		setCandidato ( candidato );
		setVaga ( vaga );
		setContratado ( false );
	}
	
	public void setCandidato ( Candidato candidato ) {
		if ( candidato != null ) {
			this.candidato = candidato;
		}
	}
	
	public void setVaga ( Vaga vaga ) {
		if ( vaga != null ) {
			this.vaga = vaga;
		}
	}
	
	public void setContratado ( boolean contratado ) {
		this.contratado = contratado;
	}
	
	public Candidato getCandidato () {
		return candidato;
	}
	
	public Vaga getVaga () {
		return vaga;
	}
	
	public boolean isContratado () {
		return contratado;
	}
	
	@Override
	public String toString () {
		return ( contratado ? "[Contratado]\n\t" : "[Em aberto]\n\t" ) +
				"[Candidato] " + candidato + "\n\t" + 
				"[Vaga] " + vaga;
	}
}

