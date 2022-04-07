package com.zoo.model;

public abstract class SerVivo {
	
	private String nombre;
	private int edad;
	
	// CONSTRUCTORES	
	public SerVivo() {
		super();		
	}	
	
	public SerVivo(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "[nombre=" + nombre + ", edad=" + edad + "]";
	}
}
