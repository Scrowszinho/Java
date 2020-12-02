// Luis Gustavo Godoy Camargo
import java.util.Scanner;
public class UsaData {

    public static void main(String[] args){
    Data lam;
    Scanner leia = new Scanner(System.in);
    //
    System.out.print("Digite o dia: ");
    int dia = leia.nextInt();
    System.out.print("Digite o mes: ");
    int mes = leia.nextInt();
    System.out.print("Digite o ano: ");
    int ano = leia.nextInt();
    //
    System.out.print("Digite o dia: ");
    int dia1 = leia.nextInt();
    System.out.print("Digite o mes: ");
    int mes1 = leia.nextInt();
    System.out.print("Digite o ano: ");
    int ano1 = leia.nextInt();
    //
    lam = new Data(dia,mes,ano,dia1,mes1,ano1);
    lam.dataMostrar();   
    leia.close();

    }
}
