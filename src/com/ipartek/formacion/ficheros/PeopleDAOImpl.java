package com.ipartek.formacion.ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class PeopleDAOImpl implements PeopleDAO {

	private final char[] DNI_LETTER = {'T', 'R', 'W', 'A','G', 'M', 'Y',
			'F', 'P', 'D', 'X', 'B', 'N', 'J',
			'Z', 'S', 'Q', 'V', 'H', 'L', 'C',
			'K', 'E'};
	
	private ArrayList<People> person = new ArrayList<People>();
	
	private int correctCounter = 0;
	private int wrongCounter = 0;
	private int totalCounter = 0;
	
	boolean entryFound = false;
	
	private int DNI_Number = 0;
	private int arrayPosition = 0;
	
	private int nameRepeated = 0;
	private int companyRepeated = 0;
	private int birthDateRepeated = 0;
	private int phoneRepeated = 0;
	private int emailRepeated = 0;
	private int personalNumberRepeated = 0;
	private int entryRepeated = 0;

	
	public PeopleDAOImpl() {

		BufferedReader reader;

		try {	
			reader = new BufferedReader(new FileReader("src/com/ipartek/formacion/ficheros/personas.txt"));
			
			reader.readLine(); //Reads the first line
			String line=null; //Removes the first line
			
			while ((line = reader.readLine()) != null){

				String[] fields = line.split(";");

				if (fields.length == 6) {
					
					String str = fields[3];
					String strNew = str.replace("(", "");
					String strNew2 = strNew.replace(")", "");
					String strNew3 = strNew2.replace(" ", "");
					
					this.person.add(new People(fields[0], fields[1], fields[2], strNew3, fields[4], fields[5]));
					
					correctCounter++;

				} else {
					
					wrongCounter++;
				}
				
				totalCounter++;
			}

			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	@Override
	public void getAll() {
		
		for (int i = 0; i < person.size(); i++) {
			System.out.println(person.get(i).toString());
		}
	}
	
	
	@Override
	public void countEntries() {
		
		System.out.println("The number of correct entries is: " + correctCounter);
		System.out.println("The number of wrong entries is: " + wrongCounter);
		System.out.println("The total number entries is: " + totalCounter);
	}

	
	@Override
	public void searchByName(String name) {
		
		for (int i = 1; i < person.size(); i++) {
			
			if (name.equals(person.get(i).getName())) {

				System.out.println(person.get(i).toString());
				entryFound = true;

			} else {
				entryFound = false;
			}
		}

		if (entryFound == false) {
			System.out.println("There are no results for this search.");
		}
	}

	
	@Override
	public void searchByEmail(String email) {

		for (int i = 1; i < person.size(); i++) {

			if (email.equals(person.get(i).getEmail())) {

				System.out.println(person.get(i).toString());
				entryFound = true;
				
			} else {
				entryFound = false;
			}
		}
		
		if (entryFound == false) {
			System.out.println("There are no results for this search.");
		}
	}


	@Override
	public void searchByPhone(String phone) {

		for (int i = 1; i < person.size(); i++) {

			if (phone.equals(person.get(i).getPhone())) {

				System.out.println(person.get(i).toString());
				entryFound = true;

			} else {
				entryFound = false;
			}
		}

		if (entryFound == false) {
			System.out.println("There are no results for this search.");
		}
	}


	@Override
	public void displayDNI() {
		

		for (int i = 1; i < person.size(); i++) {
			
			DNI_Number = Integer.parseInt(person.get(i).getPersonalNumber().substring(0,8));
			System.out.println(DNI_Number);
			arrayPosition = DNI_Number%23;
			
			System.out.println("The DNI of " + person.get(i).getName() + " is " + DNI_Number + "-" + DNI_LETTER[arrayPosition]);
		}
	}


	@Override
	public void countRepeats() {
		
		//Hashset doesn't allow duplicates, so it can be used to count them
		
		Set<String> hSet = new HashSet<>();
		
		for (People p : person) {
			if (hSet.add(p.getName()) == false) {
				nameRepeated++;
			}
			if (hSet.add(p.getCompany()) == false) {
				companyRepeated++;
			}
			if (hSet.add(p.getBirthDate()) == false) {
				birthDateRepeated++;
			}
			if (hSet.add(p.getPhone()) == false) {
				phoneRepeated++;
			}
			if (hSet.add(p.getEmail()) == false) {
				emailRepeated++;
			}
			if (hSet.add(p.getPersonalNumber()) == false) {
				personalNumberRepeated++;
			}
			if (hSet.add(p.toString()) == false) {
				entryRepeated++;
			}		
		}

		System.out.println("The number of times a name is repeated is: " + nameRepeated);
		System.out.println("The number of times a company is repeated is: " + companyRepeated);
		System.out.println("The number of times a birth date is repeated is: " + birthDateRepeated);
		System.out.println("The number of times a phone number is repeated is: " + phoneRepeated);
		System.out.println("The number of times an email is repeated is: " + emailRepeated);
		System.out.println("The number of times a personal number is repeated is: " + personalNumberRepeated);
		System.out.println("The number of times a full entry is repeated is: " + entryRepeated);
	}
}