package ejercicio.programa.CVPaises;

import java.util.ArrayList;
import java.util.Scanner;

public class Adder {
	
	Countries info = new Countries();
	
	Scanner keyboard = new Scanner(System.in);
	
	public void add(ArrayList<Countries> country) {
			
		System.out.println("Insert name of the country:");
		info.setName(keyboard.nextLine());
		
		System.out.println("Is it infected? Y/N");
		String answer1 = keyboard.nextLine();
		
		if ("y".equalsIgnoreCase(answer1)) {
			info.setStatus(true);
				
			System.out.println("What is the number of infected people?");
			info.setInfections(Integer.parseInt(keyboard.nextLine()));
			confirm(country);
			
		} else if ("n".equalsIgnoreCase(answer1)) {
				
			info.setStatus(false);
			info.setInfections(0);
			confirm(country);

		} else {
				
				System.out.println("Wrong key.");
				add(country);
		}
	}
	
	public void confirm(ArrayList<Countries> country) {
		System.out.println("Are you sure you want to create this entry?");
		String confirmation = keyboard.nextLine();	
		
		if ("y".equalsIgnoreCase(confirmation)) {
			
			country.add(new Countries (info.getName(), info.isStatus(), info.getInfections()));
			
		} else if ("n".equalsIgnoreCase(confirmation)) {
			
			System.out.println("Returning");
			
		} else {
			
			System.out.println("Wrong key.");
			add(country);
		}
	}
}