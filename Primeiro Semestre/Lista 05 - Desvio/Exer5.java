 /* Luis Gustavo Godoy Camargo */
 import java.util.Scanner;
 public class Exer5 {
             public static void main(String[] args){
             Scanner leia = new Scanner(System.in);
             System.out.print("Digite o ano atual: ");
             int n1 = leia.nextInt();
             System.out.print("Digite o ano de nascimento: ");
             int n2 = leia.nextInt();
             int m = n1 - n2;
                if(m > 17){ System.out.println("Ja pode votar");}
                else { System.out.println("Não pode votar");}
    }
 }
 
 