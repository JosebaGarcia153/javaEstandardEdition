package ejercicio.basico.bucles;

import java.util.Scanner;

public class PaisesArrayListMethods {
	
	Scanner keyboard = new Scanner(System.in);
	
	
	private int options = 0;
	private String finish;
	
	public void menu() {
		
		System.out.println("Select an option:"
				+ "\n 1) Show full list.\n 2) Add a new entry."
				+ "\n 3) Delete an entry."
				+ "\n 4) Search an specific entry."
				+ "\n 5) Terminate program");
		
		options = Integer.parseInt(keyboard.nextLine());
		
		switch (options) {
		
			case 1:
				show();
				break;
			
			case 2:
				create();
				break;
				
			case 3:
				delete();
				break;
				
			case 4:
				search();
				break;
			
			case 5:
				terminate();
				break;	
				
			default:
				System.out.println("Please select a valid option number."
						+ "\n 1) Show full list.\n 2) Add a new entry."
						+ "\n 3) Delete an entry."
						+ "\n 4) Search an specific entry."
						+ "\n 5) Terminate program");
				break;
		}
	}
	
	public void show() {
		
		menu();
	}
	
	public void create() {
		
		menu();
	}
	
	public void delete() {
		
		menu();
	}
	
	public void search() {
		
		menu();
	}
	
	public void terminate() {
		
		System.out.println("Are you sure you want to close the program? Y/N");
		finish = keyboard.nextLine();
		
		if ("y".equalsIgnoreCase(finish)) {
			keyboard.close();
			System.exit(0);
			
		} else if ("n".equalsIgnoreCase(finish)) {
			keyboard.close();
			menu();
			
		} else {
			keyboard.close();
			terminate();
		}
	}
}