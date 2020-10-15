/* Luis Gustavo Godoy Camargo */
import java.io.IOException;
import java.util.Scanner;

public class Exer17 {
    public static void main(String[] args) throws IOException {
        int n1 = 0,n2 = 0;
        char res;
        Scanner leia = new Scanner(System.in);
       do{
       do{
        System.out.print("Digite o valor da primeira nota : ");   
        n1 = leia.nextInt();
        System.out.print("Digite o valor da segunda nota : ");   
        n2 = leia.nextInt();
       }while(n1 < 0 || n1>10 || n2 < 0 || n2 > 11);
       System.out.println("Média do aluno: "+(n1+n2)/2);
       System.out.print("\nQuer continuar somando a nota do aluno?(s/n) : ");   
       res = (char)System.in.read();
    }while(  res == 's');
        

        leia.close();
    }
}

