package com.zoo.model;

public class DNI {
	
	private char letra;
	private long numero;

	// CONSTRUCTOR POR ARGUMENTOS
	public DNI(char letra, long numero) {
		super();
		this.letra = letra;
		this.numero = numero;
	}

	// SOBRECARGA CONSTRUCTOR
	// CONSTRUCTOR POR ARGUMENTOS
	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "DNI [letra=" + letra + ", numero=" + numero + "]";
	}
}
