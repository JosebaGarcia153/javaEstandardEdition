package ejercicio.programa.CVPaises;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	
	static Scanner keyboard = new Scanner(System.in);
	
	Lister lister = new Lister();
	Adder adder = new Adder();
	Remover remover = new Remover();
	Searcher searcher = new Searcher();
	
	
	
	public void createMenu(ArrayList<Countries> country) {
		
		int options = 0;

		do {		
			selectOptions();
			
			options = Integer.parseInt(keyboard.nextLine());
			
			switch (options) {
				case 1:
					lister.list(country);
					break;
			
				case 2:	
					adder.add(country);
					break;
				
				case 3:
					remover.delete(country);
					break;
			
				case 4:
					searcher.search(country);
					break;
					
				case 5:
					System.out.println("The program has been closed.");
					break;

				default:
					System.out.println("Invalid number.");
					break;
			}			
		} while (options != 5);
		
		
		keyboard.close();		
	}
	
	public void selectOptions() {
		
		System.out.println("Please select an option:"
				+ "\n 1) List entries."
				+ "\n 2) Add entry."
				+ "\n 3) Delete entry."
				+ "\n 4) Search entries."
				+ "\n 5) Close the program.");
	}
}