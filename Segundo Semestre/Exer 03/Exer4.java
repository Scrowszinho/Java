/* Luis Gustavo Godoy Camargo */
import java.util.Scanner;
import java.util.Arrays;

public class Exer4 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        double[] n = new double[3];
        for(int i = 0 ; i <3; i++){
        System.out.print("Entre com a nota número "+i+" : ");
        n[i] = leia.nextDouble();
        if(n[i]< 0 || n[i] > 10){
        n[i] = 0;
        }
    }
        media(n);
        leia.close();
    }

    //
    static void media(double[] n) {
     System.out.print("\nMédia aritimética: "+(n[0]+n[1]+n[2])/3);
     Arrays.sort(n);
     System.out.print("\nMédia dos maiores: "+(n[1]+n[2])/2);
     System.out.print("\nMenor número: "+n[0]);
     System.out.print("\nMaior número: "+n[2]);
    }

}
