 /* Luis Gustavo Godoy Camargo */
 import java.util.Scanner;
 public class Exer11 {
             public static void main(String[] args){
             Scanner leia = new Scanner(System.in);
             System.out.print("Digite o primeiro número: ");
             int n1 = leia.nextInt();
             System.out.print("Digite o segundo número: ");
             int n2 = leia.nextInt();
             System.out.print("Digite o simbolo: ");
             String n = leia.next();
             int nt = 0;
             if(n.charAt() == '+'){
                 nt = n1+n2;
             }
             else if(n == "-"){
                nt = n1-n2;
            }
            else if(n == "*"){
                nt = n1*n2;
            }
            else if(n == "/"){
                nt = n1/n2;
            }
            System.out.println("Resultado: "+nt);
    }
 }
 
 