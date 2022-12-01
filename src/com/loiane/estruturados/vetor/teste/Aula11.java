package com.loiane.estruturados.vetor.teste;

import com.loiane.estruturados.vetor.Lista;
import com.loiane.estruturados.vetor.VetorObjetos;

public class Aula11 {

	public static void main(String[] args) {

		Lista<Contato> vetor = new Lista<Contato>(1);
		
		Contato c1 = new Contato ("Contato 1", "1234-4567", "contato1@email.com");
		Contato c2 = new Contato ("Contato 2", "2345-6789", "contato2@email.com");
		Contato c3 = new Contato ("Contato 3", "3456-7890", "contato3@email.com");
		
		//só consegue adicionar do tipo da lista(óbvio)
		vetor.adiciona(c1);
		
	}

}
