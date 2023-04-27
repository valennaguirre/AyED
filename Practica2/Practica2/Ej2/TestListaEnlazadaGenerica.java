/*2.3. Escriba una clase llamada TestListaEnlazadaGenerica que cree 4 objetos de tipo Estudiante 
(implementado en el TP01B) y los agregue a un objeto de tipo ListaEnlazadaGenerica usando los 
diferentes métodos de la lista y luego, imprima los elementos de dicha lista usando el método 
tusDatos().*/

package Ej2;

import java.util.Iterator;
import java.util.Scanner;

import tp02.ejercicio2.*;

public class TestListaEnlazadaGenerica {
	
	public static void AsignarEstudiantes(Estudiante[] estudiantes) {
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<4; i++) {
			Estudiante e = new Estudiante();
			e.setApellido(sc.nextLine());
			e.setNombre(sc.nextLine());
			e.setEmail("12345@gmail.com");
			e.setDireccion("Calle falsa 123");
			e.setComision(912);
			estudiantes[i] = e;
		}
		sc.close();
	}

	public static void main(String[] args) {
		Estudiante[] estudiantes = new Estudiante[4];
		AsignarEstudiantes(estudiantes);
		ListaEnlazadaGenerica<Estudiante> l = new ListaEnlazadaGenerica<Estudiante>();
		for (int i = 0; i<estudiantes.length; i++) {
			l.agregarFinal(estudiantes[i]);			
		}
		for (int i = 1; i<=l.tamanio(); i++) {
			System.out.println(l.elemento(i).tusDatos());
		}

	}

}
