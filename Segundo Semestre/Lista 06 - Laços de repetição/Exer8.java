    /* Luis Gustavo Godoy Camargo */
    import java.util.Scanner;
    public class Exer8 {
                public static void main(String[] args){
                Scanner leia = new Scanner(System.in);
                int a = 0;
                int n,i = 0;
                do{
                    System.out.print("Digite um valor: ");
                    n = leia.nextInt();
                    if (n<0){a++;}
                    i++;
               }while(i < 10);
               System.out.print("Total de valores negativos: "+a);
               leia.close();
            }        
    }
      