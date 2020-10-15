 /* Luis Gustavo Godoy Camargo */
 import java.util.Scanner;
 public class Exer8 {
             public static void main(String[] args){
             Scanner leia = new Scanner(System.in);
             System.out.print("Digite o começo do jogo: ");
             int n1 = leia.nextInt();
             System.out.print("Digite o final do jogo: ");
             int n2 = leia.nextInt();
            if(n2>n1 && n1 <= 24 && n2 <=24){
             int m = n2 - n1;
             System.out.println("Duração do jogo em horas é : "+m);
            }
            else if(n1>n2 && n1 <= 24 && n2 <=24){
                int m = n1 - n2;
                System.out.println("Duração do jogo em horas é : "+m); 
            }
    }
 }
 
 