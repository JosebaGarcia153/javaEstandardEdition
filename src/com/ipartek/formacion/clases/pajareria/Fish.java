package com.ipartek.formacion.clases.pajareria;

public class Fish extends Animal {
	private int fins;
	private String scaleColor;
	
	
	public Fish() {
		super();
		this.fins = 0;
		this.scaleColor = "";
	}
	
	public Fish(int fins, String scaleColor) {
		super();
		this.fins = fins;
		this.scaleColor = scaleColor;
	}

	
	public int getFins() {
		return fins;
	}

	public void setFins(int fins) {
		this.fins = fins;
	}

	
	public String getScaleColor() {
		return scaleColor;
	}

	public void setScaleColor(String scaleColor) {
		this.scaleColor = scaleColor;
	}

	
	@Override
	public String toString() {
		return super.toString() + "Fish [fins=" + fins + ", scaleColor=" + scaleColor + "]";
	}
}
