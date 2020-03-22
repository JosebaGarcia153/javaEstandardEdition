package com.ipartek.formacion.clases.pajareria;


import java.util.ArrayList;
import java.util.Scanner;

public class PetShop {

	static Scanner keyboard = new Scanner(System.in);

	static ArrayList<Animal> pet = new ArrayList<Animal>();

	static char question;

	public static void main(String[] args) {

		Cat gato = new Cat();
		Dog perro = new Dog();
		Bird ave = new Bird();
		Canary canario = new Canary();
		Fish pez = new Fish();

		pet.add(gato);
		pet.add(perro);
		pet.add(ave);
		pet.add(canario);
		pet.add(pez);


		System.out.println("Add 5 animals to the list.");

		for (Animal animal : pet) {

			if (animal instanceof Dog) {

				Dog d = (Dog) animal;

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

				if ('y' == question) {
					System.out.println("What is the fur color of the dog?");
					d.setFurColor(keyboard.nextLine());
				}

				System.out.println("How many legs does the dog have?");
				d.setLegs(Integer.parseInt(keyboard.nextLine()));

			}

			if (animal instanceof Cat) {

				Cat c = (Cat) animal;

				System.out.println("What is the name of the cat?");
				c.setName(keyboard.nextLine());

				System.out.println("What is the eye color of the cat?");
				c.setEyeColor(keyboard.nextLine());

				System.out.println("What is the gender of the cat? m = male | f = female | u = undefined");
				c.setGender(keyboard.nextLine().toLowerCase().charAt(0));

				System.out.println("What is the size of the cat?");
				c.setSize(Float.parseFloat(keyboard.nextLine()));

				System.out.println("What is the weight of the cat?");
				c.setWeight(Float.parseFloat(keyboard.nextLine()));

				System.out.println("Does the cat have fur?");
				question = keyboard.nextLine().toLowerCase().charAt(0);

				if ('y' == question) {
					System.out.println("What is the fur color of the cat?");
					c.setFurColor(keyboard.nextLine());
				}

				System.out.println("How many legs does the cat have?");
				c.setLegs(Integer.parseInt(keyboard.nextLine()));
			}

			if (animal instanceof Bird) {

				Bird b = (Bird) animal;

				System.out.println("What is the name of the bird?");
				b.setName(keyboard.nextLine());

				System.out.println("What is the eye color of the bird?");
				b.setEyeColor(keyboard.nextLine());

				System.out.println("What is the gender of the bird? m = male | f = female | u = undefined");
				b.setGender(keyboard.nextLine().toLowerCase().charAt(0));

				System.out.println("What is the size of the bird?");
				b.setSize(Float.parseFloat(keyboard.nextLine()));

				System.out.println("What is the weight of the bird?");
				b.setWeight(Float.parseFloat(keyboard.nextLine()));

				System.out.println("What is the feather color of the bird?");
				b.setFeatherColor(keyboard.nextLine());

				System.out.println("How many claws does the bird have?");
				b.setClaws(Integer.parseInt(keyboard.nextLine()));
			}

			if (animal instanceof Canary) {

				Canary can = (Canary) animal;

				System.out.println("What is the name of the canary?");
				can.setName(keyboard.nextLine());

				System.out.println("What is the eye color of the canary?");
				can.setEyeColor(keyboard.nextLine());

				System.out.println("What is the gender of the canary? m = male | f = female | u = undefined");
				can.setGender(keyboard.nextLine().toLowerCase().charAt(0));

				System.out.println("What is the size of the canary?");
				can.setSize(Float.parseFloat(keyboard.nextLine()));

				System.out.println("What is the weight of the canary?");
				can.setWeight(Float.parseFloat(keyboard.nextLine()));

				System.out.println("What is the feather color of the canary?");
				can.setFeatherColor(keyboard.nextLine());

				System.out.println("How many claws does the canary have?");
				can.setClaws(Integer.parseInt(keyboard.nextLine()));
				
				System.out.println("Can the canary sing?");
				if ('y' == question) {
					can.setCanSing(true);
				} else {
					can.setCanSing(false);
				}
			}


			if (animal instanceof Fish) {

				Fish f = (Fish) animal;

				System.out.println("What is the name of the fish?");
				f.setName(keyboard.nextLine());

				System.out.println("What is the eye color of the fish?");
				f.setEyeColor(keyboard.nextLine());

				System.out.println("What is the gender of the fish? m = male | f = female | u = undefined");
				f.setGender(keyboard.nextLine().toLowerCase().charAt(0));

				System.out.println("What is the size of the fish?");
				f.setSize(Float.parseFloat(keyboard.nextLine()));

				System.out.println("What is the weight of the fish?");
				f.setWeight(Float.parseFloat(keyboard.nextLine()));

				System.out.println("What is the scale color of the fish?");
				f.setScaleColor(keyboard.nextLine());

				System.out.println("How many fins does the fish have?");
				f.setFins(Integer.parseInt(keyboard.nextLine()));
			}
		}

		for (int i = 0; i < pet.size(); i++) {
			System.out.println(pet.get(i));
		}

		keyboard.close();
	}
}