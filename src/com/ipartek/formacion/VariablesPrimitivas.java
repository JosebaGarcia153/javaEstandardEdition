package com.ipartek.formacion;

public class VariablesPrimitivas {

	public static void main(String[] args) {

		// Booleans
		boolean tienesCoronaVirus = true; // default value: false

		// Integers
		byte bite = 0; // 1 byte = 8 bits
		short corto = 0; // 2 bytes
		int entero = 0; // 4 bytes
		long largo = 0; // 8 bytes

		// Actual numbers or decimals
		float numeroReal = 2f; // it's necessary to write it with an f at the end or (float) at the start
		double todaviaMasGrande = 6; // no need for casting or assigning a type

		// characters
		char letra = 'a'; // it uses simple quotes
		char letraA = 65;

		/*
		 * Wrappers: Are classes that help us work with primitive variables.
		 *  This always start with capital letters
		 * 
		 * int => Integer
		 * boolean => Boolean
		 * char => Characters
		 * ...
		 * ...
		 */

		System.out.println("Un int ocupa " + Integer.SIZE + " bits");
		System.out.println("valor minimo " + Integer.MIN_VALUE + " valor maximo " + Integer.MAX_VALUE);

		String numeroEnFormatoTexto = "23";
		int numero2 = 2;

		int total = numero2 + Integer.parseInt(numeroEnFormatoTexto);
		System.out.println(numero2 + " + " + numeroEnFormatoTexto + " = " + total);
	}
}