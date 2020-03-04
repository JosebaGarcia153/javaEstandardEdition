package ejercicio.basico.bucles;

import java.util.ArrayList;
import java.util.Scanner;

public class PaisesArrayListMain {
	
	static ArrayList<Pais> list;	
	
	public static void main(String[] args) {
		
			
		crearPaises();
		
		listar();
		
		
		
	}
	
	
	 static void crearPaises() {
		 list = new ArrayList<Pais>();
		list.add(new Pais ("Norway", false, 0));
		list.add(new Pais ("Germany", true, 50));
		list.add(new Pais ("Czech Republic", false, 0));
		list.add(new Pais ("Italy", true, 2000));
	}
	 
	 
	 static void listar() {
		
		 for (int i = 0; i < list.size(); i++) {
			 Pais pActual = list.get(i);
			System.out.println(pActual);
		}
	}// listar
	
}