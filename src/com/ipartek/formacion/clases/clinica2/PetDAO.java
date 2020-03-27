package com.ipartek.formacion.clases.clinica2;

import java.util.ArrayList;

public interface PetDAO {
	
	Pet searchById(int id) throws Exception;
	
	void addPet(ArrayList<Revision> revision, Pet pet);
	
	ArrayList<Revision> findHistory(String name) throws Exception;
	
	void addHistory(Revision revision, Pet pet);
}