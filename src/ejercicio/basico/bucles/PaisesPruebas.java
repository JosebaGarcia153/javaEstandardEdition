package ejercicio.basico.bucles;

import java.util.Scanner;

public class PaisesPruebas {
	
	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		
		Pais[] paises = new Pais[4];
		
		Pais pais1 = new Pais();
		Pais pais2 = new Pais();
		Pais pais3 = new Pais();
		Pais pais4 = new Pais();
		
		pais1.setNombre("Noruega");
		pais2.setNombre("Alemania");
		pais3.setNombre("Republica Checa");
		pais4.setNombre("Italia");
		
		paises[0] = pais1;
		paises[1] = pais2;
		paises[2] = pais3;
		paises[3] = pais4;
		
		String respuesta1 = "";
		int total = 0;
		
		for (int i=0;i<paises.length;i++) {
			
			System.out.println("¿Hay infecciones en " + paises[i].getNombre() + "? y/n");
			respuesta1 = keyboard.nextLine();
			
			if ("y".equalsIgnoreCase(respuesta1)) {
				paises[i].setEstado(true);
				
				System.out.println("¿Cual es el numero de infectados?");
				paises[i].setInfectados(Integer.parseInt(keyboard.nextLine()));
				
				total += paises[i].getInfectados();				
			}
		}
		
		keyboard.close();
		
		System.out.println("Los paises sin infecciones son:");
		for (int i=0;i<paises.length;i++) {
			if (paises[i].isEstado() == false) {
				System.out.println(paises[i].getNombre());
			}
		}
		
		System.out.println("Los paises infectados son:");
		for (int i=0;i<paises.length;i++) {
			if (paises[i].isEstado() == true && paises[i].getInfectados() >= 5 && paises[i].getInfectados() < 10) {
				
				System.out.println("*" + paises[i].getNombre() + " con " + paises[i].getInfectados() + " infectados.");
				
			} else if (paises[i].isEstado() == true && paises[i].getInfectados() >= 10) {
				
				System.out.println("**" + paises[i].getNombre() + " con " + paises[i].getInfectados() + " infectados.");
			
			}else  if (paises[i].isEstado() == true) {
				
				System.out.println(paises[i].getNombre() + " con " + paises[i].getInfectados() + " infectados.");
				
			}
		}
		
		System.out.println("Los paises con mas de 2 infectados son:");
		for (int i=0;i<paises.length;i++) {
			if (paises[i].isEstado() == true && paises[i].getInfectados() > 2) {
				System.out.println(paises[i].getNombre() + " con " + paises[i].getInfectados() + " infectados.");
			}
		}
		System.out.println("El total de infectados es: " + total);	
	}
}