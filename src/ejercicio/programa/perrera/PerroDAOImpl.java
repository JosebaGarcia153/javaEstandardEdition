package ejercicio.programa.perrera;

import java.util.ArrayList;

public class PerroDAOImpl implements PerroDAO {

	private ArrayList<Perro> perros;

	public PerroDAOImpl() {
		this.perros = new ArrayList<Perro>();

		this.perros.add(new Perro("Bubba"));
		this.perros.add(new Perro("Ratplam"));
	}

	@Override
	public ArrayList<Perro> getAll() {
		return perros;
	}

	@Override
	public ArrayList<Perro> buscarPorNombre(String nombre) {
		
		ArrayList<Perro> perroByName = new ArrayList<Perro>();
		
		try {
			
			for (int i = 0; i < perros.size(); i++) {
				if (perros.get(i).getNombre().toLowerCase().contains(nombre)) {
					
					perroByName.add(new Perro(perros.get(i).getId(), perros.get(i).getNombre(), perros.get(i).getRaza()));
				}
			}
		
		} catch (Exception e) {
			System.out.println("There are no dog names in the system yet.");
		}
		
		return perroByName;
	}

	@Override
	public ArrayList<Perro> buscarPorRaza(String raza) {
		
		ArrayList<Perro> perroByRace = new ArrayList<Perro>();
		
		try {
			
			for (int i = 0; i < perros.size(); i++) {
				
				if (perros.get(i).getRaza().toLowerCase().contains(raza)) {
					
					perroByRace.add(new Perro(perros.get(i).getId(), perros.get(i).getNombre(), perros.get(i).getRaza()));
					
				}         
			}
			
		} catch (Exception e) {
			
			System.out.println("There are no dog races in the system yet.");
			
		}
		
		return perroByRace;
	}

	@Override
	public Perro getById(int id) {
		
		Perro perroByID = new Perro();
		
		try {
			
			for (int i = 0; i < perros.size(); i++) {
				if (perros.get(i).getId() == id) {
					
					perroByID.setId(perros.get(i).getId());
					perroByID.setNombre(perros.get(i).getNombre());
					perroByID.setRaza(perros.get(i).getRaza());
					
				}
			}
		
		} catch (Exception e) {
			
			System.out.println("There are no dog IDs in the system yet.");
		
		}
		
		return perroByID; //TODO ???
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Perro crear(Perro p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Perro p) {
		// TODO Auto-generated method stub
		return false;
	}

}
