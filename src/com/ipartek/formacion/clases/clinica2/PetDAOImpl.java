package com.ipartek.formacion.clases.clinica2;

import java.util.ArrayList;
import java.util.Scanner;


public class PetDAOImpl implements PetDAO {

	Scanner keyboard = new Scanner(System.in);

	private ArrayList<Pet> animal;
	private PetDAOImpl instance;

	private PetDAOImpl() {

		this.animal = new ArrayList<Pet>();
	}

	public PetDAOImpl getPetDAOImpl() {
		if (instance == null) {
			instance = new PetDAOImpl(); 
		}
		return instance; 
	}

	@Override
	public Pet searchByID(int id) throws Exception {


		for (Pet pet: animal) {
			for (int i = 0; i < pet.getRev().size();i++) {
				if(id == pet.getRev().get(i).getId()) {

					return pet;											
				}	
			}
		}
		throw new Exception("The ID was not found.");
	}


	@Override
	public void addPet(ArrayList<Revision> rev, Pet pet) {

		animal.add(new Pet(rev, pet.getName(), pet.getSpecies(), pet.getRace(), pet.getAge()));

	}


	@Override
	public ArrayList<Revision> getHistory(String name) throws Exception {

		for (int i = 0; i < animal.size(); i++) {
			if (name.equalsIgnoreCase(animal.get(i).getName())) {
				return animal.get(i).getRev();
			}
		}
		throw new Exception("The name was not found.");
	}
}