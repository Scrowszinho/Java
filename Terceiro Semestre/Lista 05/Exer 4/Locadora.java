import java.util.Scanner;

public class Floresta {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Scanner leiaStrg = new Scanner(System.in);
		Plantas floresta[] = new Plantas[100];
		int quantidade = 0, opcao;
		int contador[] = new int[4];
		String tipo[] = {"CD", "DVD", "Blu-ray", "Brochura", "Cartucho" , "Digital"};
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

				default:
					System.out.println("\n\tOpcao invalida!\n");
					opcao = 1;
			}

		} while (opcao >= 1 && opcao < 6);

		leia.close();
		leiaStrg.close();
	}

}
