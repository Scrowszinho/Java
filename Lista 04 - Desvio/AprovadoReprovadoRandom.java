/* Luis Gustavo Godoy Camargo */
import java.util.Random;
public class AprovadoReprovadoRandom {
    public static void main(String[] args){
        Random gerador = new Random();
        int nota;
        nota = gerador.nextInt(10);
        System.out.println( nota >= 6 ? "Aprovado" : "Reprovado");
        System.out.println(nota);
    }
}