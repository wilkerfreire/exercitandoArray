package com.loiane.estruturados.vetor.labs;

import com.loiane.estruturados.vetor.Lista;

public class Exerc01 {

	public static void main(String[] args) {

		Lista<String> lista = new Lista<String>(10);
			
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		
		boolean contem = lista.contem("B");
		System.out.println(contem);
		System.out.println(lista.contem("F"));
	}

}
