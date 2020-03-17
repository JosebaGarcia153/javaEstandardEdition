package com.ipartek.formacion.clases.pajareria;

public class Bird extends Animal {
	private int claws;
	private String featherColor;
	
	
	public Bird() {
		super();
		this.claws = 8;
		this.featherColor = "";
	}
	
	public Bird(int claws, String featherColor) {
		super();
		this.claws = claws;
		this.featherColor = featherColor;
	}

	
	public int getClaws() {
		return claws;
	}

	public void setClaws(int claws) {
		this.claws = claws;
	}

	
	public String getFeatherColor() {
		return featherColor;
	}

	public void setFeatherColor(String featherColor) {
		this.featherColor = featherColor;
	}

	
	@Override
	public String toString() {
		return super.toString() + "Bird [claws=" + claws + ", featherColor=" + featherColor + "]";
	}
}
