/* Luis Gustavo Godoy Camargo */
import java.util.Scanner;
public class ADivisivelPorB {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
		System.out.println("Digite valor de A:");
        int a = leia.nextInt();
        System.out.println("Digite valor de B:");
        int b = leia.nextInt();
        System.out.println(a <= 1000 && b>0 ? "Valor de A é valido" : "Valor de A não é valido");
        System.out.println(b <= 20 && b>0 ? "Valor de B é valido" : "Valor de B não é valido");
        System.out.println(b >= 1 ? "Valor de B não é maior ou igual a 1" : "");
        System.out.println(a % b == 0 ? "É divisivel" : "Não é divisivel");

    }
}