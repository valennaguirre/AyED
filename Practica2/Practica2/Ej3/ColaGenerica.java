package Ej3;
import tp02.ejercicio2.*;

public class ColaGenerica<T>{
	private ListaGenerica<T> lista = new ListaEnlazadaGenerica<T>();
	
	
	public void encolar(T lista) {
		this.lista.agregarFinal(lista);
	}
	
	public T desencolar() {
		T aux = this.lista.elemento(1);
		this.lista.eliminarEn(1);
		return aux;
	}
	
	public T tope() {
		return this.lista.elemento(1);
	}
	
	public boolean esVacia() {
		boolean x = false;
		if (this.lista.tamanio()==0) {
			x = true;
		}
		return x;
	}

}
