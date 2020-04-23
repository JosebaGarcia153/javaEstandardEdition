package com.ipartek.formacion.clases.clinica2;

import java.util.ArrayList;



public class PetDAOImpl implements PetDAO {

	private ArrayList<Pet> animals;
	private static PetDAOImpl instance;
	
	private static int IdCounter;
	private boolean check = false;
	
	//Constructor
	private PetDAOImpl() {

		this.animals = new ArrayList<Pet>();
	}

	//Simpleton
	public static PetDAOImpl getPetDAOImpl() {
		
		if (instance == null) {
			
			instance = new PetDAOImpl(); 
			IdCounter = 1;
		}
		return instance; 
	}

	
	@Override
	public Pet searchById(int id) throws Exception {

		//Busca en cada animal en el arraylist de animales
		for (Pet pet: animals) {
				
				//Busca si el ID existe
				if(id == pet.getId()) {

					return pet;											
				}	
		}
		throw new Exception("The ID was not found.");
	}

	
	@Override
	public Pet addPet(ArrayList<Revision> revision, Pet pet) throws Exception {

		check = false;
		
		//Comprueba que no existe un animal identico antes de añadirlo
		for (int i = 0; i < animals.size(); i++) {
			
			pet.setId(animals.get(i).getId());
			
			if (pet.toString().equals(animals.get(i).toString())) {
				
				check = true;
			}
		}
		
		//Si el animal no existe, lo añade al arraylist de animales
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
		
		//Busca el animal por nombre
		for (int i = 0; i < animals.size(); i++) {
			
			if (name.equalsIgnoreCase(animals.get(i).getName())) {
				
				//Devuelve el historial del animal
				return animals.get(i).getRevision();
			}
		}
		throw new Exception("The name was not found.");
	}
	
	
	@Override
	public Revision addHistory(Revision revision, Pet pet) {
				
		//Añade una nueva revision al historial de revisiones del animal	
		pet.getRevision().add(revision);

		return revision;

	}
	
	
	@Override
	public Pet updatePet(Pet pet, ArrayList<Revision> revision, int petId) throws Exception {
			
			//Se asegura de que el animal mantenga el mismo ID tras editarlo
			pet.setId(petId);

			//Recorre el arraylist de animales
			for (Pet p: animals) {

				//Encuentra el ID del animal a editar
				if(petId == p.getId()) {
					
					pet.setRevision(revision);
					//Edita el animal en la posicion ID-1 del arraylist
					//porque los arraylist empiezan en 0 pero los IDs en 1
					animals.set((petId-1), pet);
					
					//Devuelve el animal editado
					return pet;											
				}	
			}	
			throw new Exception("The ID was not found.");
	}
	
	
	@Override
	public void deletePet(Pet pet, int petId) {
		
		//Busca el animal a borrar por su ID
		for (int i = 0; i < animals.size(); i++) {
			
			if (animals.get(i).getId() == petId) {
				
				//Borra el animal
				animals.remove(i);			
			}	
		}
	}
	
	@Override
	public ArrayList<Pet> getAll() {
		//Devuelve el arraylist de animales
		return animals;
	}
}