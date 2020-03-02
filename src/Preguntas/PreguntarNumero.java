package Preguntas;

import java.util.Scanner;

public class PreguntarNumero {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Escribe un numero entero");

		int numero = keyboard.nextInt();

		keyboard.close();

		System.out.println("Has escrito " + numero);

		if (numero % 2 == 0 && numero == 0) {
			System.out.println("El numero " + numero + " no es par ni impar.");
		} else if (numero % 2 == 0) {
			System.out.println("El numero " + numero + " es par.");
		} else {
			System.out.println("El numero " + numero + " es impar.");
		}
	}
}