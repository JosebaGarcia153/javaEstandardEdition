package com.ipartek.formacion.clases.clinica2;

import java.util.ArrayList;
import java.util.Scanner;


public class PetDAOImpl implements PetDAO {

	Scanner keyboard = new Scanner(System.in);

	private ArrayList<Pet> animal;
	private static PetDAOImpl instance;
	
	
	private PetDAOImpl() {

		this.animal = new ArrayList<Pet>();
	}

	
	public static PetDAOImpl getPetDAOImpl() {
		
		if (instance == null) {
			
			instance = new PetDAOImpl(); 
		}
		return instance; 
	}

	
	@Override
	public Pet searchById(int id) throws Exception {


		for (Pet pet: animal) {
			
			for (int i = 0; i < pet.getRevision().size();i++) {
				
				if(id == pet.getRevision().get(i).getId()) {

					return pet;											
				}	
			}
		}
		throw new Exception("The ID was not found.");
	}

	
	@Override
	public void addPet(ArrayList<Revision> revision, Pet pet) {

		animal.add(new Pet(revision, pet.getName(), pet.getSpecies(), pet.getRace(), pet.getAge()));

	}


	@Override
	public ArrayList<Revision> findHistory(String name) throws Exception {

		for (int i = 0; i < animal.size(); i++) {
			
			if (name.equalsIgnoreCase(animal.get(i).getName())) {
				
				return animal.get(i).getRevision();
			}
		}
		throw new Exception("The name was not found.");
	}
	
	
	@Override
	public void addHistory(Revision revision, Pet pet) {
				
				pet.getRevision().add(revision);

	}
}