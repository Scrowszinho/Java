/* Luis Gustavo Godoy Camargo */
import java.io.IOException;
import java.util.Scanner;
 
public class Exer19{
    public static void main(String[] args) throws IOException {
        String res = "",re = "";
        int  i = 1,v;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a palavra a ser verificada: ");
        res = leia.nextLine();
        leia.close();
        v = res.length();
        for(i=v-1;i>=0;i--){  
            re += res.charAt(i);
         }

         if(res.equals(re)){ 
         System.out.print(res + " É uma palavra palindroma");} 
    else {
    System.out.print(res + " Não é uma palavra palindroma"); 
    }

   
    }
}
