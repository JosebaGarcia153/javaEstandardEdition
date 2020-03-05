package prueba;

import java.util.Scanner;

/*
 * B)
		Crear un projecto en modo consola que nos muestre un menu con 3 opciones.
		Calcular la letra del DNI
		Calcular medida de ºC a F
		Salir
 */

public class EjercicioB {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int opciones = 0;
		
		do {
			
			System.out.println("Selecciona una de las acciones a realizar:"
					+ "\n 1) Calcular letra del DNI."
					+ "\n 2) Calcular la conversion de una temperatura de ºC a F."
					+ "\n 3) Cerrar el programa.");
			
			opciones = Integer.parseInt(keyboard.nextLine());
			
			switch (opciones) {
			case 1:
				
				String[] letra = {"T", "R", "W", "A","G", "M", "Y",
								  "F", "P", "D", "X", "B", "N", "J",
								  "Z", "S", "Q", "V", "H", "L", "C",
								  "K", "E"};
				
				System.out.println("Inserta el numero del DNI:");
				int numero = Integer.parseInt(keyboard.nextLine());
				
				int posicionArray = numero%23;
				
				System.out.println("El DNI con su letra es: " + numero + "-" + letra[posicionArray]);
				
				break;
				
			case 2:
				
				System.out.println("Inserta la temperatura en grados centigrados que convertir a Farenheit:");
				
				int tempC = Integer.parseInt(keyboard.nextLine());
				
				int tempF = (tempC*9/5)+32;
				
				System.out.println("La temperatura en Farenheit es: " + tempF + "F.");
				
				break;
				
			case 3:
				
				System.out.println("El programa ha sido cerrado.");
				
				break;

			default:
				System.out.println("Selecciona un numero de opcion valido:"
						+ "\n 1) Calcular letra del DNI."
						+ "\n 2) Calcular la conversion de una temperatura de ºC a F."
						+ "\n 3) Cerrar el programa.");
				break;
			}
		} while (opciones != 3);
		
		keyboard.close();
	}//main

}//clase
