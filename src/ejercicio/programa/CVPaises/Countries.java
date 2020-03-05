package ejercicio.programa.CVPaises;

public class Countries {
	
	private String name;
	private boolean status;
	private int infections;
	
	
	
	public Countries() {
		this.name = "";
		this.status = false;
		this.infections = 0;	
		
	}

	public Countries(String name, boolean status, int infections) {
		this.name = name;
		this.status = status;
		this.infections = infections;	
	}

	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public int getInfections() {
		return infections;
	}
	
	public void setInfections(int infections) {
		this.infections = infections;
	}
	
	public String toString() {
		return "Country: " + name + " | Infection status: " + status + " | Infected number: " + infections;
	}	
}