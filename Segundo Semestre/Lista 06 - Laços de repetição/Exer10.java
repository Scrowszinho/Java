    /* Luis Gustavo Godoy Camargo */
    import java.util.Scanner;
    public class Exer10 {
                public static void main(String[] args){
                Scanner leia = new Scanner(System.in);
                int a = 0;
                int n,i = 0;
                do{
                    System.out.print("Digite um valor: ");
                    n = leia.nextInt();
                   a+=n;
                    i++;
               }while(i < 10);
               System.out.print("Média dos números: "+a/10);
               leia.close();
            }        
    }
      