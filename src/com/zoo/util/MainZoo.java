package com.zoo.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.zoo.gestor.GestorZoo;
import com.zoo.model.*;

public class MainZoo {

	public static void main(String[] args) {

		List<Animal> animales = new ArrayList<Animal>();

		AnimalSalvaje s1 = new AnimalSalvaje("León: Simba", 10);
		AnimalDomestico d1 = new AnimalDomestico("Gato: Coppola", 7);
		AnimalDomestico d2 = new AnimalDomestico("Perro: Pluto", 9, new Owner("Fer", 40, new DNI('A', 999999999)));
				
		animales.add(s1);
		animales.add(d1);
		animales.add(d2);
		
		//GestorZoo.mostrarZooConsola(animales);
		
		GestorZoo gz = new GestorZoo();
		
		List<Animal> animAux = gz.getAnimales();
		
		if (animAux.size()==0) {
			System.out.println("NO HAY ANIMALES EN LA LISTA");
			
		}else {
			System.out.println("HAY " + animAux.size() + " ANIMALES EN LA LISTA");
		}
		
		for (Iterator iterator = animAux.iterator(); iterator.hasNext();) {
			Animal animal = (Animal) iterator.next();
			System.out.println(animal);			
		}
		
		System.out.println("--------------------------------");
		Animal animal = gz.getAnimalByNombre("Perro: Pluto");
		System.out.println(animal);
		
		System.out.println("--------------------------------");
		Animal animal2 = gz.getAnimalByNombre("Pluto");
		if(animal2 == null) {
			System.out.println("NO EXISTE EL ANIMAL");
		}else {			
			System.out.println(animal2.getNombre());
		}
		
		System.out.println("--------------------------------");
		AnimalSalvaje s2 = new AnimalSalvaje("Pantera: Bagheera", 15);
		gz.crearAnimal(s2);
		
		GestorZoo.mostrarZooConsola(gz.getAnimales());

	}
}