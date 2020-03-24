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
			try {

				options = instructions();

				switch (options) {

				case 1:

					System.out.println("Displaying all entries.");

					for (int i = 0; i < dao.getAll().size(); i++) {

						System.out.println(dao.getAll().get(i));
					}

					break;


				case 2:

					System.out.println("Counting all entries.");

					int[] returnCountedEntries = dao.countEntries();

					System.out.println("The number of correct entries is: " + returnCountedEntries[0]);
					System.out.println("The number of wrong entries is: " + returnCountedEntries[1]);
					System.out.println("The total number entries is: " + returnCountedEntries[2]);

					break;


				case 3:

					System.out.println("Write the phone number you want to find:");
					String phone = keyboard.nextLine();

					System.out.println(dao.searchByPhone(phone));

					break;


				case 4:

					System.out.println("Write the name you want to find:");
					String name = keyboard.nextLine();

					for (int i = 0; i < dao.searchByName(name).size(); i++) {

						System.out.println(dao.searchByName(name).get(i));
					}

					break;


				case 5:

					System.out.println("Write the email you want to find:");
					String email = keyboard.nextLine();

					System.out.println(dao.searchByEmail(email));

					break;


				case 6:

					System.out.println("Calculating DNIs.");

					for (int i = 0; i < dao.displayDNI().size(); i++) {

						System.out.println("The DNI of " + dao.getAll().get(i).getName() + " is "
								+ dao.getAll().get(i).getPersonalNumber().substring(0,8)
								+ "-" + dao.displayDNI().get(i));
					}

					break;


				case 7:

					System.out.println("Counting repeated entires.");	

					int[] returnCountedRepeats = dao.countRepeats();

					System.out.println("The number of times a name is repeated is: " + returnCountedRepeats[0]);
					System.out.println("The number of times a company is repeated is: " + returnCountedRepeats[1]);
					System.out.println("The number of times a birth date is repeated is: " + returnCountedRepeats[2]);
					System.out.println("The number of times a phone number is repeated is: " + returnCountedRepeats[3]);
					System.out.println("The number of times an email is repeated is: " + returnCountedRepeats[4]);
					System.out.println("The number of times a personal number is repeated is: " + returnCountedRepeats[5]);
					System.out.println("The number of times a full entry is repeated is: " + returnCountedRepeats[6]);

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

		try {

			options = Integer.parseInt(keyboard.nextLine());

		} catch (Exception e) {
			//Error message already triggers with the default switch.
		}

		return options;
	}
}