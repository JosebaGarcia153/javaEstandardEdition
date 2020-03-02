package ejercicio.basico.principiante;

import java.util.Scanner;

public class MediaNumeros {

	// Ejercicio para pedir 3 numeros por pantalla y sacar la media

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int num1, num2, num3;
		float media;

		System.out.println("Dime el primer numero");
		num1 = Integer.parseInt(keyboard.nextLine());

		System.out.println("Dime el segundo numero");
		num2 = Integer.parseInt(keyboard.nextLine());

		System.out.println("Dime el tercer numero");
		num3 = Integer.parseInt(keyboard.nextLine());

		keyboard.close();

		media = (num1 + num2 + num3) / 3.0f;

		System.out.println("La media de los 3 numeros es: " + media);
	}
}