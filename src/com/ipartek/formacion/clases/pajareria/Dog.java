package com.ipartek.formacion.clases.pajareria;

public class Dog extends Mammal {
	private int legs;
	private String furColor;
	
	
	public Dog() {
		super();
		this.legs = 4;
		this.furColor = "";
	}
	
	public Dog(int legs, String furColor) {
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

	
	public String getHairColor() {
		return furColor;
	}

	public void setHairColor(String hairColor) {
		this.furColor = hairColor;
	}

	
	@Override
	public String toString() {
		return super.toString() + "Dog [legs=" + legs + ", furColor=" + furColor + "]";
	}	
}
