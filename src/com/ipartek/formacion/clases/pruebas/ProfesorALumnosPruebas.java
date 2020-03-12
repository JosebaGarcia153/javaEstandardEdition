package com.ipartek.formacion.clases.pruebas;

import com.ipartek.formacion.clases.Alumno;
import com.ipartek.formacion.clases.Persona2;
import com.ipartek.formacion.clases.Profesor;

public class ProfesorALumnosPruebas {

	public static void main(String[] args) {

		Profesor profesor = new Profesor();
		profesor.setNombre("Einstein");
		profesor.setMateria("Fisica cuantica");

		// crear un array de Alumnos
		Alumno[] alumnos = new Alumno[3];

		Alumno jaimito = new Alumno();
		jaimito.setNombre("Jaimito");
		jaimito.setGenero(Persona2.GENERO_MASCULINO);
		jaimito.setNota(Alumno.NOTA_MAX);

		Alumno jaimita = new Alumno();
		jaimita.setNombre("Jaimita");
		jaimita.setGenero(Persona2.GENERO_FEMENINO);
		jaimita.setNota(9);

		Alumno hodei = new Alumno();
		hodei.setNombre("hodei");
		hodei.setGenero(Persona2.GENERO_INDEFINIDO);
		hodei.setNota(7);

		alumnos[0] = jaimito;
		alumnos[1] = jaimita;
		alumnos[2] = hodei;

		System.out.println("El profesor " + profesor.getNombre() + " imparte la materia de: " + profesor.getMateria());
		System.out.println("Sus alumnos son:");
		for (Alumno alumno : alumnos) {
			System.out.println(alumno.getNombre() + " nota: " + alumno.getNota());
			// System.out.println(alumno.toString());
		}
		
		int notaAlta = Alumno.NOTA_MIN;
		String alumnoNotaAlta = "";
		int suma = 0;
		
		for (Alumno alumno : alumnos) {
			
			if (alumno.getNota() > notaAlta) {
				
				notaAlta = alumno.getNota();
				alumnoNotaAlta = alumno.getNombre();
			}
			
			suma += alumno.getNota();
		}
		
		System.out.println("El alumno con la nota mas alta es " + alumnoNotaAlta +
							" y la media de las notas es " + ((float)suma/alumnos.length));

	}

}
