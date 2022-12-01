package com.loiane.estruturados.vetor.teste;

import com.loiane.estruturados.vetor.Vetor;

public class Aula4 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(2);
		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");
		
		System.out.println("Tamanho: " + vetor.getTamanho());
		System.out.println("Vetor: " + vetor);
		
	}

}
