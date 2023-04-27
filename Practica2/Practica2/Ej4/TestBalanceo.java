package Ej4;
import java.util.Iterator;
import java.util.Scanner;
import tp02.ejercicio2.*;
import Ej3.PilaGenerica;

public class TestBalanceo {
	
	//1. armo listas de apertura y de cierre
	//2. apilo y desapilo, segun elemento del string que fue insertado por teclado
	//3. armo el main 
	//4. evaluo si es true o false
	
	public static Boolean EsBalanceada(String str) {
		ListaEnlazadaGenerica<Character> apertura = new ListaEnlazadaGenerica<>();
		ListaEnlazadaGenerica<Character> cierre = new ListaEnlazadaGenerica<>();
		apertura.agregarInicio('(');
		apertura.agregarInicio('[');
		apertura.agregarInicio('{');
		cierre.agregarInicio(')');
		cierre.agregarInicio(']');
		cierre.agregarInicio('}');
		PilaGenerica<Character> pila = new PilaGenerica<>();
		Character c, ant;
		for (int i = 0; i<str.length(); i++) {
			c = str.charAt(i);
			if (apertura.incluye(c)) {
				pila.apilar(c);
			}
			else if (cierre.incluye(c) && !pila.esVacia()) {
				ant = pila.desapilar();
				if (!((c.equals(')') && ant.equals('(')) || (c.equals(']') && ant.equals('[')) || (c.equals('}') && ant.equals('{')) )) {
					return false;
				}
			}
			else return false;
			
		}
		if (!pila.esVacia()) {
			return false;
		}
		return true;		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cadena = sc.nextLine();
		sc.close();
		if (EsBalanceada(cadena)) {
			System.out.println("La cadena es balanceada");
		}
		else {
			System.out.println("La cadena no es balanceada.");
		}
		
	}
	


}
