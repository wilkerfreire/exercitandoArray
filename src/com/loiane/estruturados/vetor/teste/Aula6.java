package com.loiane.estruturados.vetor.teste;

import com.loiane.estruturados.vetor.Vetor;

public class Aula6 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(2);
		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");
		
		//sem ignore case
		System.out.println(vetor.busca("elemento 1"));
		System.out.println(vetor.busca("elemento 2"));
		System.out.println(vetor.busca("elemento 3"));
		System.out.println(vetor.busca("elemento 4"));
	}

}
