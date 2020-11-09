// Luis Gustavo Godoy Camargo
public class Numero {
	private int numero;

	//
	public Numero() {
		this.numero = 0;
	}

	//
	public void setNumero(int numero) {
		this.numero = numero;
	}

	//
	public int getNumero() {
		return this.numero;
	}

	//
	public int inverter() {
		int resto, invertido = 0;
		while(this.numero> 0){
			resto = this.numero %10;
			invertido = invertido * 10 + resto;
			this.numero /=10;
		}
		return invertido;
	}
	
}