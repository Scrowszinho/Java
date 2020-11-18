import java.util.Scanner;

public class Pedido {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Produto produtos[] = new Produto[100];
		int quantidade = 0, opcao, quanti = 0;
		double preco = 0, total = 0;
		do {

			System.out.println("=========================");
			System.out.println("Selecione o tipo da fruta");
			System.out.println("-------------------------");
			System.out.println("1) Frios");
			System.out.println("2) Paozinho");
			System.out.println("3) Doces");
			System.out.println("4) Sair");
			System.out.println("-------------------------");
			System.out.print(">> Opcao: ");
			opcao = leia.nextInt();

			switch (opcao) {
				case 1:
					
					System.out.print("Digite o preço: ");
					preco = leia.nextDouble();
					System.out.print("Digite a quantidade: ");
					quanti = leia.nextInt();
					produtos[quantidade] = new Frios(preco, quanti);
					produtos[quantidade].setPreco(preco);
					produtos[quantidade].setQuantidade(quanti);	
					total +=preco*quanti;		
					quantidade++;
					break;

				case 2:
					System.out.print("Digite o preço: ");
					preco = leia.nextDouble();
					System.out.print("Digite a quantidade: ");
					quanti = leia.nextInt();
					produtos[quantidade] = new Paozinho(preco, quanti);
					produtos[quantidade].setPreco(preco);
					produtos[quantidade].setQuantidade(quanti);			
					total +=preco*quanti;	
					quantidade++;
					break;

				case 3:
				System.out.print("Digite o preço: ");
				preco = leia.nextDouble();
				System.out.print("Digite a quantidade: ");
				quanti = leia.nextInt();
				produtos[quantidade] = new Doces(preco, quanti);
				produtos[quantidade].setPreco(preco);
				produtos[quantidade].setQuantidade(quanti);			
				total +=preco*quanti;	
				quantidade++;
					break;

				case 4:
					System.out.println("\n\tFim do programa!\n");
					break;

				default:
					System.out.println("\n\tOpcao invalida!\n");
					opcao = 1;
			}

		} while (opcao >= 1 && opcao < 4);
		for ( int i = 0 ; i < quantidade ; i++ ) {
			if ( produtos[i] != null ) {
				System.out.println( produtos[i] );
			}
		}
		System.out.println("Total do pedido:R$ "+total);
		leia.close();
	}

}
