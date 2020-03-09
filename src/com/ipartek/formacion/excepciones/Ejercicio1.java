package com.ipartek.formacion.excepciones;

import java.util.Scanner;

/*
 * Implemente un programa que lea un número ‘a’ y otro número ‘b’ y luego calcule “a/b”.
 * Pruebe a introducir b=0 y ver que hace el programa con la división por cero. 
 * Pruebe a introducir b=”Carlos” para ver cómo se comporta el programa.
 * Añada excepciones para recoger estas excepciones y avisar del problema al usuario.

 */

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		double num1 = 0;
		double num2 = 0;
		double result = 0;
			

		System.out.println("Inser 2 numbers for the following operation: a/b=?");

		System.out.println("a number:");
		
		try {
			num1 = Double.parseDouble(keyboard.nextLine());

			System.out.println("b number:");

			num2 = Double.parseDouble(keyboard.nextLine());


			result = num1 / num2;

			if (result == Double.POSITIVE_INFINITY) {

				throw new ArithmeticException("Dividing by 0 causes the result to go into infinity.");

			}

			System.out.println(num1 + " / " + num2 + " = " + result);		
		}
		
		catch (NumberFormatException e) {

			System.out.println("You did not insert a number.");
		}
		
		catch (ArithmeticException e) {

			System.out.println(e.getMessage()); 
		} 
		
		catch (Exception e) {
			
			System.out.println("Excepcion no controlada");
		}
		
		finally {
			
			keyboard.close();
		}
	}
}