package ejercicio.basico.principiante;

import java.util.Scanner;

public class EjerciciosEstructuraSequencial {
	
	Scanner keyboard = new Scanner(System.in);
	
	public void ejercicio1() {
		//1.Programa Java que lea dos números enteros por teclado y los muestre por pantalla.
		
		System.out.println("Escribe 2 numeros:");
		int num1 = Integer.parseInt(keyboard.nextLine());
		int num2 = Integer.parseInt(keyboard.nextLine());
		
		System.out.println("Los numeros son " + num1 + " y " + num2);
	}
	
	public void ejercicio2() {
		//2.Programa Java que lea un nombre y muestre por pantalla:
		System.out.println("Escribe un nombre");
		String name = keyboard.nextLine();
		
		System.out.println("El nombre es " + name);		
	}
	
	public void ejercicio3() {
		//3.Programa Java que lee un número entero por teclado y obtiene y muestra por pantalla el doble y el triple de ese número.
		System.out.println("Escribe 1 numero:");
		int num = Integer.parseInt(keyboard.nextLine());
		
		System.out.println("El doble de " + num + " es " + (num * 2) + " y el triple es " + (num*3));
	}
	
	public void ejercicio4() {
		/*
		 * Ejercicio 4:
		 * Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit.
		 * La fórmula correspondiente para pasar de grados centígrados a fahrenheit es:
		 * F = 32 + ( 9 * C / 5)
		*/
		
		System.out.println("Escribe los grados centigrados que pasar a Farenheit:");
		float num = Float.parseFloat(keyboard.nextLine());
		
		System.out.println("Los grados Farenheit son: " + (32 + (9 * num / 5)) );
	}
	
	public static void main(String[] args) {
		EjerciciosEstructuraSequencial ejercicios = new EjerciciosEstructuraSequencial();
		ejercicios.ejercicio1();
		ejercicios.ejercicio2();
		ejercicios.ejercicio3();
		ejercicios.ejercicio4();
	}
}