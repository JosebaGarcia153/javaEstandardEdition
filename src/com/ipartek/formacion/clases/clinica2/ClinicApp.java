package com.ipartek.formacion.clases.clinica2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.ArrayList;
import java.util.Scanner;


public class ClinicApp {

	static Scanner keyboard = new Scanner(System.in);

	static PetDAO petDAO;

	static ArrayList<Revision> revision;
	static Pet pet;
	static Revision medicalHistory;
	
	static int newId = 0;
	
	static DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
	static LocalDate date;
	static LocalDate today;

	static boolean check = false;
	static String confirm = "";
	
	static String name = "";
	static int id = 0;
	
	
	
	public static void main(String[] args) {
		
		petDAO = PetDAOImpl.getPetDAOImpl();
		drawMenu();
	}


	private static void drawMenu() {

		int options = 0;
		
		do {
			
			try {

				options = instructions();

				switch (options) {

				case 1:
					
					addPet();
					break;


				case 2:

					findById();
					break;


				case 3:

					findHistory();
					break;

				case 4:
							
					addHistory();
					break;
					
				case 5:
					
					updatePet();
					break;
				
				case 6:
					
					deletePet();
					break;
				case 7:

					System.out.println("The program has been closed.");
					break;


				default:

					System.out.println("Invalid number.");
					break;
				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		} while (options != 7);

		keyboard.close();
	}
	
	
	private static void addPet() throws Exception {
		
		revision = new ArrayList<Revision>();
		
		medicalHistory = new Revision();
		pet = new Pet();
		
		try {
			System.out.println("Insert the name of the animal:");
			pet.setName(keyboard.nextLine());

//			System.out.println("Insert the species of the animal:");
//			pet.setSpecies(keyboard.nextLine());
//
//			System.out.println("Insert the race of the animal:");
//			pet.setRace(keyboard.nextLine());
//
//			System.out.println("Insert the age of the animal:");
//			pet.setAge(Integer.parseInt(keyboard.nextLine()));
//
//			do {
//				System.out.println("Insert the date (Format DD/MM/YYYY) the animal arrived:");
//				medicalHistory.setDate(keyboard.nextLine());
//
//				try {
//
//					date = LocalDate.parse(medicalHistory.getDate(), dateFormatter);
//					today = LocalDate.now();
//
//					if(date.isAfter(today)) {
//
//						System.out.println("The date must be today or older.");
//						check = false;
//
//					} else {
//
//						check = true;
//					}
//				}
//
//				catch (DateTimeParseException e) {
//					System.out.println("Invalid date format. DD/MM/YYYY");
//					check = false;
//				}
//
//			} while (check == false);
//
//			
//			System.out.println("Insert the ID of the doctor who treated it:");
//			medicalHistory.setDoctorId(Integer.parseInt(keyboard.nextLine()));
//			
//			System.out.println("Insert the reason for the visit to the clinic:");
//			medicalHistory.setReason(keyboard.nextLine());
//
//			System.out.println("Insert the diagnosis:");
//			medicalHistory.setDiagnosis(keyboard.nextLine());
//
//			System.out.println("Insert the treatment:");
//			medicalHistory.setTreatment(keyboard.nextLine());
			

			do {
				System.out.println("Are you sure you want to add this entry? Y/N");
				confirm = keyboard.nextLine();

				if ("y".equalsIgnoreCase(confirm)) {
					
					revision.add(medicalHistory);
					
					System.out.println(petDAO.addPet(revision, pet).toString() + " has been created.");
					check = true;

				} else if ("n".equalsIgnoreCase(confirm)) {

					System.out.println("The entry has been cancelled.");
					check = true;

				} else {

					System.out.println("Invalid input.");	
					check = false;
				}
			} while (check == false);

			
		} catch (NumberFormatException e) {

			System.out.println("Invalid entry. Must type a number.");
		}
	}
	
	
	private static void findById() throws Exception {

		try {
			
			System.out.println("Write the ID of the animal you want to find:");
			id = Integer.parseInt(keyboard.nextLine());

			System.out.println(petDAO.searchById(id).toString());

		} catch (NumberFormatException e) {

			System.out.println("Invalid entry. Must type a number.");
		}
	}

	
	private static void findHistory() throws Exception {
		
		System.out.println("Type the animal's name to find its medical records:");
		name = (keyboard.nextLine());
		
		for (int i = 0; i < petDAO.findHistory(name).size(); i++) {
			
			System.out.println(petDAO.findHistory(name).get(i).toString());
		}
	}
	
	
	private static void addHistory() throws Exception {

		medicalHistory = new Revision();

		try {
			System.out.println("Write one of the previous IDs of the animal:");
			id = Integer.parseInt(keyboard.nextLine());
			Pet pet = petDAO.searchById(id);

			do {

				System.out.println("Insert the date (Format DD/MM/YYYY) the animal arrived:");
				medicalHistory.setDate(keyboard.nextLine());

				try {

					date = LocalDate.parse(medicalHistory.getDate(), dateFormatter);
					today = LocalDate.now();

					if(date.isAfter(today)) {

						System.out.println("The date must be today or older.");
						check = false;

					} else {

						check = true;
					}
				}

				catch (DateTimeParseException e) {
					System.out.println("Invalid date format. DD/MM/YYYY");
					check = false;
				}

			} while (check == false);


			System.out.println("Insert the reason for the visit to the clinic:");
			medicalHistory.setReason(keyboard.nextLine());

			System.out.println("Insert the diagnosis:");
			medicalHistory.setDiagnosis(keyboard.nextLine());

			System.out.println("Insert the treatment:");
			medicalHistory.setTreatment(keyboard.nextLine());

			newId++;
			medicalHistory.setDoctorId(newId);

			do {
				System.out.println("Are you sure you want to add this entry? Y/N");
				confirm = keyboard.nextLine();

				if ("y".equalsIgnoreCase(confirm)) {

					System.out.println("The revision " + petDAO.addHistory(medicalHistory, pet).toString() + " has been added.");
					check = true;

				} else if ("n".equalsIgnoreCase(confirm)) {

					System.out.println("The entry has been cancelled.");
					check = true;

				} else {

					System.out.println("Invalid input.");	
					check = false;
				}
			} while (check == false);

		} catch (NumberFormatException e) {

			System.out.println("Invalid entry. Must type a number.");
		}
	}
	
	
	private static void updatePet() throws Exception {
		
		System.out.println("What is the ID of the pet you want to edit?");
		int petId = Integer.parseInt(keyboard.nextLine());
		
		petDAO.searchById(petId);
		
		try {
			System.out.println("Insert the name of the animal:");
			pet.setName(keyboard.nextLine());

//			System.out.println("Insert the species of the animal:");
//			pet.setSpecies(keyboard.nextLine());
//
//			System.out.println("Insert the race of the animal:");
//			pet.setRace(keyboard.nextLine());
//
//			System.out.println("Insert the age of the animal:");
//			pet.setAge(Integer.parseInt(keyboard.nextLine()));
			

			do {
				System.out.println("Are you sure you want to edit this entry? Y/N");
				confirm = keyboard.nextLine();

				if ("y".equalsIgnoreCase(confirm)) {
					
					System.out.println(petDAO.updatePet(pet, petId).toString() + " has been updated.");
					check = true;

				} else if ("n".equalsIgnoreCase(confirm)) {

					System.out.println("The entry has been cancelled.");
					check = true;

				} else {

					System.out.println("Invalid input.");	
					check = false;
				}
			} while (check == false);

			
		} catch (NumberFormatException e) {

			System.out.println("Invalid entry. Must type a number.");
		}
	}


	private static void deletePet() throws Exception {
		
		System.out.println("What is the ID of the pet you want to delete?");
		int petId = Integer.parseInt(keyboard.nextLine());
		
		petDAO.searchById(petId);
		
		petDAO.deletePet(pet, petId);
		
		System.out.println("Entry deleted.");					
	}


	private static int instructions() {

		int options = 0;

		System.out.println("Select one of the following actions:"
				+ "\n 1)Register new pet."
				+ "\n 2)Search pet by ID."
				+ "\n 3)Read pet's medical records."
				+ "\n 4)Add new revision to a pet."
				+ "\n 5)Update Pet."
				+ "\n 6)Delete Pet."	
				+ "\n 7)Close the program.");

		try {

			options = Integer.parseInt(keyboard.nextLine());

		} catch (Exception e) {
			//Error message already triggers with the default switch.
		}

		return options;
	}
}