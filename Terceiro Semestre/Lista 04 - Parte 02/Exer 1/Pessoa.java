// Luis Gustavo Godoy Camargo
public class Pessoa{
   private String nome;
   private int idade;
   private double altura;
    //
    public Pessoa () {
		this.nome = "nome padrao";
		this.idade = 0;
		this.altura = 0.0;
	}

    public void setNome ( String nome ) {
		if ( ! nome.isEmpty() ) {
			this.nome = nome;
		}
	}
	
	public void setIdade ( int idade ) {
		if ( idade>1 ) {
			this.idade = idade;
		}
	}
	
	public void setAltura ( double altura ) {
		if ( altura >= 1.2 ) {
			this.altura = altura;
		}
	}
	
	public String getNome () {
		return nome;
	}
	
	public int getIdade () {
		return idade;
	}
	
	public double getAltura () {
		return altura;
    }
    
    public void fazAniversario(int a) {
    if(a == 29){
    this.idade+=1;
    }
    }

}