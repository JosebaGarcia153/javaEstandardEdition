package ejercicio.programa.perrera;

import java.util.ArrayList;

public interface PerroDAO {

	ArrayList<Perro> getAll() throws Exception;

	ArrayList<Perro> buscarPorNombre(String nombre) throws Exception;

	ArrayList<Perro> buscarPorRaza(String raza) throws Exception ;

	Perro getById(int id) throws Exception;

	boolean delete(int id) throws Exception;

	/**
	 * Creamos un nuevo Perro y genera el nuevo IDentificador
	 * 
	 * @param p
	 * @return
	 * @throws Exception 
	 */
	Perro crear(Perro p) throws Exception;

	boolean update(Perro p) throws Exception;

}
