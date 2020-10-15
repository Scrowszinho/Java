/* Luis Gustavo Godoy Camargo */
import java.util.Scanner;

public class QTDTermos5 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int termos = 0, fatoracao=0,valor=-1;
        boolean inverter = true;
        String condicao = " - ";

        System.out.println("Digite a quantidade de termos: ");
        termos = input.nextInt();
        fatoracao = valor;

        for(int i = 1; i<=termos;i++){
            if(inverter==true){
                condicao = " + ";
            }else{
                condicao = " - ";
            }
            System.out.print(i+"/"+i+condicao);
            fatoracao*=i;
            inverter = !inverter;
        }



    }
}
