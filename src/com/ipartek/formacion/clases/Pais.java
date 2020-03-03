package com.ipartek.formacion.clases;

public class Pais {
	
	//cuando se construye un pais su nombre es "" y el numero de infectados 0
	//crear getters and setters
	//crear toString
	
	private String nombre;
	private int numeroDeInfectados;
	
	public Pais() {
		super();
		this.nombre = "";
		this.numeroDeInfectados = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroDeInfectados() {
		return numeroDeInfectados;
	}

	public void setNumeroDeInfectados(int numeroInfectados) {
		if (numeroDeInfectados < 0) {
			this.numeroDeInfectados = 0;
		}else {
			this.numeroDeInfectados = numeroInfectados;
		}
	}

	@Override
	public String toString() {
		return "[Pais=" + nombre + ", numeroDeInfectados=" + numeroDeInfectados + "]";
	}	
}
