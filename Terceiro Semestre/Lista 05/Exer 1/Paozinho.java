public class Paozinho extends Produto{
    public Paozinho(double preco, int quantidade){
        super(preco, quantidade);
        setPreco(preco);
        setQuantidade(quantidade);
    }

    public void setDeta(double preco, int quantidade){
    setPreco(preco);
    setQuantidade(quantidade);
    }

    public double getPreco() {
        return getPreco();
    }
    public int getQuantidade() {
        return getQuantidade();
    }
}
