package com.ipartek.formacion.metodos;

public class EjemploDeUso {

	public static void main(String[] args) {

		String manolo = "Manolo";

		Utilidades.saludar(manolo);

		Utilidades.saludar(manolo, Utilidades.IDIOMA_CASTELLANO);
		Utilidades.saludar(manolo, Utilidades.IDIOMA_EUSKERA);
		Utilidades.saludar(manolo, Utilidades.IDIOMA_INGLES);

		System.out.println(" 3 + 3 = " + Utilidades.suma(3, 3));
		
	
		System.out.println("La letra del dni 11111111 es " + Utilidades.calcularLetraDni("11111111"));
		System.out.println("La letra del dni 11111111 es " + Utilidades.calcularLetraDni(11111111));
		
	try {
			if (Utilidades.calcularLetraDni("111111112") == ' ') {
				
				throw new Exception("No es un DNI valido.");
				
			} else {
				
				System.out.println("La letra del dni 111111112 es " + Utilidades.calcularLetraDni("111111112"));
				System.out.println("La letra del dni 111111112 es " + Utilidades.calcularLetraDni(111111112));
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}
}