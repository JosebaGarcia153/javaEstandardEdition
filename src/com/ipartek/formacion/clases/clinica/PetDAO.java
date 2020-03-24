package com.ipartek.formacion.clases.clinica;

import java.util.ArrayList;

public interface PetDAO {

	Pet searchByID(int id) throws Exception;
	void addPet();
	Pet getHistory(String name) throws Exception;
}