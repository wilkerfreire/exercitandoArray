package com.loiane.estruturados.vetor.teste;

import com.loiane.estruturados.vetor.Vetor;

public class Aula9 {

	public static void main(String[] args) {
		
		
		Vetor vetor = new Vetor(5);
		
		vetor.adiciona("B");
		vetor.adiciona("G");
		vetor.adiciona("D");
		vetor.adiciona("E");
		vetor.adiciona("F");
		
		System.out.println(vetor);
		vetor.remove(1);
		System.out.println(vetor);
		
		System.out.println("Remover o elemento A");
		int pos = vetor.busca("A");
		if(pos > -1) {
			vetor.remove(pos);
		} else {
			System.out.println("Elemento não encontrado!");
		}
		System.out.println(vetor);

	}

}
