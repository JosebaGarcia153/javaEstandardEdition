package com.ipartek.formacion.clases.clinica2;


public interface PetDAO {

	Pet searchByID(int id) throws Exception;
	//int addPet(Revision revision);
	Revision getHistory(String name) throws Exception;
	int addPet(Revision revision, String name, String species, String race, int age);
}