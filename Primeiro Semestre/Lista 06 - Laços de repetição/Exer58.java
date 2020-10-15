/* Luis Gustavo Godoy Camargo */

import java.util.Scanner;

public class SequenciaRicci {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int proximo=0,atual=0,anterior=1;

        System.out.println("Digite o primeiro termo: ");
        anterior = input.nextInt();

        System.out.println("Digite o segundo termo: ");
        atual = input.nextInt();

        for(int i = 1; i<=10; i++){
            proximo=atual+anterior;
            System.out.print(proximo+", ");
            anterior=atual;
            atual=proximo;
        }



    }
}
