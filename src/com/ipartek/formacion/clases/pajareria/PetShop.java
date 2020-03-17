package com.ipartek.formacion.clases.pajareria;

import java.util.Scanner;

public class PetShop {
	
	static Scanner keyboard = new Scanner(System.in);
	
	static Animal[] pet = new Animal[10];

	static int options;
	static char question;

	public static void main(String[] args) {

		drawMenu();
	}

	static void drawMenu() {
		System.out.println("Add 10 animals to the list.");

		for (int i = 0; i < pet.length; i++) {

			options = instructions();

			switch (options) {
			case 1:
				Dog d = new Dog();
				
				System.out.println("What is the name of the dog?");
				d.setName(keyboard.nextLine());

				System.out.println("What is the eye color of the dog?");
				d.setEyeColor(keyboard.nextLine());
				
				System.out.println("What is the gender of the dog? m = male | f = female | u = undefined");
				d.setGender(keyboard.nextLine().toLowerCase().charAt(0));
				
				System.out.println("What is the size of the dog?");
				d.setSize(Float.parseFloat(keyboard.nextLine()));
				
				System.out.println("What is the weight of the dog?");
				d.setWeight(Float.parseFloat(keyboard.nextLine()));
				
				System.out.println("Does the dog have fur?");
				question = keyboard.nextLine().toLowerCase().charAt(0);
				
				System.out.println("How many legs does the dog have?");
				d.setLegs(Integer.parseInt(keyboard.nextLine()));
				
				pet[i] = new Dog();
				
				System.out.println(pet[i].toString());

				break;

			case 2:


				break;

			case 3:



				break;

			case 4:


				break;

			default:
				System.out.println("Invalid input.");
				break;
			}

		}

		keyboard.close();
	}


	static int instructions() {

		int options = 0;

		System.out.println("Select one of the following actions:"
				+ "\n 1)Add a dog."
				+ "\n 2)Add a cat."
				+ "\n 3)Add a canary."
				+ "\n 4)Add a fish.");

		options = Integer.parseInt(keyboard.nextLine());

		return options;
	}
}