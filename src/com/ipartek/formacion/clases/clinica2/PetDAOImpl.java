package com.ipartek.formacion.clases.clinica2;

import java.util.ArrayList;
import java.util.Scanner;


public class PetDAOImpl implements PetDAO {
	
	Scanner keyboard = new Scanner(System.in);
	
	private ArrayList<Pet> animal;
	
	private int newId = 0;


	public PetDAOImpl() {

		this.animal = new ArrayList<Pet>();
		
	}


	@Override
	public Pet searchByID(int id) throws Exception {

		for (Pet pet: animal) {

			if (id == pet.getRevision().getId()) {
				return pet;
			}	

		}
		throw new Exception("The ID was not found.");
	}

	
	@Override
	public int addPet(Revision revision, String name, String species, String race, int age) {
		
		newId++;
		revision.setId(newId);
		
		animal.add(new Pet(revision, name, species, race, age));
			
		return newId;
	}
	
	
	@Override
	public Revision getHistory(String name) throws Exception {

		for (Pet pet: animal) {
			
				if (name.equalsIgnoreCase(pet.getName())) {
					return pet.getRevision();
				}			
		}
		throw new Exception("The name was not found.");
	}
}