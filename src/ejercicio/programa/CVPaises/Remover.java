package ejercicio.programa.CVPaises;

import java.util.ArrayList;
import java.util.Scanner;

public class Remover {
	
	Scanner keyboard = new Scanner(System.in);
	
	int spot;

	public void delete(ArrayList<Countries> country) {
		
		boolean check = false;
				
		System.out.println("Insert name of the country to remove:");
		String cName = keyboard.nextLine();
			
		for (int i = 0; i < country.size(); i++) {
			
			if (country.get(i).getName().equalsIgnoreCase(cName)) {
				spot = i;
				confirm(country);
			}
		}
		
		if (check == false) {
			System.out.println("No entry has been found with that name.");			
		}
	}
	
	public void confirm(ArrayList<Countries> country) {
		System.out.println("Are you sure you want to create this entry?");
		String confirmation = keyboard.nextLine();	
		
		if ("y".equalsIgnoreCase(confirmation)) {
			
			country.remove(spot);
			
		} else if ("n".equalsIgnoreCase(confirmation)) {
			
			System.out.println("Returning");
			
		} else {
			
			System.out.println("Wrong key.");
			delete(country);
		}
	}
}