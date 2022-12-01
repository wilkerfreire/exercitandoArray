package com.loiane.estruturados.vetor.labs;

import java.util.Scanner;
import com.loiane.estruturados.vetor.Lista;
import com.loiane.estruturados.vetor.teste.Contato;

public class Exerc06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//criar vetor com 20 de capacidade
		Lista<Contato> lista = new Lista<>(20);

		//criar e adc 30 contatos (ou menos)
		criarContatosDinamicamente(5, lista);

		//criar um menu para que o usuário escolha o método
		int opcao = 1;

		while(opcao != 0) {
			opcao = obterOpcaoMenu(sc);

			switch (opcao) {
			case 1:
				adicionarContatoFinal(sc, lista);
				break;
			case 2:
				adicionarContatoPosicao(sc, lista);
				break;
			case 3: 
				obtemContatoPosicao(sc, lista);
				break;
			case 4: 
				obtemContato(sc, lista);
				break;
			case 5: 
				pesquisarUltimoIndice(sc, lista);
				break;
			case 6: 
				pesquisarContatoExiste(sc, lista);
				break;
			case 7: 
				excluirPorPosicao(sc, lista);
				break;
			case 8: 
				excluirContato(sc, lista);
				break;
			case 9: 
				imprimeTamanhoVetor(lista);
				break;
			case 10: 
				limparVetor(lista);
				break;
			case 11: 
				imprimirVetor(lista);
				break;
			default:
				break;
			}
		}
		System.out.println("Usuário digitou 0, programa terminado");

	}
	
	private static void imprimirVetor(Lista<Contato> lista) {
		System.out.println(lista);
	}
	
	private static void limparVetor(Lista<Contato> lista) {
		lista.limpar();
		System.out.println("Todos os contatos do vetor foram excluídos");
	}
	
	private static void imprimeTamanhoVetor(Lista<Contato> lista) {
		System.out.println("Tamanho vetor é " + lista.getTamanho());
	}

	private static void excluirPorPosicao(Scanner sc, Lista<Contato> lista) {

		int pos = leInformacaoInt("Entre com a posição a ser removida", sc);

		try {
			lista.remove(pos);
			System.out.println("Contato excluído");
		} catch (Exception e){
			System.out.println("Posição inválida, tente novamente");
		}
	}
	
	private static void excluirContato(Scanner sc, Lista<Contato> lista) {

		int pos = leInformacaoInt("Entre com a posição a ser removida", sc);

		try {
			Contato contato = lista.busca(pos);
			lista.remove(contato);
			System.out.println("Contato excluído");
		} catch (Exception e){
			System.out.println("Posição inválida, tente novamente");
		}
	}

	private static void pesquisarContatoExiste(Scanner sc, Lista<Contato> lista) {

		int pos = leInformacaoInt("Entre com a posição a ser pesquisada", sc);

		try {
			Contato contato = lista.busca(pos);

			boolean existe = lista.contem(contato);
			if(existe) {
				System.out.println("Contato existe, seguem dados: ");
				System.out.println(contato);
			} else {
				System.out.println("Contato não existe");
			}
		} catch (Exception e){
			System.out.println("Posição inválida, tente novamente");
		}
	}

	private static void obtemContato(Scanner sc, Lista<Contato> lista) {

		int pos = leInformacaoInt("Entre com a posição a ser pesquisada", sc);

		try {
			Contato contato = lista.busca(pos);
			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do contato encontrado:");
			pos = lista.busca(contato);

			System.out.println("Contato encontrado na posição" + pos);

		} catch (Exception e){
			System.out.println("Posição inválida, tente novamente");
		}
	}

	private static void pesquisarUltimoIndice(Scanner sc, Lista<Contato> lista) {

		int pos = leInformacaoInt("Entre com a posição a ser pesquisada", sc);

		try {
			Contato contato = lista.busca(pos);
			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do último índice do contato encontrado:");
			pos = lista.ultimoIndice(contato);

			System.out.println("Contato encontrado na posição" + pos);

		} catch (Exception e){
			System.out.println("Posição inválida, tente novamente");
		}
	}

	private static void obtemContatoPosicao(Scanner sc, Lista<Contato> lista) {

		int pos = leInformacaoInt("Entre com a posição a ser pesquisada", sc);

		try {
			Contato contato = lista.busca(pos);
			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);

		} catch (Exception e){
			System.out.println("Posição inválida, tente novamente");
		}
	}

	private static void adicionarContatoFinal(Scanner sc, Lista<Contato> lista) {
		System.out.println("Criando um contato, entre com as informações:");
		String nome = leInformacao("Entre com o nome", sc);
		String telefone = leInformacao("Entre com o telefone", sc);
		String email = leInformacao("Entre com o email", sc);

		Contato contato = new Contato(nome, telefone, email);
		lista.adiciona(contato);
		System.out.println("Contato adicionado com sucesso!");
		System.out.println(contato);
	}

	private static void adicionarContatoPosicao(Scanner sc, Lista<Contato> lista) {
		System.out.println("Criando um contato, entre com as informações:");
		String nome = leInformacao("Entre com o nome", sc);
		String telefone = leInformacao("Entre com o telefone", sc);
		String email = leInformacao("Entre com o email", sc);

		Contato contato = new Contato(nome, email, telefone);
		int pos = leInformacaoInt("Entre com a posição desejada", sc);

		try {
			lista.adiciona(pos, contato);
			System.out.println("Contato adicionado com sucesso!");
			System.out.println(contato);
		} catch (Exception e) {
			System.out.println("Posição inválida, não adicionado");
		}
	}

	protected static int leInformacaoInt(String msg, Scanner sc) {
		boolean entradaValida = false;
		int num = 0;
		while(!entradaValida) {
			try {
				System.out.println(msg);
				String entrada = sc.nextLine();
				num = Integer.parseInt(entrada);
				entradaValida = true;
			} catch (Exception e) {
				System.out.println("Entrada inválida, digite novamente");
			}
		}

		return num;
	}

	protected static String leInformacao(String msg, Scanner sc) {
		System.out.println(msg);
		return sc.nextLine();
	}

	protected static int obterOpcaoMenu(Scanner sc) {
		boolean entradaValida = false;
		int opcao = 0;
		String entrada;

		while(!entradaValida) {
			System.out.println("Digite a opção desejada:");
			System.out.println("1 - Adiciona contato no final do vetor;");
			System.out.println("2 - Adiciona contato em uma opção específica");
			System.out.println("3 - Obtém contato de uma posição específica");
			System.out.println("4 - Busca contato");
			System.out.println("5 - Consulta ultimo indice do contato");
			System.out.println("6 - Verifica se o contato existe");
			System.out.println("7 - Excluir por posição");
			System.out.println("8 - Excluir contato");
			System.out.println("9 - Verifica tamanho do vetor");
			System.out.println("10 - Excluir todos os contatos do vetor");
			System.out.println("11 - Imprime vetor");
			System.out.println("0 - Sair");

			try {
				entrada = sc.nextLine();
				opcao = Integer.parseInt(entrada);
				if(opcao >= 0 && opcao <= 11) {
					entradaValida = true;
				} else {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println("Entrada inválida, digite novamente\n\n");
			}
		}

		return opcao;
	}

	protected static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista) {
		Contato contato;
		for(int i = 1; i <= quantidade; i++) {
			contato = new Contato();
			contato.setNome("Contato " + i);
			contato.setNumero("1111111" + i);
			contato.setEmail("contato" + i + "@email.com");
			lista.adiciona(contato);
		}
	}
}


