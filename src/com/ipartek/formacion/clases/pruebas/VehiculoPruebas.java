package com.ipartek.formacion.clases.pruebas;
import com.ipartek.formacion.clases.*;

public class VehiculoPruebas {
	public static void main(String[] args) {
		
		Vehiculo v1 = new Vehiculo();
		Vehiculo v2 = new Vehiculo("1234 QWE", "negro");
		Vehiculo v3 = new Vehiculo("4321 QAZ", "blanco", 5);
		
		System.out.println(v1.toString());
		System.out.println(v2.toString());
		System.out.println(v3.toString());
		
		v1.setColor("rojo");
		v1.setMatricula("1111 ASD");
		
		System.out.println("Despues de pintar y matricular V1");
		System.out.println(v1.toString());
		System.out.println("matricula " + v1.getMatricula());
		System.out.println("color " + v1.getColor());
		System.out.println("Numero de puertas " + v1.getNumPuertas());
		System.out.println("Numero de ruedas " + v1.getNumRuedas());
		System.out.println("Potencia " + v1.getPotencia());
		
		Coche renault = new Coche();
		renault.setColor("Azul");
		System.out.println(renault.toString());
	}
}