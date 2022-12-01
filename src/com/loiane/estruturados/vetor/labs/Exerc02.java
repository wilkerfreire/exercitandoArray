package com.loiane.estruturados.vetor.labs;

import java.util.ArrayList;

import com.loiane.estruturados.vetor.Lista;

public class Exerc02 {

	public static void main(String[] args) {

		ArrayList arrayList = new ArrayList<>();
			
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("A");
		
		System.out.println(arrayList.lastIndexOf("A"));
		
		Lista<String> lista = new Lista<>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("A");
		
		System.out.println(lista.ultimoIndice("A"));
	}

}
