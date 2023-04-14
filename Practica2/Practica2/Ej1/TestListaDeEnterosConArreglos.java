package Ej1;

import java.util.Iterator;

import tp02.ejercicio1.*;

//Ej. 1.2

public class TestListaDeEnterosConArreglos {

	public static void main(String[] args) {
		int[] secuencia = {1, 2, 3, 4, 5};
		ListaDeEnterosConArreglos lista = new ListaDeEnterosConArreglos();
		for (int i = 0; i<secuencia.length; i++) {
			lista.agregarFinal(secuencia[i]);			
		}
		lista.comenzar();
		for (int i = 0; i<lista.tamanio(); i++) {
			System.out.println(lista.proximo());
		}

	}

}
