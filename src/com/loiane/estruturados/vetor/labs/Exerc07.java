package com.loiane.estruturados.vetor.labs;

import java.util.ArrayList;
import java.util.Scanner;
import com.loiane.estruturados.vetor.teste.Contato;

public class Exerc07 extends Exerc06{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//criar vetor com 20 de capacidade
		ArrayList<Contato> lista = new ArrayList<>(20);

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

	private static void imprimirVetor(ArrayList<Contato> lista) {
		System.out.println(lista);
	}

	private static void limparVetor(ArrayList<Contato> lista) {
		lista.clear();
		System.out.println("Todos os contatos do vetor foram excluídos");
	}

	private static void imprimeTamanhoVetor(ArrayList<Contato> lista) {
		System.out.println("Tamanho vetor é " + lista.size());
	}

	private static void excluirPorPosicao(Scanner sc, ArrayList<Contato> lista) {

		int pos = leInformacaoInt("Entre com a posição a ser removida", sc);

		try {
			lista.remove(pos);
			System.out.println("Contato excluído");
		} catch (Exception e){
			System.out.println("Posição inválida, tente novamente");
		}
	}

	private static void excluirContato(Scanner sc, ArrayList<Contato> lista) {

		int pos = leInformacaoInt("Entre com a posição a ser removida", sc);

		try {
			Contato contato = lista.get(pos);
			lista.remove(contato);
			System.out.println("Contato excluído");
		} catch (Exception e){
			System.out.println("Posição inválida, tente novamente");
		}
	}

	private static void pesquisarContatoExiste(Scanner sc, ArrayList<Contato> lista) {

		int pos = leInformacaoInt("Entre com a posição a ser pesquisada", sc);

		try {
			Contato contato = lista.get(pos);

			boolean existe = lista.contains(contato);
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

	private static void obtemContato(Scanner sc, ArrayList<Contato> lista) {

		int pos = leInformacaoInt("Entre com a posição a ser pesquisada", sc);

		try {
			Contato contato = lista.get(pos);
			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do contato encontrado:");
			pos = lista.indexOf(contato);

			System.out.println("Contato encontrado na posição" + pos);

		} catch (Exception e){
			System.out.println("Posição inválida, tente novamente");
		}
	}

	private static void pesquisarUltimoIndice(Scanner sc, ArrayList<Contato> lista) {

		int pos = leInformacaoInt("Entre com a posição a ser pesquisada", sc);

		try {
			Contato contato = lista.get(pos);
			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do último índice do contato encontrado:");
			pos = lista.lastIndexOf(contato);

			System.out.println("Contato encontrado na posição" + pos);

		} catch (Exception e){
			System.out.println("Posição inválida, tente novamente");
		}
	}

	private static void obtemContatoPosicao(Scanner sc, ArrayList<Contato> lista) {

		int pos = leInformacaoInt("Entre com a posição a ser pesquisada", sc);

		try {
			Contato contato = lista.get(pos);
			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);

		} catch (Exception e){
			System.out.println("Posição inválida, tente novamente");
		}
	}

	private static void adicionarContatoFinal(Scanner sc, ArrayList<Contato> lista) {
		System.out.println("Criando um contato, entre com as informações:");
		String nome = leInformacao("Entre com o nome", sc);
		String telefone = leInformacao("Entre com o telefone", sc);
		String email = leInformacao("Entre com o email", sc);

		Contato contato = new Contato(nome, telefone, email);
		lista.add(contato);
		System.out.println("Contato adicionado com sucesso!");
		System.out.println(contato);
	}

	private static void adicionarContatoPosicao(Scanner sc, ArrayList<Contato> lista) {
		System.out.println("Criando um contato, entre com as informações:");
		String nome = leInformacao("Entre com o nome", sc);
		String telefone = leInformacao("Entre com o telefone", sc);
		String email = leInformacao("Entre com o email", sc);

		Contato contato = new Contato(nome, email, telefone);
		int pos = leInformacaoInt("Entre com a posição desejada", sc);

		try {
			lista.add(pos, contato);
			System.out.println("Contato adicionado com sucesso!");
			System.out.println(contato);
		} catch (Exception e) {
			System.out.println("Posição inválida, não adicionado");
		}
	}

	private static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> lista) {
		Contato contato;
		for(int i = 1; i <= quantidade; i++) {
			contato = new Contato();
			contato.setNome("Contato " + i);
			contato.setNumero("1111111" + i);
			contato.setEmail("contato" + i + "@email.com");
			lista.add(contato);
		}
	}
}


