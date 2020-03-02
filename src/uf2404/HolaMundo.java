package uf2404;

public class HolaMundo {
	public static void main(String[] args) {

		String nombre = "Ander";
		int edad = 39;
		float altura = 1.70f; // Alt. way of using float is "(float)170"
		boolean isGoodDay = true;

		System.out.println("Mi nombre es " + nombre);
		System.out.println("Mi edad es " + edad);
		System.out.println("Mi altura es " + altura);

		if (isGoodDay == true) {
			System.out.println("Hoy es un dia bueno");
		} else {
			System.out.println("Hoy es un dia malo");
		}
	}
}
