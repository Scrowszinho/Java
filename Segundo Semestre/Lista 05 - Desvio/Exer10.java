 /* Luis Gustavo Godoy Camargo */
 import java.util.Scanner;
 public class Exer10 {
             public static void main(String[] args){
             Scanner leia = new Scanner(System.in);
             System.out.print("Digite o sálario fixo: ");
             Double salf = leia.nextDouble();
             System.out.print("Digite o valor total das vendas: ");
             Double vendas = leia.nextDouble();
             Double st = (double) 0;
             if(vendas>0 && vendas<=1500){
              st = salf+(vendas*0.03);  
             }
             else if(vendas>1500){
              st = salf+(vendas*0.05);  
             }
             System.out.print("Sálario total:R$ "+st);
    }
 }
 
 