package ejercicio.basico.principiante;

public class EjerciciosOperadoresLogicos {

	public void ejercicio1() {
		
		/*
		 * Ejercicio 1: Si X, Y y Z son variables de tipo boolean con valores:
		 * X = true, Y = false, Z = true
		 * Determina el valor de las siguientes expresiones lógicas:

			a) (X && Y) || (X && Z)
			b) (X || !Y) && (!X || Z)
			c) X || Y && Z 
			d) !(X || Y) && Z 
			e) X || Y || X && !Z && !Y
			f) !X || !Y || Z && X && !Y
		 */
		
		System.out.println("Ejercicio 1:");
		boolean X = true;
		boolean Y = false;
		boolean Z = true;
		
		System.out.println("a) " + ((X && Y) || (X && Z)));
		System.out.println("b) " + ((X || !Y) && (!X || Z)));
		System.out.println("c) " + (X || Y && Z));
		System.out.println("d) " + (!(X || Y) && Z));
		System.out.println("e) " + (X || Y || X && !Z && !Y));
		System.out.println("f) " + (!X || !Y || Z && X && !Y));		
	}
	
	public void ejercicio2() {
		
		/*
		 * Ejercicio 2: Si W, X, Y y Z son variables de tipo boolean con valores:
		 * W = false, X = true, Y = true, Z = false
		 * Determina el valor de las siguientes expresiones lógicas:
			a) W || Y && X && W || Z 
			b) X && !Y && !X || !W && Y
			c) !(W || !Y) && X || Z
			d) X && Y && W || Z || X
			e) Y || !(Y || Z && W)
			f) !X && Y && (!Z || !X)
		 */
		
		System.out.println("Ejercicio 2:");
		
		boolean W = false;
		boolean X = true;
		boolean Y = true;
		boolean Z = false;
		
		System.out.println("a) " + (W || Y && X && W || Z ));
		System.out.println("b) " + (X && !Y && !X || !W && Y));
		System.out.println("c) " + (!(W || !Y) && X || Z));
		System.out.println("d) " + (X && Y && W || Z || X));
		System.out.println("e) " + (Y || !(Y || Z && W)));
		System.out.println("f) " + (!X && Y && (!Z || !X)));	
	}

	public static void main(String[] args) {
		EjerciciosOperadoresLogicos ejercicios = new EjerciciosOperadoresLogicos();
		ejercicios.ejercicio1();
		ejercicios.ejercicio2();
	}

}
