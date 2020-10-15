 /* Luis Gustavo Godoy Camargo */
 import java.util.Scanner;
 public class Exer12 {
             public static void main(String[] args){
             Scanner leia = new Scanner(System.in);
             System.out.print("Digite o código do produto: ");
             int c = leia.nextInt();
             System.out.print("Digite o preço do produto: ");
             Double pre = leia.nextDouble();
            switch(c){
                case 1:
                System.out.printf("Origem: Norte\nPreço:R$ %.2f\nValor do frete:R$ %.2f\nValor final a ser pago:R$ %.2f",pre,pre*0.1,pre+(pre*0.1));
                break;
                case 2,5,9:
                System.out.printf("Origem: Sul\nPreço:R$ %.2f\nValor do frete:R$ %.2f\nValor final a ser pago:R$ %.2f",pre,pre*0.03,pre+(pre*0.03));
                break;
                case 3,10,11,12,13,14,15:
                System.out.printf("Origem: Leste\nPreço:R$ %.2f\nValor do frete:R$ %.2f\nValor final a ser pago:R$ %.2f",pre,pre*0.012,pre+(pre*0.012));
                break;
                case 7,20:
                System.out.printf("Origem: Oeste\nPreço:R$ %2f\nValor do frete:R$ %2f\nValor final a ser pago:R$ %2f",pre,pre*0.073,pre+(pre*0.073));
                break;
                default: 
                System.out.printf("Origem: Importado\nPreço:R$ %2f\nValor do frete:R$ %2f\nValor final a ser pago:R$ %2f",pre,pre*0.222,pre+(pre*0.222));
            }
    }
 }
 
 