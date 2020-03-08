package ejercicio.programa.perrera;

import java.util.ArrayList;
import java.util.Scanner;

public class PerroDAOImpl implements PerroDAO {

	Scanner keyboard = new Scanner(System.in);
	
	private ArrayList<Perro> perros;

	public PerroDAOImpl() {
		this.perros = new ArrayList<Perro>();

		this.perros.add(new Perro("Bubba"));
		this.perros.add(new Perro("Ratplam"));	
	}

	@Override
	public ArrayList<Perro> getAll() throws Exception {
		
		ArrayList<Perro> allDogs = new ArrayList<Perro>();
		
		for (int i = 0; i < perros.size(); i++) {
			
			if (perros.get(i).getRaza() == null) {
				
				perros.get(i).setRaza("cruce");
			}         
		}
		
		for (int i = 0; i < perros.size(); i++) {
			
			allDogs.add(new Perro(perros.get(i).getId(), perros.get(i).getNombre(), perros.get(i).getRaza()));
		}
		
		if (allDogs.size() == 0) {
			
			throw new Exception("No dog was found.");
			
		} else {
			
		return allDogs;
		}
	}

	@Override
	public ArrayList<Perro> buscarPorNombre(String nombre) throws Exception {
		
		ArrayList<Perro> perroByName = new ArrayList<Perro>();
		
		for (int i = 0; i < perros.size(); i++) {
			
			if (perros.get(i).getRaza() == null) {
				
				perros.get(i).setRaza("cruce");
			}         
		}
		
		for (int i = 0; i < perros.size(); i++) {
			
			if (perros.get(i).getNombre().toLowerCase().contains(nombre)) {
				
				perroByName.add(new Perro(perros.get(i).getId(), perros.get(i).getNombre(), perros.get(i).getRaza()));
			}
		}
		
		if (perroByName.size() == 0) {
			
			throw new Exception("No dog was found.");
			
		} else {
			
		return perroByName;
		}
	}

	@Override
	public ArrayList<Perro> buscarPorRaza(String raza) throws Exception {
		
		ArrayList<Perro> perroByRace = new ArrayList<Perro>();	
		
		for (int i = 0; i < perros.size(); i++) {
			
			if (perros.get(i).getRaza() == null) {
				
				perros.get(i).setRaza("cruce");
			}         
		}
			
		for (int i = 0; i < perros.size(); i++) {
			
			if (perros.get(i).getRaza().toLowerCase().contains(raza)) {
				
				perroByRace.add(new Perro(perros.get(i).getId(), perros.get(i).getNombre(), perros.get(i).getRaza()));	
			}         
		}
		
		if (perroByRace.size() == 0) {
			
			throw new Exception("No dog was found.");
			
		} else {
			
		return perroByRace;
		}	
	}

	@Override
	public Perro getById(int id) throws Exception {
		
		int dogId;
			
		for (int i = 0; i < perros.size(); i++) {
			
			if (perros.get(i).getId() == id) {
				
				dogId = i;
				
				return perros.get(dogId);
			}
		}
		
		throw new Exception("No dog was found.");
	}

	@Override
	public boolean delete(int id) throws Exception {

		int entryNum = id;
		String confirmation;
		boolean confirm = false;
		
		if (entryNum < 0 || entryNum > perros.size()-1) {
			
			throw new Exception("This entry does not exist.");
			
		} else {
		
			System.out.println(perros.get(id).toString());
		}
		
		do {
			System.out.println("Are you sure you want to dele this entry? Y/N");
			confirmation = keyboard.nextLine();
			
			if ("y".equalsIgnoreCase(confirmation)) {
				
				perros.remove(entryNum);
				confirm = true;
				
			} else if ("n".equalsIgnoreCase(confirmation)) {
				
				confirm = false;
				
			} else {
				
				System.out.println("Invalid input.");	
			}
			
		} while (!confirmation.equalsIgnoreCase("y") && !confirmation.equalsIgnoreCase("n"));
		
		return confirm;
	}

	@Override
	public Perro crear(Perro p) throws Exception {
		
		p = new Perro();
		int newId = 0;
		String confirmation;
		
		System.out.println("Write the ID of the dog:");
		
		try {
			
			newId = Integer.parseInt(keyboard.nextLine());
			
		} catch (Exception e) {
			
			System.out.println("Invalid input.");	
		}
		
		p.setId(newId);
		
		for (int i = 0; i < perros.size(); i++) {
			
			if (perros.get(i).getId() == newId) {

				throw new Exception("This ID is already registered.");
			} 	
		}
		
		System.out.println("Write the name of the dog:");
		String newName = keyboard.nextLine();
		p.setNombre(newName);

		System.out.println("Write the race of the dog:");
		String newRace = keyboard.nextLine();
		p.setRaza(newRace);
		
		do {
			System.out.println("Are you sure you want to keep these changes? Y/N");
			confirmation = keyboard.nextLine();
			
			if ("y".equalsIgnoreCase(confirmation)) {
				
				perros.add(new Perro(p.getId(), p.getNombre(), p.getRaza()));
				
			} else if ("n".equalsIgnoreCase(confirmation)) {
				
				throw new Exception("The entry has been cancelled.");
				
			} else {
				
				System.out.println("Invalid input.");	
			}
			
		} while (!confirmation.equalsIgnoreCase("y") && !confirmation.equalsIgnoreCase("n"));

		return perros.get(perros.size()-1);
	}

	@Override
	public boolean update(Perro p) throws Exception {
		
		p = new Perro();
		
		int entryNum = 0;
		
		int upId = 0;
		String upName;
		String upRace;
		
		String confirmation;
		boolean confirm = false;
		

		System.out.println("List of dog entries:");
		for (int i = 0; i < perros.size(); i++) {
			System.out.println((i+1) + ") " + perros.get(i).toString());
		}
		
		
		System.out.println("Select the entry number to edit:");
		
		try {
			
			entryNum = (Integer.parseInt(keyboard.nextLine()) - 1);
			
		} catch (Exception e) {
			
			System.out.println("Invalid input.");	
			update(p);
		}
		
		
		if (entryNum < 0 || entryNum > perros.size()-1) {
			
			throw new Exception("This entry does not exist.");
		}
		
		
		System.out.println("Write the new ID of the dog:");
		
		try {
			
			upId = Integer.parseInt(keyboard.nextLine());
			
		} catch (Exception e) {
			
			System.out.println("Invalid input.");
		}
		
		
		for (int i = 0; i < perros.size(); i++) {
			
			if (upId == perros.get(i).getId() && upId != entryNum) {
				
				throw new Exception("This ID already exist.");
			}
		}
		
		p.setId(upId);
		
		System.out.println("Write the new name of the dog:");
		upName = keyboard.nextLine();		
		p.setNombre(upName);
		
		System.out.println("Write the new race of the dog:");
		upRace = keyboard.nextLine();
		p.setRaza(upRace);
		

		do {
			System.out.println("Are you sure you want to keep these changes? Y/N");
			confirmation = keyboard.nextLine();
			
			if ("y".equalsIgnoreCase(confirmation)) {
				
				perros.set((entryNum), p);
				confirm = true;
				
			} else if ("n".equalsIgnoreCase(confirmation)) {
				
				confirm = false;
				
			} else {
				
				System.out.println("Invalid input.");	
			}
			
		} while (!confirmation.equalsIgnoreCase("y") && !confirmation.equalsIgnoreCase("n"));
		
		return confirm;
	}
}