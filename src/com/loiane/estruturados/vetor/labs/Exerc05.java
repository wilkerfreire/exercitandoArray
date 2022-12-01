package com.loiane.estruturados.vetor.labs;

import java.util.ArrayList;

import com.loiane.estruturados.vetor.Lista;

public class Exerc05 {

	public static void main(String[] args) {

		ArrayList arrayList = new ArrayList<>();

		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("A");

		arrayList.clear();
		System.out.println(arrayList); 

		Lista<String> lista = new Lista<>(5);
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");

		System.out.println(lista);
		lista.limpar();
		System.out.println(lista);
		
	}

}
