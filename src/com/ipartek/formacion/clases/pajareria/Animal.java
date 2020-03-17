package com.ipartek.formacion.clases.pajareria;

public class Animal {
	
	public static final char FEMALE_GENDER = 'f';
	public static final char MALE_GENDER = 'm';
	public static final char UNDEFINED_GENRE = 'u';
	
	private String name;
	private String eyeColor;
	private char gender;
	private float size;
	private float weight;
	
	
	public Animal() {
		super();
		this.name = "";
		this.eyeColor = "";
		this.gender = UNDEFINED_GENRE;
		this.size = 0;
		this.weight = 0;
	
	}
	
	public Animal(String name, String eyeColor, char gender, float size, float weight) {
		super();
		this.name = name;
		this.eyeColor = eyeColor;
		this.gender = gender;
		this.size = size;
		this.weight = weight;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getEyeColor() {
		return eyeColor;
	}
	
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	public float getSize() {
		return size;
	}
	
	public void setSize(float size) {
		this.size = size;
	}
	
	
	public float getWeight() {
		return weight;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", eyeColor=" + eyeColor + ", gender=" + gender + ", size=" + size + ", weight="
				+ weight + "]";
	}
}