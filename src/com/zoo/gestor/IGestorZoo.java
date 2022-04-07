package com.zoo.gestor;

import java.util.List;

import com.zoo.model.Animal;

public interface IGestorZoo {
	
	public List<Animal> getAnimales();
	public Animal getAnimalByNombre(String nombre);
	public void crearAnimal(Animal animal);

}
