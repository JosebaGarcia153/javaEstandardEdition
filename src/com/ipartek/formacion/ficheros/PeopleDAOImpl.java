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
	
	private int[] countEntries;
	private int correctCounter = 0;
	private int wrongCounter = 0;
	private int totalCounter = 0;
	
	
	private int DNI_Number = 0;
	private int arrayPosition = 0;
	
	
	private int[] countRepeats;
	private Set<String> hSet;
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
	public ArrayList<People> getAll() {

		return person;
	}


	@Override
	public int[] countEntries() {

		countEntries = new int[3];
		countEntries[0] = correctCounter;
		countEntries[1] = wrongCounter;
		countEntries[2] = totalCounter;

		return countEntries;	
	}


	@Override
	public ArrayList<People> searchByName(String name) throws Exception {
		
		ArrayList<People> peopleByName = new ArrayList<People>();
		
		for (int i = 0; i < person.size(); i++) {

			if (name.equalsIgnoreCase(person.get(i).getName())) {

				peopleByName.add(new People(person.get(i).getName(), person.get(i).getCompany(),
						person.get(i).getBirthDate(),person.get(i).getPhone(),
						person.get(i).getEmail(), person.get(i).getPersonalNumber()));
			}
		}

		if (peopleByName.size() == 0) {

			throw new Exception("The name was not found.");

		} else {

			return peopleByName;
		}

	}


	@Override
	public People searchByEmail(String email) throws Exception {

		for (int i = 0; i < person.size(); i++) {

			if (email.equalsIgnoreCase(person.get(i).getEmail())) {

				return person.get(i);
			} 
		}
		throw new Exception("The email was not found.");
	}


	@Override
	public People searchByPhone(String phone) throws Exception {

		for (int i = 0; i < person.size(); i++) {

			if (phone.equals(person.get(i).getPhone())) {

				return person.get(i);
			} 
		}
		throw new Exception("The phone number was not found.");
	}


	@Override
	public ArrayList<Character> displayDNI() {
		
		ArrayList<Character> DNI_List = new ArrayList<Character>();
		
		for (int i = 0; i < person.size(); i++) {

			DNI_Number = Integer.parseInt(person.get(i).getPersonalNumber().substring(0,8));
			arrayPosition = DNI_Number%23;

			DNI_List.add(DNI_LETTER[arrayPosition]);
		}

		return DNI_List;	
	}


	@Override
	public int[] countRepeats() {

		countRepeats = new int[7];

		//Hashset doesn't allow duplicates, so it can be used to count them
		hSet = new HashSet<>();

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

		countRepeats[0] = nameRepeated;
		countRepeats[1] = companyRepeated;
		countRepeats[2] = birthDateRepeated;
		countRepeats[3] = phoneRepeated;
		countRepeats[4] = emailRepeated;
		countRepeats[5] = personalNumberRepeated;
		countRepeats[6] = entryRepeated;

		return countRepeats;
	}
}