public class Midia {
    
    private int id;
    private String titulo,tipo,genero;
    private double valor;
    public Midia(){
        this.titulo = "";
        this.tipo = "";
        this.genero = "";
        this.id = 0;
        this.valor = 0.0;
    }

    public Midia(String nome, String especie){
        setNome(nome);
        setEspecie(especie);
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEspecie(String especie){
        this.especie = especie;
    }
    public String getNome(){
        return nome;
    }
    public String getEspecie(){
        return especie;
    }

}
