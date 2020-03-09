package com.ipartek.formacion.excepciones;

import java.util.Scanner;

/*
 * Realice un método que reciba como argumento un String y un número y muestre la letra de la posición indicada.
 * Llámelo pasando como parámetro  un String sin inicializar.
 * Dicha llamada se encontrara dentro de un bloque try catch,
 * que en caso de producirse una excepción por un paso de parámetros a null, no acabe con la ejecución del programa. 
 * Así mismo, se controlara también que si el numero pasado es mayor que el tamaño del string,
 * capturara el error y nos solicitara meter un numero valido,
 * indicándonos los valores en los que puede estar comprendido
 * (para este apartado se le pasa como string la cadena de texto “La lluvia en Sevilla no es una maravilla”) 

 */

public class Ejercicio3 {
	
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String frase = " ";
		int posicion = 0;
		char letraEnPosicion = ' ';
		
		try {

			boolean error = true;

			System.out.println(frase);
			do {

				frase.charAt(posicion);
				error= false;

			} while (error == true);
	
		}

		catch (NullPointerException e) {

			System.out.println("Error");
		}
		catch (IndexOutOfBoundsException e) {

			System.out.println("Please write a number from 0 to " + (frase.length()-1));
			posicion = Integer.parseInt(keyboard.nextLine());
		}
	}

}
