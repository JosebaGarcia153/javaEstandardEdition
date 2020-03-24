package com.ipartek.formacion.clases.clinica;

import java.util.Scanner;


public class ClinicApp {

	static Scanner keyboard = new Scanner(System.in);

	static PetDAO dao = new PetDAOImpl();


	public static void main(String[] args) {
		
	    
		drawMenu();
	}


	static void drawMenu() {

		int options = 0;

		do {
			try {

				options = instructions();

				switch (options) {

				case 1:
					
					dao.addPet();
					
					break;


				case 2:


					System.out.println("Write the ID you want to find:");
					int id = Integer.parseInt(keyboard.nextLine());

					System.out.println(dao.searchByID(id));

					break;


				case 3:
					
					System.out.println("Displaying all entries.");
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
				+ "\n 3)Read pet's medical history."
				+ "\n 4)Close the program.");

		try {

			options = Integer.parseInt(keyboard.nextLine());

		} catch (Exception e) {
			//Error message already triggers with the default switch.
		}

		return options;
	}
}