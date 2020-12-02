/* Luis Gustavo Godoy Camargo */
import java.util.Scanner;
public class AprovadoReprovado {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
		System.out.println("Digite sua nota:");
		int op = leia.nextInt();
        if(op >= 0 && op<=10){
            if(op>5){System.out.println("Aprovado");}
            else{System.out.println("Reprovado");}
        } else {System.out.println("Valor Invalido");}
    }
}