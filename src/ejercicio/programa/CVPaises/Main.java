package ejercicio.programa.CVPaises;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Countries> country = new ArrayList<Countries>();
		country.add(new Countries ("Norway", false, 0));
		country.add(new Countries ("Germany", true, 50));
		country.add(new Countries ("Czeck Republic", false, 0));
		country.add(new Countries ("France", true, 80));
		country.add(new Countries ("Italy", true, 2000));
		
		Menu program = new Menu();
		program.createMenu(country);
	}
}