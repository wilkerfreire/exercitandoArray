package com.loiane.estruturados.vetor.teste;

import com.loiane.estruturados.vetor.Vetor;

public class Aula7 {

	public static void main(String[] args) {
		//Vetores e arrays: adicionar elemento em qualquer posição.
		
		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("E");
		vetor.adiciona("F");
		vetor.adiciona("G");
		
		System.out.println(vetor);
		System.out.println("TAMANHO: " + vetor.getTamanho());
		
		vetor.adiciona(0, "A");
		
		System.out.println("APÓS ADICIONAR: " + vetor);
		System.out.println("TAMANHO: " + vetor.getTamanho());
		
		vetor.adiciona(3, "D");
		System.out.println("APÓS ADICIONAR: " + vetor);
		System.out.println("TAMANHO: " + vetor.getTamanho());
		
		
	}

}
