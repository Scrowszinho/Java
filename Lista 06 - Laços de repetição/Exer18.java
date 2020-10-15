import java.util.Scanner;
public class Exer18 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Double es,vm;
        System.out.print("Escreva a quantidade do valor em estoque: ");
        es = leia.nextDouble();
        System.out.print("Escreva o valor de cada mercadoria: ");
        vm = leia.nextDouble();
        System.out.println("Mercadoria em estoque: "+es);
        System.out.println("Média de preço da mercadoria: "+vm/1);
        leia.close();
    }
}