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
		
		for (int i = 0; i < perros.size(); i++) {
			if (perros.get(i).getNombre().toLowerCase().contains(nombre)) {
				
				perroByName.add(new Perro(perros.get(i).getId(), perros.get(i).getNombre(), perros.get(i).getRaza()));
			}
		}
		return perroByName;
	}

	@Override
	public ArrayList<Perro> buscarPorRaza(String raza) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Perro getById(int id) {
		// TODO Auto-generated method stub
		return null;
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
