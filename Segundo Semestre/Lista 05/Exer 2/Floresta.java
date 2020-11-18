import java.util.Scanner;

public class Floresta {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Plantas floresta[] = new Plantas[100];
		int quantidade = 0, opcao;
		String nome, especie, cor, frutifera, venenosa;
		do {

			System.out.println("=========================");
			System.out.println("Selecione o tipo da fruta");
			System.out.println("-------------------------");
			System.out.println("1) Árvore");
			System.out.println("2) Flor");
			System.out.println("3) Carnívora");
			System.out.println("4) Lista Plantas");
			System.out.println("5) Quantidade de Plantas na floresta");
			System.out.println("6) Sair");
			System.out.println("-------------------------");
			System.out.print(">> Opcao: ");
			opcao = leia.nextInt();

			switch (opcao) {
				case 1:

					System.out.print("Digite o nome: ");
					nome = leia.nextLine();
					System.out.print("Digite a especie: ");
					especie = leia.nextLine();
					System.out.print("É frutifera? [s/n]: ");
					frutifera = leia.nextLine();
					floresta[quantidade] = new Arvore(nome, especie, frutifera);
					floresta[quantidade].setNome(nome);
					floresta[quantidade].setEspecie(especie);
					quantidade++;
					break;

				case 2:

				
				System.out.print("Digite o nome: ");
				nome = leia.nextLine();
				System.out.print("Digite a especie: ");
				especie = leia.nextLine();
				System.out.print("Digite a cor: ");
				cor = leia.nextLine();
				floresta[quantidade] = new Flor(nome, especie, cor);
				floresta[quantidade].setNome(nome);
				floresta[quantidade].setEspecie(especie);
				quantidade++;

					break;

				case 3:
				System.out.print("Digite o nome: ");
				nome = leia.nextLine();
				System.out.print("Digite a especie: ");
				especie = leia.nextLine();
				System.out.print("É venenosa? [s/n]: ");
				venenosa = leia.nextLine();
				floresta[quantidade] = new Flor(nome, especie, venenosa);
				floresta[quantidade].setNome(nome);
				floresta[quantidade].setEspecie(especie);
				quantidade++;
					break;

				case 4:
				for ( int i = 0 ; i < quantidade ; i++ ) {
					if ( floresta[i] != null ) {
					System.out.println( floresta[i] );
					}
					}
					break;

				case 5:
					
					break;

				case 6:
					System.out.println("\n\tFim do programa!\n");
					break;

				default:
					System.out.println("\n\tOpcao invalida!\n");
					opcao = 1;
			}

		} while (opcao >= 1 && opcao < 4);

		leia.close();
	}

}
