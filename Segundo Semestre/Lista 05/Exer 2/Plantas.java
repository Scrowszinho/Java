public class Plantas {
    
    private String nome;
    private String especie;
    public Plantas(){
    nome = "";
    especie = "";
    }

    public Plantas(String nome, String especie){
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
