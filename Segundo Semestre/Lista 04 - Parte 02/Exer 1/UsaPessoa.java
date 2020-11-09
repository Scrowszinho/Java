// Luis Gustavo Godoy Camargo
import java.util.Scanner;
public class UsaPessoa {

    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        Pessoa pes = new Pessoa();
        //
        pes.setNome ("Luis bonito Gugu");
		pes.setIdade(19);
		pes.setAltura(1.75);
        System.out.print("Digite o dia do seu aniversario: ");
        int aniversario = leia.nextInt();
        leia.close();
        pes.fazAniversario(aniversario);
        //
		System.out.println( pes.getNome());
		System.out.println( pes.getIdade());
        System.out.println( pes.getAltura());
        //
       
        

    }

}
