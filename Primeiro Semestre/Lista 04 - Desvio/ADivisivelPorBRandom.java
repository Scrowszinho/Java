/* Luis Gustavo Godoy Camargo */
import java.util.Random;
public class ADivisivelPorBRandom {
    public static void main(String[] args){
        Random gerador = new Random();
        int a,b;
        a = gerador.nextInt(1000);
        b = gerador.nextInt(20);
        System.out.println(a % b == 0 ? "É divisivel" : "Não é divisivel");

    }
}