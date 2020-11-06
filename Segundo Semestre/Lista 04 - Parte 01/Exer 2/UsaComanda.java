// Luis Gustavo Godoy Camargo
import java.util.Scanner;
public class UsaComanda {

    public static void main(String[] args){
    Comanda com;
    boolean sn = false;
    Scanner leia = new Scanner(System.in);
    System.out.print("Digite o total da conta: ");
    float t = leia.nextFloat();
    System.out.print("Digite o total de pessoas: ");
    int i= leia.nextInt();
    System.out.print("Vão pagar a comanda? s/n: ");
    String a = leia.next();
    leia.close();
       if(a.equals("s")){
           sn = true;
        com = new Comanda(t,i,sn);
            System.out.print("Valor total a ser pago por pessoa com os 10%: "+com.comCom());
           }
           else{
            com = new Comanda(t,i,sn);
               System.out.println("Valor total a ser pago por pessoa sem os 10%: "+com.comCom());
            
           }
    }
    

}
