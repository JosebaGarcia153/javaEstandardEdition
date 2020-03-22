package com.ipartek.formacion.ficheros;

import java.util.Scanner;

public class ReaderApp {

	static Scanner keyboard = new Scanner(System.in);

	static PeopleDAO dao = new PeopleDAOImpl();
	

	
	static People p;
	
	
	public static void main(String[] args) {
		
		drawMenu();
	}
	
	
	static void drawMenu() {

		int options = 0;

		do {
			options = instructions();

			switch (options) {
			
			case 1:
				
				System.out.println("Displaying all entries.");
				dao.getAll();

				break;
			
				
			case 2:

				System.out.println("Counting all entries.");
				dao.countEntries();

				break;
				
				
			case 3:
								
				System.out.println("Write the phone number you want to find:");
				String phone = keyboard.nextLine();
				
				dao.searchByPhone(phone);
				
				break;
				
				
			case 4:
					
				System.out.println("Write the name you want to find:");
				String name = keyboard.nextLine();
				
				dao.searchByName(name);
				
				break;
				
				
			case 5:
				
				System.out.println("Write the email you want to find:");
				String email = keyboard.nextLine();
				
				dao.searchByEmail(email);
				
				break;


			case 6:

				System.out.println("Calculating DNIs.");
				dao.displayDNI();

				break;
			
			
			case 7:

				System.out.println("Counting repeated entires.");
				dao.countRepeats();
				
				break;

			
			case 8:

				System.out.println("The program has been closed.");

				break;
				
			
			default:
				
				System.out.println("Invalid number.");
				
				break;
			}
			
		} while (options != 8);

		keyboard.close();
	}
	
	
	static int instructions() {

		int options = 0;

		System.out.println("Select one of the following actions:"
				+ "\n 1)List all the correct entries."
				+ "\n 2)Count how many entries are right/wrong"
				+ "\n 3)Search for correct entries by phone."
				+ "\n 4)Search for correct entries by name."
				+ "\n 5)Search for correct entries by email."
				+ "\n 6)Show DNIs of the correct entries."
				+ "\n 7)Count repeated correct entries."
				+ "\n 8)Close the program.");

		options = Integer.parseInt(keyboard.nextLine());

		return options;
	}
/*
* contar nombres, emails o datos repetidos si los hay
*/
}