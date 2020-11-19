import java.util.Scanner;

public class Floresta {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Scanner leiaStrg = new Scanner(System.in);
		Plantas floresta[] = new Plantas[100];
		int quantidade = 0, opcao;
		int contador[] = new int[4];
		String fore[] = {"Arvore", "Flor", "Carnivora"};
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
					nome = leiaStrg.nextLine();
					System.out.print("Digite a especie: ");
					especie = leiaStrg.nextLine();
					System.out.print("É frutifera? [s/n]: ");
					frutifera = leiaStrg.nextLine();
					floresta[quantidade] = new Arvore(nome, especie, frutifera);
					floresta[quantidade].setNome(nome);
					floresta[quantidade].setEspecie(especie);
					quantidade++;
					contador[0]++;
					break;

				case 2:

				
				System.out.print("Digite o nome: ");
				nome = leiaStrg.nextLine();
				System.out.print("Digite a especie: ");
				especie = leiaStrg.nextLine();
				System.out.print("Digite a cor: ");
				cor = leiaStrg.nextLine();
				floresta[quantidade] = new Flor(nome, especie, cor);
				floresta[quantidade].setNome(nome);
				floresta[quantidade].setEspecie(especie);
				quantidade++;
				contador[1]++;

					break;

				case 3:
				System.out.print("Digite o nome: ");
				nome = leiaStrg.nextLine();
				System.out.print("Digite a especie: ");
				especie = leiaStrg.nextLine();
				System.out.print("É venenosa? [s/n]: ");
				venenosa = leiaStrg.next();
				floresta[quantidade] = new Flor(nome, especie, venenosa);
				floresta[quantidade].setNome(nome);
				floresta[quantidade].setEspecie(especie);
				quantidade++;
				contador[2]++;
					break;

				case 4:
				for ( int i = 0 ; i < quantidade ; i++ ) {
					if ( floresta[i] != null ) {
					System.out.println( floresta[i] );
					}
					}
					break;

				case 5:
				for ( int i = 0 ; i < 3 ; i++ ) {
					if ( floresta[i] != null ) {
					System.out.println(fore[i]+": "+contador[i]);
					contador[3] += contador[i];
				}
				}
				System.out.println("Total de plantas: "+contador[3]);
					break;

				case 6:
					System.out.println("\n\tFim do programa!\n");
					break;

				default:
					System.out.println("\n\tOpcao invalida!\n");
					opcao = 1;
			}

		} while (opcao >= 1 && opcao < 6);

		leia.close();
		leiaStrg.close();
	}

}
