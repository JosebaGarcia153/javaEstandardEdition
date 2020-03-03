package ejercicio.basico.bucles;

import java.util.ArrayList;
import java.util.Scanner;

public class PaisesPruebasArrayList {
	
	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		
		ArrayList<Pais> list = new ArrayList<Pais>();		
		list.add(new Pais ("Noruega", false, 0));
		list.add(new Pais ("Alemania", false, 0));
		list.add(new Pais ("Republica Checa", false, 0));
		list.add(new Pais ("Italia", false, 0));
		
		String respuesta1 = "";
		int total = 0;
		
		for (Pais i:list) {
			
			System.out.println("¿Hay infecciones en " + i.getNombre() + "? y/n");
			respuesta1 = keyboard.nextLine();
//			
//			if ("y".equalsIgnoreCase(respuesta1)) {
//				paises.setEstado(true);
//				
//				System.out.println("¿Cual es el numero de infectados?");
//				paises[i].setInfectados(Integer.parseInt(keyboard.nextLine()));
//				
//				total += paises[i].getInfectados();				
//			}
		}
		
		keyboard.close();
		
//		System.out.println("Los paises sin infecciones son:");
//		for (int i=0;i<paises.length;i++) {
//			if (paises[i].isEstado() == false) {
//				System.out.println(paises[i].getNombre());
//			}
//		}
//		
//		System.out.println("Los paises infectados son:");
//		for (int i=0;i<paises.length;i++) {
//			if (paises[i].isEstado() == true && paises[i].getInfectados() >= 5 && paises[i].getInfectados() < 10) {
//				
//				System.out.println("*" + paises[i].getNombre() + " con " + paises[i].getInfectados() + " infectados.");
//				
//			} else if (paises[i].isEstado() == true && paises[i].getInfectados() >= 10) {
//				
//				System.out.println("**" + paises[i].getNombre() + " con " + paises[i].getInfectados() + " infectados.");
//			
//			}else  if (paises[i].isEstado() == true) {
//				
//				System.out.println(paises[i].getNombre() + " con " + paises[i].getInfectados() + " infectados.");
//				
//			}
//		}
//		
//		System.out.println("Los paises con mas de 2 infectados son:");
//		for (int i=0;i<paises.length;i++) {
//			if (paises[i].isEstado() == true && paises[i].getInfectados() > 2) {
//				System.out.println(paises[i].getNombre() + " con " + paises[i].getInfectados() + " infectados.");
//			}
//		}
//		System.out.println("El total de infectados es: " + total);	
	}
}