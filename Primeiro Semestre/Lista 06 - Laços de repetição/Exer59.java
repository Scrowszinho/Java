/* Luis Gustavo Godoy Camargo */

import java.util.Scanner;

public class VerificarNumeroRicci {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int proximo=0,atual=0,anterior=1, valor = 0;
        boolean resposta = false;

        System.out.println("Digite o primeiro termo: ");
        anterior = input.nextInt();

        System.out.println("Digite o segundo termo: ");
        atual = input.nextInt();

        System.out.println("Digite o número para ser identificado: ");
        valor = input.nextInt();

        for(int i = 1; i<=valor; i++){
            proximo=atual+anterior;
            if(valor==proximo){
                resposta = true;
                break;
            }
            anterior=atual;
            atual=proximo;
        }
        System.out.println(resposta==true ? "O valor pertence a sequência de Ricci :D" : "O valor não pertence a sequência de Ricci :`(");
    }
}
