package com.ipartek.formacion.metodos;

public class Utilidades {
	
	public static final String IDIOMA_CASTELLANO = "es";
	public static final String IDIOMA_EUSKERA = "eu";
	public static final String IDIOMA_INGLES = "en";
	
	
	static final char[] LETRA_DNI = {'T', 'R', 'W', 'A','G', 'M', 'Y',
			'F', 'P', 'D', 'X', 'B', 'N', 'J',
			'Z', 'S', 'Q', 'V', 'H', 'L', 'C',
			'K', 'E'};
	
	static final int DNI_SIZE = 8;
	

	static void saludar(String nombre) {
		System.out.println("Hola  " + nombre);
	}

	/**
	 * Saluda al nombre pasado por parametro en el idioma seleccionado
	 * l
	 * @see idiomas definidos en esta clase, por ejemplo: public static final String
	 *      IDIOMA_CASTELLANO
	 * @param nombre
	 * @param idioma
	 */
	static void saludar(String nombre, String idioma) {
		try {
			
			if (idioma == IDIOMA_CASTELLANO) {

				System.out.println("Hola  " + nombre);

			} else if (idioma == IDIOMA_EUSKERA) {

				System.out.println("Kaixo  " + nombre);

			} else {
				System.out.println("Hello  " + nombre);
			}
		} catch (Exception e) {
			
			System.out.println("The selected language is not included in the program");
		}
	}

	static int suma(int a, int b) {
		return a + b;
	}

	static char calcularLetraDni(int dni) {
		//TODO
		int posicionArray;
		String dniStr; 

		posicionArray = dni%23;


		posicionArray = 0;
		dniStr = Integer.toString(dni);

		posicionArray = dni%23;


		if (dniStr.length() != DNI_SIZE) {

			return ' ';
		}

		return LETRA_DNI[posicionArray];
	}

	static char calcularLetraDni(String dni) {
			
		int dniNum = Integer.parseInt(dni);
		
		return calcularLetraDni(dniNum);

	}
}