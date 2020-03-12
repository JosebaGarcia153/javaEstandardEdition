package com.ipartek.formacion.clases.pruebas;

import java.util.Scanner;

import com.ipartek.formacion.clases.Persona2;
import com.ipartek.formacion.clases.Profesor;

public class PedirDatosProfesorConsola {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		Profesor p = new Profesor();
		String nombre = "";
		String materia = "";
		float sueldo = 0;
		int altura = 0;
		int edad = 0;
		char genero = Persona2.GENERO_INDEFINIDO;

		try {
			// Pedir datos por consola
			System.out.println("Vamos a dar de alta un nuevo Profesor, necesito los siguientes datos");
			System.out.println("nombre:");
			nombre = keyboard.nextLine();

			System.out.println("materia que imparte:");
			materia = keyboard.nextLine();

			System.out.println("El sueldo anual en bruto:");
			sueldo = Float.parseFloat(keyboard.nextLine());

			System.out.println("Su altura en cm:");
			altura = Integer.parseInt(keyboard.nextLine());

			System.out.println("Su edad:");
			edad = Integer.parseInt(keyboard.nextLine());

			System.out.println("Dime su genero, escribe solo una letra 'f' FEMENINO o 'm' MASCULINO ");
			genero = keyboard.nextLine().toLowerCase().charAt(0);
			
			
			if (genero != 'f' && genero != 'm') {
				
			}
		}
		catch (NumberFormatException e) {
			System.out.println("No has escrito un numero");
		}
		
		catch (Exception e) {
			System.out.println("You didn't choose f o m");
		}
		// rellenar el objeto
		p.setNombre(nombre);
		p.setMateria(materia);
		p.setSueldo(sueldo);
		p.setGenero(genero);

		// mostrar por pantalla
		System.out.println("Gracias por la informacion, hemos dado de alta el siguiente profesor");
		System.out.println(p);

		keyboard.close();

	}
}