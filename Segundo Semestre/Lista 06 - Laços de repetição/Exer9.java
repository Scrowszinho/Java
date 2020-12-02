    /* Luis Gustavo Godoy Camargo */
    import java.util.Scanner;
    public class Exer9 {
                public static void main(String[] args){
                Scanner leia = new Scanner(System.in);
                int a = 0;
                int n,i = 0;
                do{
                    System.out.print("Digite um valor: ");
                    n = leia.nextInt();
                    if (n>=10 && n<=20){a++;}
                    i++;
               }while(i < 10);
               System.out.print("Total de valores no intervalo: "+a);
               leia.close();
            }        
    }
      