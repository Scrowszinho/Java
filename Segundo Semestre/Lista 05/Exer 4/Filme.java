public class Filme extends Midia{
    private String classificacao;
    private int duracao;

    public Filme(int id,String titulo,String tipo,String genero, double valor, 
                String classificacao, int duracao){
        super(id,titulo,tipo,genero,valor);
        this.classificacao = classificacao;
        this.duracao = duracao;
    }

   

    


}
