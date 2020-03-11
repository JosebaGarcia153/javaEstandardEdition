package com.ipartek.formacion.metodos;

public class Vueltas {

	public static final float[] BILLETES_MONEDAS = { 500f, 200f, 100f, 50f, 20f, 10f, 5f, 2f, 1f, 0.50f, 0.20f, 0.10f,
			0.05f, 0.02f, 0.01f };

	public static int[] calcularVueltasOptimas(float importe, float entregado) throws Exception {

		int[] vueltas = new int[BILLETES_MONEDAS.length];
		
		float diferencia;
		
		if (importe == entregado) { //Dinero entregado es el mismo que el importe
			
			vueltas = vueltas;
			
		} else if (importe < entregado) { //Dinero entregado mayor que el importe
			
			//Calcula el dinero a devolver
			diferencia = entregado - importe;
			
			for (int i = 0; i < vueltas.length; i++) {
				
				//Examina el precio necesario del billete o moneda a devolver
				if ((BILLETES_MONEDAS[i] <= diferencia)) {
					
					//Reduce la cantidad a devolver a su vez que el dinero devuelto aumenta
					diferencia = diferencia - BILLETES_MONEDAS[i];
					vueltas[i] = vueltas[i] + 1;
					
					/* Vuelve a mirar si se necesitan devolver billetes de este tipo
					 * antes de pasar al siguiente
					*/
					i = (i-1);
				}
			}
			//
		} else { //Dinero entregado menor que el importe
			
			throw new Exception("No hay suficiente dinero.");
		}

		return vueltas;
	}

	
	public static float calcularVueltas(float importe, float entregado) throws Exception {

		float change = 0f;
		
		if (importe > entregado) {
			throw new Exception("Not enough money.");
		}
		return change = entregado - importe;
	}
}