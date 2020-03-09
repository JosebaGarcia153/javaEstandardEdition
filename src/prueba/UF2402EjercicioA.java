package prueba;

import java.util.Scanner;

/*
* A) Realizar un programa en java que realice la siguiente función: Crear un array de 5 notas que almacenara en formato double.
*	Una vez creado dicho array se rellenaran  dichos elementos leyéndolo desde el teclado.
*	Una vez creado el contenido, se calculara la media de las notas así como se mostraran las notas más altas y más bajas de dicho array.

* @author Joseba Garcia Pablos
 */

public class UF2402EjercicioA {
	
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		Double[] notes = new Double[7];
		
		double highScore = Double.MIN_VALUE;
		double lowScore = Double.MAX_VALUE;
		double average = 0;
		int students = 0;
		
		System.out.println("Inser the notes of your 7 students:");
		
		for (int i = 0; i < notes.length; i++) {
			
			System.out.println("Note of the " + (i+1) + "º student.");
			
			boolean correct = false;
			
			do {
				
				try {
					
					notes[i] = Double.parseDouble(keyboard.nextLine());
					correct = true;
					
				} catch (Exception e) {
					
					System.out.println("Please insert a valid number.");	
				}	
				
			} while (correct == false);
					
			if (notes[i] < lowScore) {
				
				lowScore = notes[i];
				
			} else if (notes[i] > highScore) {
				
				highScore = notes[i];
				
			}
			
			average += notes[i];
			
			students++;
		}
		
		average = average / students;
		
		System.out.println("The notes are:");
		
		for (int i = 0; i < notes.length; i++) {
			
			System.out.println(notes[i]);
			
		}
		
		System.out.println("The average of the notes is " + average
				+ ", the highest score is " + highScore
				+ " and the lowest is " + lowScore + ".");
		
		keyboard.close();
	}	
}