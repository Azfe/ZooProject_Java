package com.zoo.model;

public class Owner extends SerVivo{
	
	// DECLARACIONES	
	private DNI dni;

	// CONSTRUCTORES
	public Owner(String nombre, int edad) {
		super(nombre, edad);		
	}
	
	public Owner(String nombre, int edad, DNI dni) {
		super(nombre, edad);	
		this.dni = dni;
	}

	// GETTERS Y SETTERS
	public DNI getDni() {
		return dni;
	}

	public void setDni(DNI dni) {
		this.dni = dni;
	}

	/*
	@Override
	public String toString() {
		return "Owner [dni=" + dni + "]";
	}*/
	
	@Override
	public String toString() {
		return super.toString() + "- Amo [dni=" + dni + "]";
	}

}