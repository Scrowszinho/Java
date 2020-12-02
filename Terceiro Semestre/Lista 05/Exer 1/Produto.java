public class Produto {
    
    private double preco;
    private int quantidade;
    public Produto(){
    preco = 0.0;
    quantidade = 0;
    }

    public Produto(double preco, int quantidade ){
        setPreco(preco);
        setQuantidade(quantidade);
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public double getPreco(){
        return preco;
    }
    public int getQuantidade(){
        return quantidade;
    }

}
