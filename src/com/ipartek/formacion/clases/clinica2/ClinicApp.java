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
				//Muestra las opciones
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
					
					getAll();
					break;	
					
				case 8:

					System.out.println("The program has been closed.");
					break;


				default:

					System.out.println("Invalid number.");
					break;
				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		} while (options != 8);

		keyboard.close();
	}
	
	
	private static void addPet() throws Exception {
		
		//Crea nuevos objectos para añadir al arraylist de pets en PetDAOImpl
		revision = new ArrayList<Revision>();		
		medicalHistory = new Revision();
		pet = new Pet();
		
		//Datos que añadir a los objetos
		try { 
			System.out.println("Insert the name of the animal:");
			pet.setName(keyboard.nextLine());

			System.out.println("Insert the species of the animal:");
			pet.setSpecies(keyboard.nextLine());

			System.out.println("Insert the race of the animal:");
			pet.setRace(keyboard.nextLine());

			System.out.println("Insert the age of the animal:");
			pet.setAge(Integer.parseInt(keyboard.nextLine()));

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

			
			System.out.println("Insert the ID of the doctor who treated it:");
			medicalHistory.setDoctorId(Integer.parseInt(keyboard.nextLine()));
			
			System.out.println("Insert the reason for the visit to the clinic:");
			medicalHistory.setReason(keyboard.nextLine());

			System.out.println("Insert the diagnosis:");
			medicalHistory.setDiagnosis(keyboard.nextLine());

			System.out.println("Insert the treatment:");
			medicalHistory.setTreatment(keyboard.nextLine());
			
			//Confirma añadir los datos
			do {
				System.out.println("Are you sure you want to add this entry? Y/N");
				confirm = keyboard.nextLine();

				if ("y".equalsIgnoreCase(confirm)) {
					
					revision.add(medicalHistory);
					
					//Ejecuta PetDAOImpl -> addPet()
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
			//Pide el ID a encontrar
			System.out.println("Write the ID of the animal you want to find:");
			id = Integer.parseInt(keyboard.nextLine());
			
			//Recive el animal desde PetDAOImpl -> searchById()
			System.out.println(petDAO.searchById(id).toString());

		} catch (NumberFormatException e) {

			System.out.println("Invalid entry. Must type a number.");
		}
	}

	
	private static void findHistory() throws Exception {
		
		//Pide nombre a encontrar
		System.out.println("Type the animal's name to find its medical records:");
		name = (keyboard.nextLine());
		
		//Recibe todos los animales con el nombre desde PetDAOImpl -> searchById()
		for (int i = 0; i < petDAO.findHistory(name).size(); i++) {
			
			System.out.println(petDAO.findHistory(name).get(i).toString());
		}
	}
	
	
	private static void addHistory() throws Exception {
		
		//Crea nuevo historial medico para añadir a un animal ya creado
		medicalHistory = new Revision();

		try {
			//Busca el previo animal por ID
			System.out.println("Write one of the previous IDs of the animal:");
			id = Integer.parseInt(keyboard.nextLine());
			Pet pet = petDAO.searchById(id);

			do {
				//Inserta los datos de la nueva revision
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
				//Confirma la entrada de nuevos datos
				System.out.println("Are you sure you want to add this entry? Y/N");
				confirm = keyboard.nextLine();

				if ("y".equalsIgnoreCase(confirm)) {
					
					//Añade el nuevo historial en PetDAOImpl -> addHistory()
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
		
		//Pide el ID del animal a editar
		System.out.println("What is the ID of the pet you want to edit?");
		int petId = Integer.parseInt(keyboard.nextLine());
		
		//Confirma que el ID existe
		petDAO.searchById(petId);
		
		try {
			//Escribe lost nuevos datos del animal
			System.out.println("Insert the name of the animal:");
			pet.setName(keyboard.nextLine());

			System.out.println("Insert the species of the animal:");
			pet.setSpecies(keyboard.nextLine());

			System.out.println("Insert the race of the animal:");
			pet.setRace(keyboard.nextLine());

			System.out.println("Insert the age of the animal:");
			pet.setAge(Integer.parseInt(keyboard.nextLine()));
			

			do {
				//Confirma la entrada de datos
				System.out.println("Are you sure you want to edit this entry? Y/N");
				confirm = keyboard.nextLine();

				if ("y".equalsIgnoreCase(confirm)) {
					
					//Reemplaza un animal en PetDAOImpl -> updatePet()
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
		
		//Pregunta el ID del animal a borrar
		System.out.println("What is the ID of the pet you want to delete?");
		int petId = Integer.parseInt(keyboard.nextLine());
		
		//Confirma que el ID existe
		petDAO.searchById(petId);
		
		//Borra el animal en PetDAOImpl -> deletePet()
		petDAO.deletePet(pet, petId);
		
		System.out.println("Entry deleted.");					
	}

	private static void getAll() throws Exception {
		
		//Muestra todos los animales desde PetDAOImpl -> getAll()
		for (int i = 0; i < petDAO.getAll().size(); i++) {
			
			System.out.println(petDAO.getAll().get(i).toString());
		}
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
				+ "\n 7)Get all entries."	
				+ "\n 8)Close the program.");

		try {
			//Inserta por teclado el numero de la opcion a ejecutar
			options = Integer.parseInt(keyboard.nextLine());

		} catch (Exception e) {
			//Error message already triggers with the default switch.
		}

		return options;
	}
}