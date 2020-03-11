package com.ipartek.formacion.clases.pruebas;
import com.ipartek.formacion.clases.*;


public class PaisPruebas {
	
	//Crear dos objetos pais
	//España con 120
	//Francia con 300
	//Mostrar por consola los datos
	
	public static void main(String[] args) {
		
		Pais[] paises = new Pais[2];
		
		Pais pais1 = new Pais();
		pais1.setNombre("España");
		pais1.setNumeroDeInfectados(120);
		paises[0] = pais1;
		
		Pais pais2 = new Pais();
		pais2.setNombre("Francia");
		pais2.setNumeroDeInfectados(300);
		paises[1] = pais2;
		
		for (int i=0;i<paises.length;i++) {
			Pais paisActual = paises[i];
			System.out.println(paisActual.getNombre() + " tiene " + paisActual.getNumeroDeInfectados());
		}		
	}
}