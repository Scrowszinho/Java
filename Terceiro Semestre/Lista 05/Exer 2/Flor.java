public class Flor extends Plantas{
    private String cor;
    public Flor(String nome, String especie, String cor){
        super(nome, especie);
        setNome(nome);
        setEspecie(especie);
        this.cor = cor;
    }

    public void setDeta(String nome, String especie){
        setNome(nome);
        setEspecie(especie);
    }

    public String getNome() {
        return getNome();
    }
    public String getEspecie() {
        return getEspecie();
    }
    public String getCor(){
        return this.cor;
    }


}
