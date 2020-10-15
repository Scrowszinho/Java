/* Luis Gustavo Godoy Camargo */
import java.util.Scanner;
public class VerificaValorProduto {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
		System.out.println("Digite o preço do produto1:");
        int produto1 = leia.nextInt();
        System.out.println("Digite o preço do produto2:");
        int produto2 = leia.nextInt();
        
        if(produto1 <= 1000 && produto2 <= 1000){
        if(produto1 > produto2){
            System.out.println("Preço do produto 1 é maior");
        }
        else if(produto1 == produto2){System.out.println("Preço dos produtos são igauis");}
        else if(produto1 <   produto2){ System.out.println("Preço do produto 2 é maior");}
        }else {System.out.println("VALOR INVALIDO");}
    }
}