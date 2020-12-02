/* Luis Gustavo Godoy Camargo */
import java.util.Scanner;
public class Exer7{
    
    public static double me = 1000000;
	public static void main (String[] args) {
		
		Scanner leia = new Scanner ( System.in );
        String sn = "";
		do{
        System.out.print("jogar o dado?(s/n): ");
        sn = leia.next();
        if(!sn.equals("n")){
            dado();
        }
        }while(!sn.equalsIgnoreCase("n"));

		
	leia.close();
	}
	

	//
	static void dado() {
        System.out.println( Math.floor(Math.random() * 6) + 1);
	}
	

}
