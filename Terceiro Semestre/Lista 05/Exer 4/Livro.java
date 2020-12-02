public class Livro extends Midia{
    private String autor, editora;
    private int edicao;

    public Livro(int id,String titulo,String tipo,String genero, double valor, 
                String autor, String editora, int edicao){
        super(id,titulo,tipo,genero,valor,autor, editora, edicao);
        this.autor = autor;
        this.editora = editora;
        this.edicao = edicao;
    }

 

    


}
