package com.loiane.estruturados.vetor.labs;

import com.loiane.estruturados.vetor.Lista;

public class Exerc04 {

	public static void main (String[] args) {
		
		
		Lista<String> lista = new Lista<>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		
		try {
			System.out.println(lista.obtem(4));
		} catch(IllegalArgumentException e) {
			System.out.println("Posição inválida");
		}
	}
}
