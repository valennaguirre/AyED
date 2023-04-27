package Ej3;
import tp02.ejercicio2.*;

public class PilaGenerica<T>{
	private ListaGenerica<T> lista = new ListaEnlazadaGenerica<T>();
	
	
	public void apilar(T lista) {
		this.lista.agregarInicio(lista);
	}
	
	public T desapilar() {
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
