package com.zoo.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal extends SerVivo {	
		
	private List<String> animales = new ArrayList<String>();
	
	// CONSTRUCTORES
	public Animal(String nombre, int edad) {
		super(nombre, edad);	
	}	
	/*
	// GETTERS Y SETTERS	
	public List<String> getAnimales() {
		return animales;
	}

	public void setAnimales(List<String> animales) {
		this.animales = animales;
	}

	@Override
	public String toString() {
		return "Animal [animales=" + animales + "]";
	}*/
}