// Luis Gustavo Godoy Camargo
import java.util.Scanner;
public class UsaData {

    public static void main(String[] args){
    ModeloDeComputador mdc;
    Scanner leia = new Scanner(System.in);
    int[] op = new int[5];
    //
    System.out.print("Quer placa mãe?: (1 - Sim / 2 - Não) ");
    op[0] = leia.nextInt();      
    System.out.print("1- 1600Mhz a R$700\n2 - 1800Mhz a R$830\n3 - 1900Mhz a R$910\nQual o processador:");
    op[1] = leia.nextInt();   
    System.out.print(" * 1GB * 2GB * 4GB * 6GB * 8GB\nQuanto de memória:");
    op[2] = leia.nextInt();   
    System.out.print("1 - 500 GB a R$300\n2 - 1 TB a R$420\n3 - 2TB a R$500\nQuanto de Hd:");
    op[3] = leia.nextInt();   
    System.out.print("1 - 15 polegadas a R$320\n2 - 17 polegadas a R$520\nQual a tela:");
    op[4] = leia.nextInt(); 
    leia.close();
    mdc = new ModeloDeComputador(op);
    mdc.calcularPreco(op);
    }
}
