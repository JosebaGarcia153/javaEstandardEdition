package ejercicio.basico.principiante;

import java.util.Scanner;

public class MediaNumerosFor {

	// Pedir al usuario la temperatura de los dias de la semana empezando por el
	// lunes y luego mostrar por pantalla la media de la semana y las temperaturas
	// mas baja y alta

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		float num = 0f;
		float media = 0f;
		float min = Float.MAX_VALUE;
		float max = Float.MIN_VALUE;
		float suma = 0f;
		
		int contador = 0;

		final String[] DIAS_SEMANA = { "lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo" };
		
		for (int i = 0; i < DIAS_SEMANA.length ; i++) {

			String dia = DIAS_SEMANA[i];

			System.out.println("Dime la temperatura del " + dia);
			num = Float.parseFloat(keyboard.nextLine());

			suma = suma + num;
			contador++;

			if (num < min) {
				min = num;
			}
			if (num > max) {
				max = num;
			}
		}
		keyboard.close();
		media = suma / contador;

		System.out.println("La media de las temperaturas es: " + media + "ºC");
		System.out.println("La temperatura minima ha sido: " + min + "ºC");
		System.out.println("La temperatura maxima ha sido: " + max + "ºC");
	}
}