package ejercicio.programa.CVPaises;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	
	Scanner keyboard = new Scanner(System.in);
	
	Lister lister = new Lister();
	Adder adder = new Adder();
	Remover remover = new Remover();
	Searcher searcher = new Searcher();
	
	
	
	public void createMenu(ArrayList<Countries> country) {
		
		int options = 0;
		
		System.out.println("Please select an option:"
				+ "\n 1) List entries."
				+ "\n 2) Add entry."
				+ "\n 3) Delete entry."
				+ "\n 4) Search entries."
				+ "\n 5) Close the program.");
		
		options = Integer.parseInt(keyboard.nextLine());
		
		do {
			switch (options) {
				case 1:
					lister.list(country);
					createMenu(country);
					break;
			
				case 2:	
					adder.add(country);
					createMenu(country);
				break;
				
				case 3:
					remover.delete(country);
					createMenu(country);
					break;
			
				case 4:
					searcher.search(country);
					createMenu(country);
					break;
					
				case 5:
					terminate();
					break;

				default:
					System.out.println("Invalid number.");
					createMenu(country);
					break;
			}
			
			
		} while (options != 5);
		
		keyboard.close();
	}
	
	public void terminate() {
		System.out.println("The program has been closed.");
	}
}