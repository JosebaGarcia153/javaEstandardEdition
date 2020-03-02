package uf2404;

public class PruebaTecnica {

	public static void main(String[] args) {

		int numero = 0;

		for (int i = 0; i < 11; i++) {
			if (numero % 2 == 0 && numero == 0) {
				System.out.println("El numero " + numero + " no es par ni impar.");
				numero++;
			} else if (numero % 2 == 0) {
				System.out.println("El numero " + numero + " es par.");
				numero++;
			} else {
				System.out.println("El numero " + numero + " es impar.");
				numero++;
			}
		}

		/*
		 * System.out.println("Prueba tecnica");
		 * 
		 * System.out.println("** Terminamos el bucle");
		 * 
		 * for (int i = 0; i < 5; i++) {
		 * 
		 * System.out.println("Esta es la iteracion numero " + i); }
		 * 
		 * System.out.println("** Terminamos el bucle");
		 */
	}
}