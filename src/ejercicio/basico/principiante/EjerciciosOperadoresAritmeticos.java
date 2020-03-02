package ejercicio.basico.principiante;

public class EjerciciosOperadoresAritmeticos {

	public void ejercicio1() {
		/*
		 * Ejercicio 1: Si a, b y c son variables enteras con valores a=8, b=3, c=-5,
		 * determina el valor de las siguientes expresiones aritméticas:
		 * 
		 * a) a + b + c
		 * b) 2 * b + 3 * (a – c)
		 * c) a / b
		 * d) a % b
		 * e) a / c
		 * f) a % c
		 * g) a * b / c
		 * h) a * (b / c)
		 * i) (a * c) % b
		 * j) a * (c % b)
		 * k) (3 * a – 2 * b) % (2 * a – c)
		 * l) 2 * ( a / 5 + (4 - b * 3)) % (a + c - 2)
		 * m) (a - 3 * b) % (c + 2 * a) / (a - c)
		 * n) a - b - c * 2
		 */

		int a = 8;
		int b = 3;
		int c = -5;

		System.out.println("Ejercicio 1");

		System.out.println("a) " + (a + b + c));
		System.out.println("b) " + (2 * b + 3 * (a - c)));
		System.out.println("c) " + (a / b));
		System.out.println("d) " + (a % b));
		System.out.println("e) " + (a / c));
		System.out.println("f) " + (a % c));
		System.out.println("g) " + (a * b / c));
		System.out.println("h) " + (a * (b / c)));
		System.out.println("i) " + ((a * c) % b));
		System.out.println("j) " + (a * (c % b)));
		System.out.println("k) " + ((3 * a - 2 * b) % (2 * a - c)));
		System.out.println("l) " + (2 * (a / 5 + (4 - b * 3)) % (a + c - 2)));
		System.out.println("m) " + ((a - 3 * b) % (c + 2 * a) / (a - c)));
		System.out.println("n) " + (a - b - c * 2));
	}

	public void ejercicio2() {
		/*
		 * Ejercicio 2: Si x, y, z son variables de tipo double con valores:
		 *  x= 88, y = 3.5, z = -5.2
		 *  Determina el valor de las siguientes expresiones aritméticas.
		 * 
		 * Obtén el resultado de cada expresión con un máximo de cuatro decimales.
		 * a) x + y + z
		 * b) 2 * y + 3 * (x – z)
		 * c) x / y
		 * d) x % y
		 * e) x / (y + z)
		 * f) (x / y) + z
		 * g) 2 * x / 3 * y
		 * h) 2 * x / (3 * y) i) x * y % z
		 * j) x * (y % z)
		 * k) 3 * x – z – 2 * x
		 * l) 2 * x / 5 % y
		 * m) x - 100 % y % z
		 * n) x - y - z * 2
		 */
		double x = 88;
		double y = 3.5;
		double z = -5.2;

		System.out.println("Ejercicio 2");

		System.out.println("a) " + (x + y + z));
		System.out.println("b) " + (2 * y + 3 * (x - z)));
		System.out.println("c) " + (x / y));
		System.out.println("d) " + (x % y));
		System.out.println("e) " + (x / y));
		System.out.println("f) " + ((x / y) + z));
		System.out.println("g) " + (2 * x / 3 * y));
		System.out.println("h) " + (2 * x / (3 * y)));
		System.out.println("i) " + (x * y % z));
		System.out.println("j) " + (x * (y % z)));
		System.out.println("k) " + (3 * x - z - 2 * x));
		System.out.println("l) " + (2 * x / 5 % y));
		System.out.println("m) " + (x - 100 % y % z));
		System.out.println("n) " + (x - y - z * 2));

	}

	public void ejercicio3() {
		/*
		 * Ejercicio 3. Si c1, c2 y c3 son variables de tipo char con valores:
		 * c1=’E’, c2=’5’, c3=’?’
		 * Determina el valor numérico de las siguientes expresiones aritméticas.
		 * Para resolverlo necesitas saber el valor numérico correspondiente a esos caracteres según la tabla ASCII:
		 * ’E’ 69 ’5’ 53 ’?’ 63
		 * Consulta en la tabla ASCII los valores numéricos del resto de caracteres que aparecen en las operaciones.
		 * a) c1 + 1
		 * b) c1 – c2 + c3
		 * c) c2 – 2
		 * d) c2 – '2'
		 * e) c3 + '#'
		 * f) c1 % c3
		 * g) '2' + '2'
		 * h) (c1 / c2) * c3
		 * i) 3 * c2
		 * j) '3' * c2
		 */
		char c1 = 'E';
		char c2 = '5';
		char c3 = '?';

		System.out.println("Ejercicio 3");

		System.out.println("a) " + (c1 + 1));
		System.out.println("b) " + (c1 - c2 + c3));
		System.out.println("c) " + (c2 - 2));
		System.out.println("d) " + (c2 - '2'));
		System.out.println("e) " + (c3 + '#'));
		System.out.println("f) " + (c1 % c3));
		System.out.println("g) " + ('2' + '2'));
		System.out.println("h) " + ((c1 / c2) * c3));
		System.out.println("i) " + (3 * c2));
		System.out.println("j) " + ('3' * c2));
	}

	public static void main(String[] args) {
		EjerciciosOperadoresAritmeticos ejercicios = new EjerciciosOperadoresAritmeticos();
		ejercicios.ejercicio1();
		ejercicios.ejercicio2();
		ejercicios.ejercicio3();
	}
}