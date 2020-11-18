public class Arvore extends Plantas{
    private String frutifera;
    public Arvore(String nome, String especie, String frutifera){
        super(nome, especie);
        setNome(nome);
        setEspecie(especie);
        this.frutifera = frutifera;
    }

    public void setDeta(String nome, String especie, String frutifera){
        setNome(nome);
        setEspecie(especie);
        this.frutifera = frutifera;
    }

    public String getNome() {
        return getNome();
    }
    public String getEspecie() {
        return getEspecie();
    }
    public String getFrutifera(){
        return this.frutifera;
    }


}
