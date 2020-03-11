package com.ipartek.formacion.clases;

public class Coche extends Vehiculo{
	
	private boolean radioInstalada;
	
	public Coche() {
		super();
		setNumPuertas(5);
		setNumRuedas(4);
		this.radioInstalada = false;
	}


	public boolean isRadio() {
		return radioInstalada;
	}

	public void setRadio(boolean radio) {
		this.radioInstalada = radio;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + ", radioInstalada=" + radioInstalada + "]";
	}
}