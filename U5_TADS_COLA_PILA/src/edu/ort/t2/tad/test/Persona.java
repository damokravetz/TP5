package edu.ort.t2.tad.test;

public class Persona {
	int dni;
	private String nombre;

	public Persona(int dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}
	
}