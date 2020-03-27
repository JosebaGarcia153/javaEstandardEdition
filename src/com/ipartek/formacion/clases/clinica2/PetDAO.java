package com.ipartek.formacion.clases.clinica2;

import java.util.ArrayList;

public interface PetDAO {
	
	PetDAOImpl getPetDAOImpl();
	Pet searchByID(int id) throws Exception;
	void addPet(ArrayList<Revision> rev, Pet pet);
	ArrayList<Revision> getHistory(String name) throws Exception;
}