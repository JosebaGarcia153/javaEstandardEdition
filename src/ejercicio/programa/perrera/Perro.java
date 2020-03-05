package ejercicio.programa.perrera;

public class Perro {

	private int id;
	private String nombre;
	private String raza;

	// Constructores
	
	public Perro() {
		super();
		// un peroo inicialmente
		this.id = 0;
		this.nombre = "";
		this.raza = "cruce";
	}
	
	public Perro(String nombre) {
		this.nombre = nombre;
	}
	
	// GETERS SETTERS
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	// TOSTRING
	
	@Override
	public String toString() {
		return "Perro [id=" + id + ", nombre=" + nombre + ", raza=" + raza + "]\n";
	}

}