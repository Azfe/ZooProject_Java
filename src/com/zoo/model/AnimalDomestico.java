package com.zoo.model;

import java.util.List;

public class AnimalDomestico extends Animal {
	
	private Owner owner;

	// CONSTRUCTORES
	public AnimalDomestico(String nombre, int edad) {
		super(nombre, edad);		
	}

	public AnimalDomestico(String nombre, int edad, Owner owner) {
		super(nombre, edad);
		this.owner = owner;
	}

	// GETTERS Y SETTERS
	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
				
		return super.toString() + " - Animal Domestico [owner=" + owner + "]";
	}	

}
