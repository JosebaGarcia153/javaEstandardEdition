package com.ipartek.formacion.clases;

public class Vehiculo {
	

	private String matricula;
	private String color;
	private int numAsientos;
	private int numRuedas;
	private int numPuertas;
	private float potencia; //cv
	
	
	public Vehiculo() {
		super();
		this.matricula = "";
		this.color = "";
		this.numAsientos = 0;
		this.numRuedas = 0;
		this.numPuertas = 0;
		this.potencia = 0f;
	}
	
	public Vehiculo(String matricula, String color) {
		this();
		this.matricula = matricula;
		this.color = color;
	}
	
	public Vehiculo(String matricula, String color, int numPuertas) {
		this(matricula, color);
		//this.matricula = matricula;
		//this.color = color;
		this.numPuertas = numPuertas;
	}
	
	public Vehiculo(String matricula, String color, int numAsientos, int numRuedas, int numPuertas, float potencia) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.numAsientos = numAsientos;
		this.numRuedas = numRuedas;
		this.numPuertas = numPuertas;
		this.potencia = potencia;
	}
	
	
	public String getMatricula() {
		return matricula;
	}
	
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public int getNumAsientos() {
		return numAsientos;
	}
	
	public void setNumAsientos(int numAsientos) {
		this.numAsientos = numAsientos;
	}
	
	
	public int getNumRuedas() {
		return numRuedas;
	}
	
	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}
	
	
	public int getNumPuertas() {
		return numPuertas;
	}
	
	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	
	
	public float getPotencia() {
		return potencia;
	}
	
	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}
	
	
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", color=" + color + ", numAsientos=" + numAsientos + ", numRuedas="
				+ numRuedas + ", numPuertas=" + numPuertas + ", potencia=" + potencia + "]";
	}
}
