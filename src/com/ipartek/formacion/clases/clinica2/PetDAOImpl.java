package com.ipartek.formacion.clases.clinica2;

import java.util.ArrayList;



public class PetDAOImpl implements PetDAO {

	private ArrayList<Pet> animals;
	private static PetDAOImpl instance;
	
	private static int IdCounter;
	private boolean check = false;
	
	
	private PetDAOImpl() {

		this.animals = new ArrayList<Pet>();
	}

	
	public static PetDAOImpl getPetDAOImpl() {
		
		if (instance == null) {
			
			instance = new PetDAOImpl(); 
			IdCounter = 1;
		}
		return instance; 
	}

	
	@Override
	public Pet searchById(int id) throws Exception {


		for (Pet pet: animals) {
			
			for (int i = 0; i < pet.getRevision().size();i++) {
				
				if(id == pet.getId()) {

					return pet;											
				}	
			}
		}
		throw new Exception("The ID was not found.");
	}

	
	@Override
	public Pet addPet(ArrayList<Revision> revision, Pet pet) throws Exception {

		check = false;

		for (int i = 0; i < animals.size(); i++) {
			pet.setId(animals.get(i).getId());
			if (pet.toString().equals(animals.get(i).toString())) {
				check = true;
			}
		}

		if (check == false) {
			pet.setId(IdCounter);

			animals.add(new Pet(revision, pet.getName(), pet.getSpecies(), pet.getRace(), pet.getAge(), pet.getId()));
			IdCounter++;

			return animals.get(animals.size()-1);
		}
			
			throw new Exception("The animal already exists.");	
	}


	@Override
	public ArrayList<Revision> findHistory(String name) throws Exception {

		for (int i = 0; i < animals.size(); i++) {
			
			if (name.equalsIgnoreCase(animals.get(i).getName())) {
				
				return animals.get(i).getRevision();
			}
		}
		throw new Exception("The name was not found.");
	}
	
	
	@Override
	public Revision addHistory(Revision revision, Pet pet) {
				
				pet.getRevision().add(revision);
				
				return revision;

	}
	
	
	@Override
	public Pet updatePet(Pet pet, int petId) throws Exception {
		
			pet.setId(petId);
			
			for (Pet p: animals) {
				
				for (int i = 0; i < p.getRevision().size();i++) {
					
					if(petId == p.getId()) {
						
						animals.set((petId-1), pet);
						
						return pet;											
					}	
				}
			}
			
			throw new Exception("The ID was not found.");
	}
	
	
	@Override
	public void deletePet(Pet pet, int petId) {
		
		for (int i = 0; i < animals.size(); i++) {
			
			if (animals.get(i).getId() == petId) {
							
				animals.remove(i);			
			}	
		}
	}
	
	@Override
	public ArrayList<Pet> getAll() {
		
		return animals;
	}
}