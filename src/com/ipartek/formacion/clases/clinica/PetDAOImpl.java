package com.ipartek.formacion.clases.clinica;


import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public class PetDAOImpl implements PetDAO {
	
	Scanner keyboard = new Scanner(System.in);
	
	private ArrayList<Pet> animal;	
	private Revision rev;
	
	private DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
	private LocalDate date;
	private LocalDate today;

	private boolean check = false;


	public PetDAOImpl() {

		this.animal = new ArrayList<Pet>();
		this.rev = new Revision();
	}

	@Override
	public Pet searchByID(int id) throws Exception {

		for (Pet p: animal) {
			if (p instanceof Revision) {

				rev = (Revision) p;

				if (id == rev.getId()) {
					return rev;
				}	
			}		
		}
		throw new Exception("The ID was not found.");
	}

	@Override
	public void addPet() {

		Pet p = new Revision();
		animal.add(p);

		try {

			if (p instanceof Revision) {

				Revision r = (Revision) p;

				System.out.println("Insert the name of the animal:");
				r.setName(keyboard.nextLine());

				System.out.println("Insert the species of the animal:");
				r.setSpecies(keyboard.nextLine());

				System.out.println("Insert the race of the animal:");
				r.setRace(keyboard.nextLine());

				System.out.println("Insert the age of the animal:");
				r.setAge(Integer.parseInt(keyboard.nextLine()));

				do {
					System.out.println("Insert the date (Format DD/MM/YYYY) the animal arrived:");
					r.setDate(keyboard.nextLine());

					try {

						date = LocalDate.parse(r.getDate(), dateFormatter);

						today = LocalDate.now();

						if(date.isAfter(today)) {

							System.out.println("The date must be today or older.");
							check = false;

						} else {

							check = true;
						}
					}

					catch (DateTimeParseException e) {
						System.out.println("Invalid date format. DD/MM/YYYY");
					}

				} while (check == false);
				

//				do {
					System.out.println("Insert ID of the animal:");
					r.setId(Integer.parseInt(keyboard.nextLine()));

//					check = true;
//					
//					for (Pet pet: animal) {
//						
//							rev = (Revision) p;
//
//							if (r.getId() == ((Revision) p).getId()) {
//								check = false;
//							}				
//					}			
//				} while (check == false);

				
				System.out.println("Insert the reason for the visit to the clinic:");
				r.setReason(keyboard.nextLine());

				System.out.println("Insert the diagnosis:");
				r.setDiagnosis(keyboard.nextLine());

				System.out.println("Insert the treatment:");
				r.setTreatment(keyboard.nextLine());
			}

		} catch (NumberFormatException e) {

			System.out.println("Invalid entry. Must type a number.");
		}
	}
	
	@Override
	public Pet getHistory(String name) throws Exception {

		for (Pet p: animal) {
			if (p instanceof Revision) {

				rev = (Revision) p;

				if (name == rev.getName()) {
					return rev;
				}	
			}		
		}
		throw new Exception("The name was not found.");
	}
}