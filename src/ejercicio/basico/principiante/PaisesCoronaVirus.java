package ejercicio.basico.principiante;

public class PaisesCoronaVirus {
	
	/*
	 * - Recorrer PAISES
	 * - Preguntar si existe algun caso
	 * - En caso afirmativo preguntar el numero de infectados
	 * - Mostrar paises libres del virus
	 * - Mostrar paises infectados junto con el numero de casos
	 * - Total de personas infectadas
	 */
	
	public static void main(String[] args) {
		
		final String[] PAISES = {"Noruega", "Alemania", "Republica Checa", "Italia"};
		
		boolean[] paisesInfectados = {false, false, false, false};
		
		int[] numeroInfectados = { 0, 0, 0, 0};
		
		for (int i=0;i<PAISES.length;i++) {
			System.out.println("¿Hay infecciones en " + PAISES[i] + "?");
		}
	}

}
