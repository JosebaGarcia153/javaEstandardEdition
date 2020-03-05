package ejercicio.basico.principiante;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @see http://puntocomnoesunlenguaje.blogspot.com/2016/02/ejemplo-de-arraylist-en-java.html
 * @author Joseba
 *
 */
public class EjerciciosArrayList {
	
	Scanner keyboard = new Scanner(System.in);
	
	ArrayList<Double> alturas = new ArrayList<Double>();
	ArrayList<Integer> valores = new ArrayList<Integer>();
	ArrayList<Integer> rotacion = new ArrayList<Integer>();
	
	public void ejercicio1() {

		int numAlumnos = numeroAlumnos();
		leerAlturas(alturas, numAlumnos);
		double mediaAlumnos = calcularMedias(alturas);
		mostrarResultados(alturas, mediaAlumnos);
	}

	public int numeroAlumnos() { //Determina el cual sera el tamaño del arraylist
		
		int alumnos;
		
		System.out.println("¿Cuantos alumnos hay en la clase?");
		alumnos = Integer.parseInt(keyboard.nextLine());
		
		return alumnos;
	}
	
	public void leerAlturas(ArrayList<Double> alturas, int numAlumnos) { //Inserta un parametro en el arraylist por cada alumno determinado anteriormente
		
		while (alturas.size() < numAlumnos) {
			System.out.println("Inserta la altura del "+ (alturas.size()+1) + "º alumno:");
			alturas.add(Double.parseDouble(keyboard.nextLine()));
		}
	}
	
	public double calcularMedias(ArrayList<Double> alturas) { //Lee el arraylist para hacer una operacion y devuelve el resultado
		
		double media = 0;
		
		for (int i=0;i<alturas.size();i++) {
			media += alturas.get(i);
		}
		
		return media/alturas.size();
	}
	
	public void mostrarResultados(ArrayList<Double> alturas, double mediaAlumnos) { //Muesta los datos del arraylist y almacena 2 nuevos datos que mostrar por pantalla
		
		int bajos = 0;
		int altos = 0;
		
		System.out.println("Alturas de los Alumnos:");
		for (int i=0;i<alturas.size();i++) {
			System.out.println(alturas.get(i));
			
			if (alturas.get(i) < mediaAlumnos) {
				bajos++;
			} else {
				altos++;
			}
		}
		System.out.println("La media de los alumnos es: " + mediaAlumnos);
		System.out.println(bajos + " alumnos son mas bajos que la media.");
		System.out.println(altos + " alumnos son mas altos que la media.");		
	}
	
	public void ejercicio2() {
		
		leerValores();
		int suma = calcularSuma(valores);
		double media = calcularSuma(valores) / valores.size();
		mostrarResultados(valores, suma, media);
	}
	
	public ArrayList<Integer> leerValores() {
		
		int value;
		
		System.out.println("Inserta numeros enteros, escribe -99 para parar:");

		do {
			value = Integer.parseInt(keyboard.nextLine());	
			valores.add(value);
			
		} while (value != -99);
		
		return valores;	
	}
	
	public int calcularSuma(ArrayList<Integer> valores) {
		
		int suma = 0 ;
		
		for (int i=0;i<valores.size();i++) {
			suma += valores.get(i);
		}
		
		return suma;
	}
	
	public void mostrarResultados(ArrayList<Integer> valores, int suma, double media) {
		
		System.out.println("Los numeros insertados han sido:");
		
		for (int i=0;i<valores.size();i++) {
			System.out.println(valores.get(i));
		}
		
		System.out.println("Su suma es " + suma + " y su media es " + media);
		
		System.out.println("La cantidad de valores superiores a la media han sido:");
		
		int counter = 0;
		
		for (int i=0;i<valores.size();i++) {
			if (valores.get(i) > media) {
				counter++;
			}
		}
		
		System.out.println(counter);
	}

	public void ejercicio3() {
		
		/*
		 * En este caso el contenedor será un ArrayList.
		 * El método recibirá un ArrayList de tipo Integer con una serie de valores numéricos y devolverá
		   el mismo ArrayList con sus elementos desplazados una posición a la derecha.
		 * Los desplazamientos se realizarán sobre el mismo array.
		 * No se puede utilizar un array auxiliar para reailzar el proceso.
		 */
		
		rotacion.add(5);
		rotacion.add(7);
		rotacion.add(8);
		rotacion.add(12);
		
		rotate(rotacion);
		
	}
	
	public void rotate(ArrayList<Integer> rotacion) {

		int valorGuardado;
		
		for (int i = 0; i < (rotacion.size()-1); i++) {
			valorGuardado = rotacion.get(i);
			rotacion.remove(i);
			rotacion.add(valorGuardado);
		}
		/////////////////////////////////////////
		for (int i = 0; i < (rotacion.size()-1); i++) {
			System.out.println(rotacion.get(i));
		}
		
	}
	
//	fghdgshjrry
//	public void ejercicio4() {
//		
//	}
//	
//	public void ejercicio5() {
//		
//	}
	
	public static void main(String[] args) {
		
		EjerciciosArrayList ejercicios = new EjerciciosArrayList();
//		ejercicios.ejercicio1();
//		ejercicios.ejercicio2();
		ejercicios.ejercicio3();
//		ejercicios.ejercicio4();
//		ejercicios.ejercicio5();
	}
}