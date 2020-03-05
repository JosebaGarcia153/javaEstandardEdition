package ejercicio.programa.perrera;

import java.util.Scanner;

public class AppPerrera {

	static PerroDAO dao = new PerroDAOImpl();

	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		System.out.println("Graphic Interface");
		pintarMenu();



	}

	static void pintarMenu() {
		
		instructions();
		
		int options;
		
		do {
			
			options = Integer.parseInt(keyboard.nextLine());
			
			switch (options) {
			case 1:
				
				System.out.println(dao.getAll().toString());
				break;
				
			case 2:
				/*pedir por pantalla nombre a buscar
				 * llamar al dao
				 * mostrar lista de resultados por pantalla
				 */
				System.out.println("Search for dogs by name:");
				String nombre = keyboard.nextLine();
				dao.buscarPorNombre(nombre);
				break;
				
			case 3:
				System.out.println("Search for dogs by race:");
				String raza = keyboard.nextLine();
				dao.buscarPorRaza(raza);
				break;
				
			case 4:
				System.out.println("Search for dogs by ID:");
				int id = Integer.parseInt(keyboard.nextLine());
				dao.getById(id);
				break;
				
			case 5:
				System.out.println("Add a new dog to the database:");
				break;
				
			case 6:
				System.out.println("Delete a dog from the database:");
				break;
				
			case 7:
				System.out.println("Edit a dog's info:");
				break;
				
			case 8:
				terminate();
				break;
				
			default:
				System.out.println("Incorrect option number");
				break;
			}
		} while (options != 8);
		
		keyboard.close();
	}
	
	static void instructions() {
		System.out.println("Select one of the following actions:"
				+ "\n 1)List all the dogs"
				+ "\n 2)List dogs by name"
				+ "\n 3)List dogs by ID"
				+ "\n 4)List dogs by race"
				+ "\n 5)Add new dog"
				+ "\n 6)Delete dog"
				+ "\n 7)Edit dog data"
				+ "\n 8)Close the program");
	}
	
	static public void terminate() {
		System.out.println("The program has been closed.");
	}
}