package com.ipartek.formacion.clases.clinica;

import java.util.ArrayList;
import java.util.Scanner;


public class PetDAOImpl implements PetDAO {
	
	Scanner keyboard = new Scanner(System.in);
	
	private ArrayList<Pet> animal;
	private Revision rev;

	
	private int newId = 0;


	public PetDAOImpl() {

		this.animal = new ArrayList<Pet>();
		this.rev = new Revision();
	}


	@Override
	public Pet searchByID(int id) throws Exception {

		for (Pet p: animal) {

			if (p instanceof Revision) {

				rev = (Revision) p;

				if (id == rev.getId()) {
					return p;
				}	
			}		
		}
		throw new Exception("The ID was not found.");
	}

	
	@Override
	public int addPet(Pet p) {
		
		Revision r = (Revision) p;
		
		newId++;
		r.setId(newId);
		
		animal.add(p);
		
		return newId;
	}
	
	
	@Override
	public Revision getHistory(String name) throws Exception {

		for (Pet p: animal) {
			if (p instanceof Revision) {
	
				if (name.equalsIgnoreCase(p.getName())) {
					return rev;
				}	
			}		
		}
		throw new Exception("The name was not found.");
	}
}