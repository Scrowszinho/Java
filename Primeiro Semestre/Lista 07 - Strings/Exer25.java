
/* Luis Gustavo Godoy Camargo */
import java.io.IOException;
import java.util.Scanner;

public class Exer25 {
    public static void main(String[] args) throws IOException {
        String res = "";
        int c = 0, t = 0;
        Scanner leia = new Scanner(System.in);
        
        do {
            System.out.print("Digite uma senha: ");
            res = leia.nextLine();
            t = res.length();
            do {
                if (t < 10) {
                    System.out.println("Tamanho 10:" + "(x)");
                    break;
                } else {
                    System.out.println("Tamanho 10:" + "(ok)");
                    c++;
                }
            } while (c < 1);
            t = 0;


            do {
                for (int caractere = 'a'; caractere <= 'z'; caractere++) {
                    for (int caractere1 = 'A'; caractere1 <= 'Z'; caractere1++) {
                        for (int i = 0; i < res.length(); i++) {
                            if (res.charAt(i) == caractere || res.charAt(i) == caractere1) {
                                t++;
                            }
                        }
                    }
                }
                if (t >= 3) {
                    System.out.println("Letras 3:" + "(ok)");
                    c++;
                } else {
                    System.out.println("Letras 3:" + "(x)");
                    break;
                }
            } while (c < 2);
            t = 0;
           
           
           
            do {
                for (int caractere1 = 0; caractere1 <= 9; caractere1++) {
                    for (int i = 0; i < res.length(); i++) {
                        if (res.charAt(i) == caractere1) {
                            t++;
                        }
                    }
                }
                if (t >= 3) {
                    System.out.println("Números 3:" + "(ok)");
                    c++;
                } else {
                    System.out.println("Números 3:" + "(x)");
                    break;
                }
            } while (c < 3);
            t = 0;
           
              
            do {
                for (int i = 0; i < res.length(); i++) {
                    if (res.charAt(i) == '!' || res.charAt(i) == '@' || res.charAt(i) == '#' || res.charAt(i) == '$'
                            || res.charAt(i) == '%' || res.charAt(i) == '¨' || res.charAt(i) == '&'
                            || res.charAt(i) == '*') {
                        t++;
                    }
                }
                if (t >= 2) {
                    System.out.println("Símbolos 2:" + "(ok)");
                    c++;
                } else {
                    System.out.println("Símbolos 2:" + "(x)");
                    break;
                }
            } while (c < 4);

        } while (c < 4);
        leia.close();
    }
}
