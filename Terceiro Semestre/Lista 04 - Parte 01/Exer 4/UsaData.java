// Luis Gustavo Godoy Camargo
import java.util.Scanner;
public class UsaData {

    public static void main(String[] args){
    Data lam;
    Scanner leia = new Scanner(System.in);
    //
    System.out.println("Digite o dia: ");
    int dia = leia.nextInt();
    System.out.println("Digite o mes: ");
    int mes = leia.nextInt();
    System.out.println("Digite o ano: ");
    int ano = leia.nextInt();
    //
    lam = new Data(dia,mes,ano);
    lam.dataMostrar();   
    leia.close();

    }
}
