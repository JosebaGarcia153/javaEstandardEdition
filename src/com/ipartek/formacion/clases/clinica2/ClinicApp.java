package com.ipartek.formacion.clases.clinica2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Scanner;


public class ClinicApp {

	static Scanner keyboard = new Scanner(System.in);

	static PetDAO dao = new PetDAOImpl();

	static Pet pet;
	static Revision revision;
	
	static DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
	static LocalDate date;
	static LocalDate today;

	static boolean check = false;
	static String confirm = "";
	
	public static void main(String[] args) {
		
		drawMenu();
	}


	static void drawMenu() {

		int options = 0;

		do {
			revision = new Revision();
			pet = new Pet(revision, null, null, null, 0);
			try {

				options = instructions();

				switch (options) {

				case 1:

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
							revision.setDate(keyboard.nextLine());

							try {

								date = LocalDate.parse(revision.getDate(), dateFormatter);
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
							}

						} while (check == false);


						System.out.println("Insert the reason for the visit to the clinic:");
						revision.setReason(keyboard.nextLine());

						System.out.println("Insert the diagnosis:");
						revision.setDiagnosis(keyboard.nextLine());

						System.out.println("Insert the treatment:");
						revision.setTreatment(keyboard.nextLine());


						do {
							System.out.println("Are you sure you want to add this entry? Y/N");
							confirm = keyboard.nextLine();

							if ("y".equalsIgnoreCase(confirm)) {

								System.out.println("Entry added. The ID of the visit is: " + dao.addPet(revision, pet.getName(), pet.getSpecies(), pet.getRace(), pet.getAge()));
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

					break;


				case 2:

					System.out.println("Write the ID of the animal you want to find:");
					int id = Integer.parseInt(keyboard.nextLine());
					System.out.println(dao.searchByID(id).toString());

					break;


				case 3:

					System.out.println("Type the animal's name to find its medical record:");
					String name = (keyboard.nextLine());

					System.out.println(dao.getHistory(name));

					break;


				case 4:

					System.out.println("The program has been closed.");

					break;


				default:

					System.out.println("Invalid number.");

					break;
				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		} while (options != 4);

		keyboard.close();
	}

	static int instructions() {

		int options = 0;

		System.out.println("Select one of the following actions:"
				+ "\n 1)Register new pet."
				+ "\n 2)Search pet by revision ID"
				+ "\n 3)Read pet's medical record."
				+ "\n 4)Close the program.");

		try {

			options = Integer.parseInt(keyboard.nextLine());

		} catch (Exception e) {
			//Error message already triggers with the default switch.
		}

		return options;
	}
}