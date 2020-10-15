 /* Luis Gustavo Godoy Camargo */
 import java.util.Scanner;
 public class Exer4 {
             public static void main(String[] args){
             Scanner leia = new Scanner(System.in);
             System.out.print("Digite a primeira nota: ");
             Double n1 = leia.nextDouble();
             System.out.print("Digite a segunda nota: ");
             Double n2 = leia.nextDouble();
             Double m =(n1+n2)/2;
                if(m >= 6)
                { System.out.println("Aluno Aprovado\n Média : "+m);}
                else{System.out.println("Aluno Reprovado\n Média : "+m);}  
    }
 }
 
 