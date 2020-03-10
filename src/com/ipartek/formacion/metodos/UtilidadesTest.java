package com.ipartek.formacion.metodos;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtilidadesTest {

//	@Test
//	public void testSaludarString() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testSaludarStringString() throws Exception {
		assertEquals("Hola Manolo", Utilidades.saludar("Manolo", Utilidades.IDIOMA_CASTELLANO));
		assertEquals("Kaixo Manolo", Utilidades.saludar("Manolo", Utilidades.IDIOMA_EUSKERA));
		assertEquals("Hello Manolo", Utilidades.saludar("Manolo", Utilidades.IDIOMA_INGLES));
		
		try {
			Utilidades.saludar("Manolo", "suagiuli");
			fail("Deberia lanzar excepcion");
		} catch (Exception e) {
			//funciona la excepcion
			assertEquals("Idioma no permitido suagiuli", e.getMessage());
		}
	}

	@Test
	public void testSuma() {
		assertEquals(6,  Utilidades.suma(3,  3));
		
		//asserciones que podemos usar
		assertTrue(true);
		assertFalse(2 > 300);
		assertNull(null);
		//assertNotNull(something);
	}

//	@Test
//	public void testCalcularLetraDniInt() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testCalcularLetraDniString() throws Exception {
		assertEquals('H', Utilidades.calcularLetraDni("11111111"));
		assertEquals('H', Utilidades.calcularLetraDni(11111111));
		
		try {
			assertEquals('H', Utilidades.calcularLetraDni("123"));
			fail("Deberia lanzar excepcion");
		} catch (Exception e) {
			System.out.println("123 no es un numero valido");
		}
		
		try {
			assertEquals('H', Utilidades.calcularLetraDni(null));
			fail("Deberia lanzar excepcion");
		} catch (Exception e) {
			System.out.println("Es null");
		} 
		
		try {
			assertEquals('H', Utilidades.calcularLetraDni("1234567a"));
			fail("Deberia lanzar excepcion");
		} catch (Exception e) {
			System.out.println("Tiene que ser un numero");
		}
	}
		
		@Test(expected = Exception.class)
		public void testCalcularLetraDniStringException1() throws Exception {
			Utilidades.calcularLetraDni("1234567a");
		}
		
		@Test
		public void bubbleShort() {

			int[] aDesordenado = { 0, 3, 1, 8, 4, 5, 2 };

			int[] aOrdenado = Utilidades.bubbleShort(aDesordenado);

			assertEquals(0, aOrdenado[0]);
			assertEquals(1, aOrdenado[1]);
			assertEquals(2, aOrdenado[2]);
			assertEquals(3, aOrdenado[3]);
			assertEquals(4, aOrdenado[4]);
			assertEquals(5, aOrdenado[5]);
			assertEquals(8, aOrdenado[6]);

		}

}
