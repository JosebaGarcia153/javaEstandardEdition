package com.ipartek.formacion.ficheros;

import java.util.ArrayList;

public interface PeopleDAO {
	
	ArrayList<People> getAll();
	
	int[] countEntries();

	ArrayList<People> searchByName(String name) throws Exception;

	People searchByEmail(String email) throws Exception;
	
	People searchByPhone(String phone) throws Exception;
	
	ArrayList<Character> displayDNI();
	
	int[] countRepeats();
}