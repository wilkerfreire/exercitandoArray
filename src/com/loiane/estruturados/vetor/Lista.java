package com.loiane.estruturados.vetor;

import java.lang.reflect.Array;

public class Lista<T>  {
	
	private T[] elementos;
	private int tamanho;
	
	public Lista(int capacidade) {
		this.elementos = (T[])new Object[capacidade];
		this.tamanho = 0;
	}
	
	public Lista(int capacidade, Class<T> tipoClasse) {
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;
	}
	
	public boolean adiciona(T elemento) {
		this.aumentaCapacidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean adiciona(int posicao, T elemento) {
		if(!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		} 
		
		this.aumentaCapacidade();
		
		//mover todos os elementos
		for(int i = tamanho; i > posicao; i--) {
			this.elementos[i] = this.elementos[i-1];
		}
		this.elementos[posicao] = elemento;
		//tamanho real aumentou(um elemento foi adc), então: 
		this.tamanho++;
		
		return true;
	}
	
	private void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for(int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	public T busca(int posicao) {
		if(!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		} 
		return this.elementos[posicao];
	}
	
	public int busca(T elemento) {
		for(int i = 0; i < this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			} 
		}
		return -1;
	}
	
	public void remove(int posicao) {
		if(!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		} 
		for(int i = posicao; i < this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
	}
	
	public int getTamanho() {
		return this.tamanho;
	}
	
	public boolean contem(T elemento) { //exercise 01
		return busca(elemento) > -1;
	}
	
	public int ultimoIndice(T elemento) { //exercise 02
		int ultimaPos = -1;
		for (int i = this.tamanho-1; i >= 0; i--) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	public void remove(T elemento) { //exercise 03
		int pos = this.busca(elemento);
		if (pos > -1) {
			this.remove(pos);
		} 
	}
	
	public T obtem(int posicao) { //exercise 04
		return this.busca(posicao);
	}
	
	public void limpar() { //exercise 05
		for(int i = 0; i < this.tamanho; i++) {
			this.elementos[i] = null;
		}
		this.tamanho = 0;
	}
	
	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		
		s.append("[");
		
		for (int i=0; i<this.tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		if(this.tamanho>0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		
		s.append("]");
		
		return s.toString();
	}
}
