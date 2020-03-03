package ejercicio.basico.bucles;

public class Pais {
	
	private String nombre;
	private boolean estado;
	private int  infectados;

	public Pais(String nombre, boolean estado, int infectados) {
		this.nombre = "";
		this.estado = false;
		this.infectados = 0;
	}

	public String getNombre() {
		return nombre;
		
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isEstado() {
		return estado;
	}
	
	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public int getInfectados() {
		return infectados;
	}
	
	public void setInfectados(int infectados) {
		this.infectados = infectados;
	}
}