package com.ipartek.formacion.clases.pruebas;
import com.ipartek.formacion.clases.*;

public class PersonaPruebas2 {

	public static void main(String[] args) {
		
		Persona adam = new Persona();
		Persona eva = new Persona();
		
		adam.setNombre("Adam");
		adam.setEdad(45);
		
		eva.setNombre("Eva");
		eva.setEdad(18);
		
		System.out.println("Mi nombre es " + adam.getNombre() + " y mi edad es " + adam.getEdad());
		System.out.println("Mi nombre es " + eva.getNombre() + " y mi edad es " + eva.getEdad());
		
//		System.out.println("Adam: " + adam);
//		System.out.println("Adam: " + eva.toString());
	}

}
