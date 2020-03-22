package com.ipartek.formacion.clases.pajareria;

public class Mammal extends Animal {
	boolean hasFur;

	public Mammal() {
		super();
		this.hasFur = false;
	}

	public Mammal(String name, String eyeColor, char gender, float size, float weight, boolean hasFur) {
		super(name, eyeColor, gender, size, weight);
		this.hasFur = hasFur;
	}

	
	public boolean isHasFur() {
		return hasFur;
	}

	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}

	@Override
	public String toString() {
		return super.toString() + "hasFur=" + hasFur + " ";
	}
}
