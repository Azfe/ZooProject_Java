package com.zoo.model;

public class AnimalSalvaje extends Animal {

	public AnimalSalvaje(String nombre, int edad) {
		super(nombre, edad);		
	}

	@Override
	public String toString() {
		return super.toString() + " - Animal Salvaje []";
	}	
}