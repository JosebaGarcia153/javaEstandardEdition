package com.ipartek.formacion.clases.pajareria;

public class Cat extends Mammal {
	private int legs;
	private String furColor;
	
	public Cat() {
		super();
		this.legs = 4;
		this.furColor = "";
	}
	
	public Cat(int legs, String furColor) {
		super();
		this.legs = legs;
		this.furColor = furColor;
	}


	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	
	public String getFurColor() {
		return furColor;
	}

	public void setFurColor(String hairColor) {
		this.furColor = hairColor;
	}

	
	@Override
	public String toString() {
		return super.toString() + "legs=" + legs + ", furColor=" + furColor;
	}	
}
