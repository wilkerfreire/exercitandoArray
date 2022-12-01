package com.loiane.estruturados.vetor.teste;

import com.loiane.estruturados.vetor.VetorObjetos;

public class Aula10 {

	public static void main(String[] args) {

		VetorObjetos vetor = new VetorObjetos(3);
		
		vetor.adiciona(3);
		vetor.adiciona(4);
		vetor.adiciona(5);
		System.out.println(vetor);
		System.out.println("Tamanho = " + vetor.getTamanho());
		
		vetor.adiciona(6);
		System.out.println(vetor);
		
		int pos = vetor.busca("");
		vetor.remove(pos);
		System.out.println(vetor);
	}

}
