package com.ipartek.formacion.metodos;

public class Vueltas {

	public static final float[] BILLETES_MONEDAS = { 500f, 200f, 100f, 50f, 20f, 10f, 5f, 2f, 1f, 0.50f, 0.20f, 0.10f,
			0.05f, 0.02f, 0.01f };

	public static int[] calcularVueltasOptimas(float importe, float entregado) throws Exception {

		int[] vueltas = new int[BILLETES_MONEDAS.length];

		float diferencia;

		if (importe < entregado) { //Dinero entregado mayor que el importe

			//Calcula el dinero a devolver
			diferencia = (float) (Math.round((entregado - importe) * 100.0) / 100.0);

			for (int i = 0; i < vueltas.length; i++) {

				vueltas[i] = (int)(diferencia/BILLETES_MONEDAS[i]);
				diferencia = diferencia%BILLETES_MONEDAS[i];
			}

		} else if (importe > entregado) { //Dinero entregado menor que el importe

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