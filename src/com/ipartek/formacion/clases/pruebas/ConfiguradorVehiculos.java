package com.ipartek.formacion.clases.pruebas;
import java.util.Scanner;

import com.ipartek.formacion.clases.*;

public class ConfiguradorVehiculos {
	
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// preguntar por consola como quiere el Vehiculo

		// preguntar color
		// preguntar matricula
		// preguntar puertas y resto de atributos

		// mostrar uno a uno todos los atriibutos por consola
		
		Vehiculo v1 = new Vehiculo("", "", 0, 0, 0, 0);
		
		System.out.println("¿De que color va a ser el vehiculo?");
		v1.setColor(keyboard.nextLine());
		
		System.out.println("¿Cual es la matricula del vehiculo?");
		v1.setMatricula(keyboard.nextLine());
		
		System.out.println("¿Cual es numero de asientos del vehiculo?");
		v1.setNumAsientos(Integer.parseInt(keyboard.nextLine()));
		
		System.out.println("¿Cual es numero de ruedas del vehiculo?");
		v1.setNumRuedas(Integer.parseInt(keyboard.nextLine()));
		
		System.out.println("¿Cual es numero de puertas del vehiculo?");
		v1.setNumPuertas(Integer.parseInt(keyboard.nextLine()));
		
		System.out.println("¿Cual es la potencia del vehiculo?");
		v1.setPotencia(Float.parseFloat(keyboard.nextLine()));
		
		System.out.println("Color: " + v1.getColor());
		System.out.println("Matricula: " + v1.getMatricula());
		System.out.println("Asientos: " + v1.getNumAsientos());
		System.out.println("Ruedas: " + v1.getNumRuedas());
		System.out.println("Puertas: " + v1.getNumPuertas());
		System.out.println("Potencia: " + v1.getPotencia());
	}
}