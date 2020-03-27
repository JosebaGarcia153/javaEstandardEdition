package com.ipartek.formacion.clases.clinica2;

import java.util.ArrayList;

public class Pet {
	
	private String name;
	private String species;
	private String race;
	private int age;
	private ArrayList<Revision> revision;
	
	
	public Pet() {
		super();
		this.revision = null;
		this.name = "pet";
		this.species = "unknown";
		this.race = "unknown";
		this.age = 0;
	}
	
	public Pet(ArrayList<Revision> revision, String name, String species, String race, int age) {
		super();
		this.revision = revision;
		this.name = name;
		this.species = species;
		this.race = race;
		this.age = age;
	}

	
	public ArrayList<Revision> getRevision() {
		return revision;
	}

	public void setRevision(ArrayList<Revision> revision) {
		this.revision = revision;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	
	
	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	@Override
	public String toString() {
		return "Pet Name=" + name + ", Species=" + species + ", Race=" + race + ", Age=" + age;
	}
}