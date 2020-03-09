package prueba;

import java.util.Scanner;

/*
*	* B) Crear un proyecto en modo consola que nos muestre un menú de 3 opciones
•	Calcular la letra del dni
•	Calcular medida de cm a pulgadas
•	Salir
Hacer que dicho menú se ejecute en bucle hasta que se pulse salir, y si el usuario escoge cada una de las funciones, que permita introducir los datos correspondientes por teclado para poder dar el resultado
*
* @author Joseba Garcia Pablos
 */

public class UF2402EjercicioB {
	
	static Scanner keyboard = new Scanner(System.in);
	
	static final int DNI_SIZE = 8;
	static final char[] DNI_LETTER = {'T', 'R', 'W', 'A','G', 'M', 'Y',
									'F', 'P', 'D', 'X', 'B', 'N', 'J',
									'Z', 'S', 'Q', 'V', 'H', 'L', 'C',
									'K', 'E'};
	
	
	public static void main(String[] args) {
		
		int options;
		
		do {

			options = drawMenu();
			 
			switch (options) {
			
				case 1:
					findDNI();
					break;
				
				case 2:	
					convertCM();
					break;
					
				case 3:
					System.out.println("The program has been terminated.");
					break;
					
				default:
					System.out.println("Please select a valid number.");
					break;
			}
		} while (options != 3);
		
		keyboard.close();	
		
		
	}
	
	
	
	public static int  drawMenu() {
		
		int options = 0;
		boolean correct = false;
		
		do {
			
			System.out.println("Choose an option:" 
					+ "\n 1) Calculate DNI letter."
					+ "\n 2) Calculate centimeter to inches conversion."
					+ "\n 3) Close the program.");
			
			try {
				options = Integer.parseInt(keyboard.nextLine());

				correct = true;
				
			} catch (Exception e) {
				
				System.out.println("Please insert a valid number.");	
			}
			
		} while (correct == false);

		return options;
	}
	
	
	
	public static void findDNI() {
		
		boolean correct = false;
		
		String dni;
		int dniNum = 0;
		
		do {
			
			System.out.println("Insert a DNI number:");

			try {
				
				dni = keyboard.nextLine();
				
				if (dni.length() == DNI_SIZE) {
					
					dniNum = Integer.parseInt(dni);
					correct = true;
					
				} else {
					
					System.out.println("Please insert a valid DNI.");
					
				}

			} catch (Exception e) {
				
				System.out.println("Please insert a valid DNI.");	
			}
			
		} while (correct == false);
		
		
		int arrayPosition = dniNum%23;
		
		System.out.println("The full DNI is: " + dniNum + "-" + DNI_LETTER[arrayPosition]);
		
	}
	
	
	
	public static void convertCM() {
		
		double height = 0;
		double inches = 0;
	    boolean correct = false;
	    
	    
		do {
			
			System.out.println("Insert the height you want to convert from centimeters to inches:");
			
			try {
				
				height = Double.parseDouble(keyboard.nextLine());
				correct = true;
				
			} catch (Exception e) {
				
				System.out.println("Please insert a valid number.");	
			}
			
		} while (correct == false);
		
		inches = height * 0.3937;
		
		System.out.println(height + "cm equals " + inches + "''.");
	}
}