package com.ipartek.formacion.clases.clinica2;

import java.util.ArrayList;

public interface PetDAO {
	
	Pet searchById(int id) throws Exception;
	
	Pet addPet(ArrayList<Revision> revision, Pet pet) throws Exception;
	
	ArrayList<Revision> findHistory(String name) throws Exception;
	
	Revision addHistory(Revision revision, Pet pet);

	Pet updatePet(Pet pet, ArrayList<Revision> revision, int petId) throws Exception;

	void deletePet(Pet pet, int petId);

	ArrayList<Pet> getAll();

}