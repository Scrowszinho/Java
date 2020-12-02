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
    public Midia(String titulo, String tipo, String genero, int id, double valor){
        setNome(nome);
        setEspecie(especie);
    
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setValor(String valor){
        this.valor = valor;
    }
   
   

}
