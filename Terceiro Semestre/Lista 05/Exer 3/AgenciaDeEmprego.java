/*
 * AgenciaDeEmprego.java
 * 
 */

import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class AgenciaDeEmprego {

	static Scanner leia    = new Scanner ( System.in );
	static Scanner leiaStr = new Scanner ( System.in );
		
	static int qtdeCandidatos = 0, maxCandidatos = 100;
	static int qtdeVagas = 0,      maxVagas = 100;
	static int qtdeCV = 0,         maxCV = maxCandidatos * maxVagas;
	static int opcao = 0;
		
	static Candidato[]     candidatos = new Candidato     [ maxCandidatos ];
	static Vaga[]          vagas      = new Vaga          [ maxVagas ];
	static CandidatoVaga[] cv         = new CandidatoVaga [ maxCV ];
	
	
	public static void main (String[] args) {
		
		if ( ! lerCandidatosEmpregadosDoArquivo () ) {
			System.out.println("\n\tProblemas ao carregar os Candidatos Empregados do arquivo!\n");
		}
		
		do {
			System.out.println("=== M E N U ===");
			System.out.println("1) Cadastrar Candidato");
			System.out.println("2) Cadastrar Vaga");
			System.out.println("3) Cadastrar Condidato x Vaga");
			System.out.println("4) Listar Candidatos");
			System.out.println("5) Listar Vagas");
			System.out.println("6) Sair");
			
			System.out.print(">>> Opcao: ");
			opcao = leia.nextInt();
			
			switch ( opcao ) {
				case 1:
					cadastrarCandidato ();
					break;
				case 2:
					cadastrarVaga ();
					break;
				case 3:
					//cadastrarCandidatoVaga ();
					break;
				case 4:
					listarCandidatos ();
					break;
				case 5:
					listarVagas ();
					break;
				case 6:
				default:
			}
			
		} while ( true );
		
	}
	
	//
	static void cadastrarCandidato () {
		
		String 	nome    = "",
				empresa = "",
				opcaoCandidato = "";
		int 	idade = 0,
				meses = 0;
		
		if ( qtdeCandidatos < maxCandidatos ) {
			
			System.out.print("\nNome do Candidato: ");
			nome = leiaStr.nextLine();
			
			System.out.print("Idade do Candidato: ");
			idade = leia.nextInt();
			
			System.out.print("\nCandidato Empregado ou Desempregado [E/D]: ");
			opcaoCandidato = leiaStr.nextLine();
			
			if ( opcaoCandidato.equalsIgnoreCase("E") ) {

				System.out.print("\nNome da Empresa que trabalha atualmente: ");
				empresa = leiaStr.nextLine();
				
				candidatos [ qtdeCandidatos ] = new Empregado ( nome, idade, empresa );
				
			} else {
				
				System.out.print("Tempo em meses que esta desempregado: ");
				meses = leia.nextInt();
				
				candidatos [ qtdeCandidatos ] = new Desempregado ( nome, idade, meses );
			
			}
			
			System.out.print("\nSalvar Cadastro do Candidato [S/N]: ");
			
			if ( leiaStr.nextLine().equalsIgnoreCase("S") ) {
				
				qtdeCandidatos++;
			}
			
			
		} else {
			
			System.out.println("\n\tErro! Quantidade maxima de cadastros atingida...\n");
		}
	}
	
	//
	static void cadastrarVaga () {
		
		String 	descric   = "",
				opcaoVaga = "";
		double 	salario   = 0.0;
		int		tempo     = 0;
		
		if ( qtdeVagas < maxVagas ) {
			
			System.out.print("\nVaga de Estagio ou de Trabalho [E/T]: ");
			opcaoVaga = leiaStr.nextLine();

			vagas [ qtdeVagas ] = 
				( opcaoVaga.equalsIgnoreCase("E") ? new Estagio() : new Trabalho() );

			System.out.print("\nDescricao da Vaga: ");
			vagas [ qtdeVagas ].setDescricao ( leiaStr.nextLine() );
			
			System.out.print("Salario para a Vaga: ");
			vagas [ qtdeVagas ].setSalario ( leia.nextDouble() );
			
			
			if ( opcaoVaga.equalsIgnoreCase("E") ) {

				System.out.print("\nEstagio por quanto tempo em meses: ");
				( (Estagio) vagas [ qtdeVagas ] ).setTempo ( leia.nextInt() );
				
			} else {
				
				Trabalho trabalho = (Trabalho) vagas [ qtdeVagas ];
				System.out.print("Trabalho temporario [S/N]: ");
				trabalho.setTemporario ( leiaStr.nextLine().equalsIgnoreCase("S") );
				
			}
			
			System.out.print("\nSalvar Cadastro da Vaga [S/N]: ");
			
			if ( leiaStr.nextLine().equalsIgnoreCase("S") ) {
				
				qtdeVagas++;
			}
			
			
		} else {
			
			System.out.println("\n\tErro! Quantidade maxima de cadastros atingida...\n");
		}		
	}
	
	//
	static void listarCandidatos () {
		
		System.out.println("\n\tListagem de Candidatos\n");
		
		for ( int atual = 0 ; atual < qtdeCandidatos ; atual++ ) {
		
			System.out.println( candidatos [ atual ] );
		}
		
		System.out.println("\n");
	}
	
	//
	static void listarVagas () {
		
		System.out.println("\n\tListagem de Vagas\n");
		
		for ( int atual = 0 ; atual < qtdeVagas ; atual++ ) {
		
			System.out.println( vagas [ atual ] );
		}
		
		System.out.println("\n");
	}
	
	//
	static boolean lerCandidatosEmpregadosDoArquivo () {
		
        try {
            FileReader fr = new FileReader("CandidatosEmpregados.txt");
            BufferedReader br = new BufferedReader(fr);

            while ( br.ready() ) {
               
                String linha = br.readLine();
                
				String campos[] = linha.split( ";" );
				
				if ( campos.length == 3 ) {

					candidatos [ qtdeCandidatos ] = new Empregado (
						campos[0],
						Integer.parseInt ( campos[1] ),
						campos[2]
					);
					qtdeCandidatos++;
				}
            }
            
            br.close();
            fr.close();
            
            return true;

        } catch ( IOException ex ) {
            
            return false;
        }
		
	}
}

