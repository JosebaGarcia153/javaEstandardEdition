package com.ipartek.formacion.excepciones;

import java.util.Scanner;

/*
 * Realice un m�todo que reciba como argumento un String y un n�mero y muestre la letra de la posici�n indicada.
 * Ll�melo pasando como par�metro  un String sin inicializar.
 * Dicha llamada se encontrara dentro de un bloque try catch,
 * que en caso de producirse una excepci�n por un paso de par�metros a null, no acabe con la ejecuci�n del programa. 
 * As� mismo, se controlara tambi�n que si el numero pasado es mayor que el tama�o del string,
 * capturara el error y nos solicitara meter un numero valido,
 * indic�ndonos los valores en los que puede estar comprendido
 * (para este apartado se le pasa como string la cadena de texto �La lluvia en Sevilla no es una maravilla�) 

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
