package ejercicio.basico.principiante;

import java.util.Scanner;

public class PaisesCoronaVirus {
	
	/*
	 * - Recorrer PAISES
	 * - Preguntar si existe algun caso
	 * - En caso afirmativo preguntar el numero de infectados
	 * - Mostrar paises libres del virus
	 * - Mostrar paises infectados junto con el numero de casos
	 * - Total de personas infectadas
	 */
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		final String[] PAISES = {"Noruega", "Alemania", "Republica Checa", "Italia"};
		boolean[] paisesInfectados = {false, false, false, false};
		int[] numeroInfectados = { 0, 0, 0, 0};
		
		String respuesta1 = "";
		int total = 0;
		
		for (int i=0;i<PAISES.length;i++) {
			
			System.out.println("¿Hay infecciones en " + PAISES[i] + "? y/n");
			respuesta1 = keyboard.nextLine();
			
			if (respuesta1.equalsIgnoreCase("y")) {
				paisesInfectados[i] = true;
				
				System.out.println("¿Cual es el numero de infectados?");
				numeroInfectados[i] = Integer.parseInt(keyboard.nextLine());
				
				total = total + numeroInfectados[i];
			} else {
				paisesInfectados[i] = false;
			}	
		}
		
		System.out.println("Los paises sin infecciones son:");
		for (int i=0;i<PAISES.length;i++) {
			if (paisesInfectados[i] == false) {
				System.out.println(PAISES[i]);
			}
		}
		
		System.out.println("Los paises infectados son:");
		for (int i=0;i<PAISES.length;i++) {
			if (paisesInfectados[i] == true) {
				System.out.println(PAISES[i] + " con " + numeroInfectados[i] + " infectados.");
			}
		}
		System.out.println("El total de infectados es: " + total);	
	}
}