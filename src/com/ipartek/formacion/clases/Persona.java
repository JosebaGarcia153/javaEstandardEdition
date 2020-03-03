package com.ipartek.formacion.clases;

public class Persona {
	
	private String nombre;
	private int edad;
	
	public Persona() {
		super();
		this.nombre = "anonimo";
		this.edad = 18;
	}

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
		if (edad < 0) {
			this.edad = 0;
		} else {
			this.edad = edad;
		}
	}
	
//	@Override
//	public String toString() {
//		return "[nombre=" + nombre + ", edad=" + edad + "]";
//	}
}
