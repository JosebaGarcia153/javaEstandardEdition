package prueba2;

import java.util.ArrayList;
import java.util.Scanner;


public class Garage {
	
	static Scanner keyboard = new Scanner(System.in);
	
	static int carNumber = 0;
	static char check = ' ';
	static boolean confirmCheck = false;
	static boolean addMoreCheck = false;
	static boolean addMore = true;

	
	public static void main(String[] args) {

		ArrayList<Car> cars = new ArrayList<Car>();
		Car c = new Car();
		
		do {
			try {
				System.out.println("Type the plate of the car:");
				c.setPlate(keyboard.nextLine());

				System.out.println("Type the brand of the car:");
				c.setBrand(keyboard.nextLine());

				System.out.println("Type the model of the car:");
				c.setModel(keyboard.nextLine());

				System.out.println("Type the color of the car:");
				c.setColor(keyboard.nextLine());

				System.out.println("Type the horse power number of the car:");
				c.setHorsePower(Float.parseFloat(keyboard.nextLine()));
				
				if (c.getHorsePower() <= 0) {
					throw new Exception("The inserted number must be above 0.");
				}

				System.out.println("Type the engine capacity number of the car:");
				c.setEngineCapacity(Float.parseFloat(keyboard.nextLine()));
				
				if (c.getEngineCapacity() <= 0) {
					throw new Exception("The inserted number must be above 0.");
				}
				
	
				do {
					System.out.println("Are you sure you want to add this car? Y/N");
					check = keyboard.nextLine().charAt(0);

					if ('y' == check) {

						cars.add(new Car(c.getPlate(), c.getBrand(), c.getModel(), c.getColor(), c.getHorsePower(), c.getEngineCapacity()));
						confirmCheck = true;
						
					} else if  ('n' == check) {

						System.out.println("The entry has been cancelled.");
						confirmCheck = true;

					} else {

						System.out.println("You didn't insert Y or N.");
						confirmCheck = false;
					}
				} while (confirmCheck == false);
				
				
				
				do {
					System.out.println("Do you want to add another car? Y/N");
					check = keyboard.nextLine().charAt(0);

					if ('y' == check) {
						
						addMore = true;
						addMoreCheck = true;
						
					} else if  ('n' == check) {
						
						addMore = false;
						addMoreCheck = true;
						
					} else {
						
						System.out.println("You didn't insert Y or N.");
						addMoreCheck = false;
						
					}
				} while (addMoreCheck == false);
				
			}
			
			catch (NumberFormatException e) {
				System.out.println("You didn't insert a number.");
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}

		} while (addMore == true);
		
		System.out.println("The list of cars is:");
		
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i).toString());
		}
		
		keyboard.close();
	}
}