package Ej1;

import tp02.ejercicio1.*;

public class TestListaDeEnterosEnlazada {
	
	public static void ImprimirLista(ListaDeEnterosEnlazada lista) {
		var x = lista.elemento(lista.tamanio());
		System.out.println(x);
		lista.eliminarEn(lista.tamanio());
		if (!lista.esVacia()) {			
			ImprimirLista(lista);
		}
		
	}

	public static void main(String[] args) {
		int[] secuencia = {1,2,3,4,5};
		ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();
		for (int i = 0; i < secuencia.length; i++) {
			lista.agregarFinal(secuencia[i]);
		}
		lista.comenzar();
		/*for (int i = 0; i<lista.tamanio(); i++) {
			System.out.println(lista.proximo());
		}*/
		ImprimirLista(lista);

	}

}
