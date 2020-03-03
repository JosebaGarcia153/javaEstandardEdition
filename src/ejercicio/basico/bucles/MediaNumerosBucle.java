package ejercicio.basico.bucles;

import java.util.Scanner;

public class MediaNumerosBucle {

	// Ejercicio para pedir 3 numeros por pantalla y sacar la media

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		float num;
		float media = 0f;
		float suma = 0f;
		
		int contador = 0;

		// for 0.. N while 0.. N do while 1.. N

		System.out.println("Dime 3 numeros");

		for (int i = 0; i < 3; i++) {
			num = Float.parseFloat(keyboard.nextLine());
			suma = suma + num;
			contador++;
		}
		media = suma / contador;

		System.out.println("El total es: " + suma);
		System.out.println("La media de los 3 numeros es: " + media);

		boolean continuar = true;
		suma = 0;
		contador = 0;

		do {
			System.out.println("Dime un numero");
			num = Float.parseFloat(keyboard.nextLine());
			suma = suma + num;
			contador++;

			System.out.println("¿Quieres terminar? y/n");
			String linea = keyboard.nextLine();

			if (linea.equalsIgnoreCase("y")) {
				continuar = false;
			}
		} while (continuar);

		media = suma / contador;
		System.out.println("El total es: " + suma);
		System.out.println("La media de los 3 numeros es: " + media);

		suma = 0;
		contador = 0;

		System.out.println("Escribe 3 numeros");

		while (contador < 3) {
			num = Float.parseFloat(keyboard.nextLine());
			suma = suma + num;
			contador++;
		}
		media = suma / contador;

		System.out.println("El total es: " + suma);
		System.out.println("La media de los 3 numeros es: " + media);
	}
}