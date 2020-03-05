package ejercicio.programa.CVPaises;

import java.util.ArrayList;
import java.util.Scanner;

public class Searcher {
	
	Scanner keyboard = new Scanner(System.in);
	
	public void search(ArrayList<Countries> country) {
		
		boolean check = false;
		
		System.out.println("Insert a search term for country names:");
		String cName = keyboard.nextLine();
		
		
		for (int i = 0; i < country.size(); i++) {
			
			if (country.get(i).getName().toLowerCase().contains(cName)) {
				
				System.out.println(country.get(i).toString());
				check = true;
			}
		}
		
		if (check == false) {			
			System.out.println("No entry has been found with that name.");			
		}
	}
}