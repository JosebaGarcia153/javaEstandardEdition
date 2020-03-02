package Preguntas;

import java.util.Scanner;

public class PreguntarNombre {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Escribe tu nombre");
		String nombre = keyboard.nextLine();

		System.out.println("Escribe tu primer apellido");
		String apellido1 = keyboard.nextLine();

		System.out.println("Escribe tu segundo apellido");
		String apellido2 = keyboard.nextLine();

		keyboard.close();

		System.out.println("El nombre que has insertado es " + nombre + " " + apellido1 + " " + apellido2 + ".");
	}
}