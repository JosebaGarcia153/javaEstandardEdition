package prueba;

import java.util.Scanner;

/*
	A)
		Crear un array con 5 alturas de personas. 
		Una vez creado dicho array, rellenalo pidiendo los datos por teclado.
		Una vez que hemos llenado el array, calcular la altura media, el mas alto y el mas bajo.				
 */

public class EjercicioA {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int[] alturas = new int[5];
		double media = 0;
		int bajo = Integer.MAX_VALUE;
		int alto = Integer.MIN_VALUE;
		
		System.out.println("Escribe las alturas de 5 personas en centimetros:");
		
		for (int i=0;i<alturas.length;i++) {
			alturas[i] = Integer.parseInt(keyboard.nextLine());
			media += alturas[i];	
			
			if (alturas[i] < bajo) {
				bajo = alturas[i];
			}
			if (alturas[i] > alto) {
				alto = alturas[i];
			}
		}
		
		media = media / alturas.length;
		
		System.out.println("Las alturas que has escrito son:");
		
		for (int i=0;i<alturas.length;i++) {
			System.out.println(alturas[i] + "cm.");
		}
		
		System.out.println("La media de las alturas es " + media + "cm, la altura mas baja es " + bajo + "cm y la mas alta es " + alto + "cm.");		
	
		keyboard.close();
	}
}