package com.loiane.estruturados.vetor.labs;

import com.loiane.estruturados.vetor.Lista;

public class Exerc03 {

	public static void main(String[] args) {

		Lista<String> lista = new Lista<>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		
		System.out.println(lista);
		
		lista.remove("B");
		System.out.println(lista);
	}

}
