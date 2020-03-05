package ejercicio.programa.CVPaises;

import java.util.ArrayList;

public class Lister {
	
	public void list(ArrayList<Countries> country) {
		
		for (int i = 0; i < country.size(); i++) {
			System.out.println(country.get(i).toString());
		}
	}
}
