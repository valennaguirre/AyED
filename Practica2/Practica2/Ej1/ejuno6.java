package Ej1;

import tp02.ejercicio1.*;
import java.util.Scanner;

public class ejuno6 {	
	
	private ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada(); // variable de instancia

	public ListaDeEnterosEnlazada calcularSucesion(int n) {
		if (n != 1) {
			if (n%2 == 0) {
				n = n/2;
			}
			else {
				n = 3*n+1;
			}
			lista.agregarFinal(n);
			calcularSucesion(n);
		}
		return lista;
	}
	
	public void ImprimirLista (ListaDeEnterosEnlazada l) {
		while(!l.fin()) {
			System.out.println(l.proximo());
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero para iniciar la sucesión de valores.");
		int n = sc.nextInt();
		ejuno6 e = new ejuno6();
		ListaDeEnterosEnlazada l = e.calcularSucesion(n);
		System.out.println("Sucesion de " + n + ":");
		l.comenzar();
		e.ImprimirLista(l);
	}

}
