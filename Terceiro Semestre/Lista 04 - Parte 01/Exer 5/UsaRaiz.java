// Luis Gustavo Godoy Camargo
import java.util.Scanner;
public class UsaRaiz {

    public static void main(String[] args){
    Raiz rai;
    int a = 0, b = 0, c = 0;
    Scanner leia = new Scanner(System.in);
    //
    System.out.print("Digite o a: ");
    a = leia.nextInt();
    System.out.print("Digite o b: ");
    b = leia.nextInt();
    System.out.print("Digite o c: ");
    c = leia.nextInt();
    //
    rai = new Raiz(a,b,c);
    rai.raiRaiz();
    leia.close();

    }
}
