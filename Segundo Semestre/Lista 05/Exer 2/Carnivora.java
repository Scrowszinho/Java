public class Carnivora extends Plantas{
    private String venenosa;
    public Carnivora(String nome, String especie, String venenosa){
        super(nome, especie);
        setNome(nome);
        setEspecie(especie);
        this.venenosa = venenosa;
    }

    public void setDeta(String nome, String especie, String venenosa){
        setNome(nome);
        setEspecie(especie);
        this.venenosa = venenosa;
    }

    public String getNome() {
        return getNome();
    }
    public String getEspecie() {
        return getEspecie();
    }
    public String getVenenosa(){
        return this.venenosa;
    }


}
