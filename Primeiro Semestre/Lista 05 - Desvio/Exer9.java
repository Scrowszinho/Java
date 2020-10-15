 /* Luis Gustavo Godoy Camargo */
 import java.util.Scanner;
 public class Exer9 {
             public static void main(String[] args){
             Scanner leia = new Scanner(System.in);
             System.out.print("Digite horas trabalhadas mensais: ");
             int h = leia.nextInt();
             System.out.print("Digite o valor da hora trabalhada: ");
             Double sal = leia.nextDouble();
             Double acre;
             acre = (double)h - 160;
             if(acre > 0){
                 sal = h*sal+(acre*(sal*1.5));
                 System.out.println("Salario final com acréscimo: R$"+sal);
             }
            else{
                sal = h*sal;
                System.out.println("Salario final sem acréscimo: R$"+sal);
            }
    }
 }
 
 