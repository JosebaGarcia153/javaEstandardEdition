package com.ipartek.formacion.excepciones;

import java.util.Scanner;

/*
 * Realice un programa que nos solicite por teclado dos n�meros, 
 * y leerlos usando la clase Scanner mediante la funci�n nextLine(). 
 * Transformar ambos strings a n�meros enteros usando la siguiente sentencia Integer.parseInt(numeroLeido).
 * Agrupar el c�digo entre un bloque try catch y procesar para que no se produzca una interrupci�n
 * y finalizaci�n del programa si alguno de los n�meros le�dos no puede convertirse,
 * retomando el control en el punto del fallo, hasta que se solucione.

 */

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		boolean errors = true;
		
		System.out.println("Inser 2 numbers for the following operation: a+b=?");

		do {
		
			try {
				
				System.out.println("a number:");
				num1 = Integer.parseInt(keyboard.nextLine());

				System.out.println("b number:");

				num2 = Integer.parseInt(keyboard.nextLine());

				System.out.println("a=" + num1 + " & b=" + num2);

				errors = false;
			}
			
			catch (NumberFormatException e) {

				System.out.println("You did not insert a number.");
			}

			catch (Exception e) {

				System.out.println("Excepcion no controlada");
			}

		} while (errors == true);
			
		System.out.println("End of the program");
		keyboard.close();
	}		
}