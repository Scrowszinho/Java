// Luis Gustavo Godoy Camargo
import java.util.Scanner;   
public class UsaConversaoDeUnidadesDeArea {

    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        ConversaoDeUnidadesDeArea cvs;
        //
        System.out.print("Digite o total em metros: ");
        Double t = leia.nextDouble();
        cvs = new ConversaoDeUnidadesDeArea(t);
        System.out.println("Total em pés quadrado: "+cvs.mp());
        System.out.println("Total em centimetros quadrados: "+cvs.pcq());
        System.out.println("Total em acres: "+cvs.pqa());
        System.out.println("Total em milhas quadradas : "+cvs.apm());

        leia.close();
    
    }
}
