package com.ipartek.formacion.clases.clinica;


public interface PetDAO {

	Pet searchByID(int id) throws Exception;
	int addPet(Pet p);
	Pet getHistory(String name) throws Exception;
}