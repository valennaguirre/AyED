/*d) ¿Cómo agregaría un método nuevo? Implemente un nuevo método de la lista que se llame 
agregar(T[]):boolean. El mismo debe agregar todos los elementos del arreglo que recibe como 
parámetro y retornar true si todos ellos fueron agregados. */

package Ej2;
import tp02.ejercicio2.*;

public class Ej2_4d {

	public static void main(String[] args) {
		Integer[] numeros = {1,2,3,4};
		ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		System.out.println(lista.agregar(numeros));
		lista.comenzar();
		while (!lista.fin()) {
			System.out.println(lista.proximo());
		}
		System.out.println(lista);
	}

}
