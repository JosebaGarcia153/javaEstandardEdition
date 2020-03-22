package com.ipartek.formacion.ficheros;


public interface PeopleDAO {
	
	void getAll();
	
	void countEntries();

	void searchByName(String name);

	void searchByEmail(String email);
	
	void searchByPhone(String phone);
	
	void displayDNI();
	
	void countRepeats();
}