package ejercicio.programa.perrera;

import java.util.ArrayList;
import java.util.Scanner;

public class AppPerrera {

	static PerroDAO dao = new PerroDAOImpl();

	static Scanner keyboard = new Scanner(System.in);
	
	static ArrayList<Perro> dogs;
	
	static Perro dog;
	
	public static void main(String[] args) {
			
		pintarMenu();
		
	}

	static void pintarMenu() {
		
		int options = 0;		
		
		do {
			
			try {
				options = instructions();
			
				switch (options) {
				case 1:
					
					dogs = dao.getAll();
					
					for (int i = 0; i < dogs.size(); i++) {
						System.out.println((i+1) + ") " + dogs.get(i).toString());
					}
					
				break;
		
				case 2:
					/*pedir por pantalla nombre a buscar
					 * llamar al dao
					 * mostrar lista de resultados por pantalla
					 */
					System.out.println("Search for dogs by name:");
					String nombre = keyboard.nextLine();

					dogs = dao.buscarPorNombre(nombre);

					for (int i = 0; i < dogs.size(); i++) {
						System.out.println(dogs.get(i).toString());
					}

					break;

				case 3:

					int id = 0;
					
					System.out.println("Search for dogs by ID:");
					
					try {
						id = Integer.parseInt(keyboard.nextLine());

					} catch (Exception e) {
						System.out.println("Invalid input.");
					}  

					dog = dao.getById(id);
					
					break;

				case 4:

					System.out.println("Search for dogs by race:");
					String raza = keyboard.nextLine();

					dogs = dao.buscarPorRaza(raza);

					for (int i = 0; i < dogs.size(); i++) {
						System.out.println(dogs.get(i).toString());
					}

					break;

				case 5:

					dog = dao.crear(dog);

					System.out.println(dog.toString() + " has been added to the list.");

					break;

				case 6:

					int entryNum = 0;
					
					boolean confirmDel = false;
					
					System.out.println("Select the entry number to delete:");
					
					dogs = dao.getAll();
					
					for (int i = 0; i < dogs.size(); i++) {
						System.out.println((i+1) + ") " + dogs.get(i).toString());
					}
					
					try {
						
					entryNum = (Integer.parseInt(keyboard.nextLine()) - 1);
					
					} catch (Exception e) {
						
						System.out.println("Invalid input.");
						pintarMenu();
						
					}
					
					confirmDel = dao.delete(entryNum);
					
					if (confirmDel == true) {

						System.out.println("The entry has been deleted.");

					} else {

						System.out.println("The deletion has been cancelled.");
					}

					break;


				case 7:

					boolean confirmUp = dao.update(dog);

					if (confirmUp == true) {

						System.out.println("The entry has been edited.");

					} else {

						System.out.println("The edit has been cancelled.");
					}

					break;

				case 8:
					System.out.println("The program has been closed.");
					break;

				default:
					System.out.println("Invalid input.");
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
				+ "\n 1)List all the dogs."
				+ "\n 2)List dogs by name."
				+ "\n 3)List dogs by ID."
				+ "\n 4)List dogs by race."
				+ "\n 5)Add new dog."
				+ "\n 6)Delete dog."
				+ "\n 7)Edit dog data."
				+ "\n 8)Close the program.");
		
		try {
			
		options = Integer.parseInt(keyboard.nextLine());
		
		} catch (Exception e) {
			//Error message already triggers with the default switch.
		}
		
		return options;
	}
}