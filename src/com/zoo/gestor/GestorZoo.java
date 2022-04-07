package com.zoo.gestor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.zoo.model.*;

public class GestorZoo implements IGestorZoo {
	
	// DECLARACIONES	
	private List<Animal> animales = new ArrayList<Animal>();
	
	// CONSTRUCTOR
	public GestorZoo() {
		super();
		rellenarAnimales();
	}
	
	
	// MÉTODOS
	private void rellenarAnimales() {
		AnimalSalvaje s1 = new AnimalSalvaje("Tigre: Shere Kang", 9);
		AnimalDomestico d1 = new AnimalDomestico("Rata: Basile", 4);
		AnimalDomestico d2 = new AnimalDomestico("Perro: Pluto", 7, new Owner("Fer", 40, new DNI('G', 999999999)));
		
		animales.add(s1);
		animales.add(d1);
		animales.add(d2);
	}	
	
	
	public static void mostrarZooConsola(List<Animal> animales) { // Se define static para no tener que crear una instancia
		
		for(Iterator<Animal> iterator = animales.iterator(); iterator.hasNext();) {
			Animal object = iterator.next();
						
			System.out.println(object);
		}		
	}
	
	// GETTERS Y SETTERS
	public List<Animal> getAnimales() {		
		return animales;
	}

	@Override
	public Animal getAnimalByNombre(String nombre) {
		for (Iterator iterator = animales.iterator(); iterator.hasNext();) {
			Animal animal = (Animal) iterator.next();
			if(animal.getNombre().equals(nombre)) {
				return animal;
			}
		}		
		return null;
	}
	
	public void crearAnimal(Animal animal) {
		animales.add(animal);
	}

}
