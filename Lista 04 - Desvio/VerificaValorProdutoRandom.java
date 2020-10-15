/* Luis Gustavo Godoy Camargo */
import java.util.Random;
public class VerificaValorProdutoRandom {
    public static void main(String[] args){
        Random gerador = new Random();
        int precoProduto1,precoProduto2;
        precoProduto1 = gerador.nextInt(1000);
        precoProduto2 = gerador.nextInt(1000);
        if(precoProduto1 > precoProduto2){
            System.out.println("Preço do produto 1 é maior");
        }
        else if(precoProduto1 == precoProduto2){System.out.println("Preço dos produtos são igauis");}
        else{ System.out.println("Preço do produto 2 é maior");}
    }
}