// Luis Gustavo Godoy Camargo
public class Ano {
	private int ano;

	//
	public Ano() {
		this.ano = 0;
	}

	//
	public void setAno(int ano) {
		this.ano = ano;
	}

	//
	public int getAno() {
		return this.ano;
	}

	//
	public boolean ehBissexto() {
		if (this.ano % 4 == 0) {
			if (this.ano % 100 == 0 && this.ano % 400 == 0) {
					return true;
				} else { return false; }
			}
			else{ return false; }
		}
	

}