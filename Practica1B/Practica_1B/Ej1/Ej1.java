package Ej1;

public class Ej1 {
	
	public static void ImprimoConFor(int a, int b) {		
		for (int i = a; i<=b; i++) {
			System.out.println(i);
		}
	}
	
	public static void ImprimoConWhile(int a, int b) {		
		int i = a;
		while (i<=b) {
			System.out.println(i);
			i++;
		}
	}
	
	public static void ImprimoSinEstructuras(int a, int b) {
		System.out.println(a);
		a++;
		if (a<=b) {
			ImprimoSinEstructuras(a,b);
		}
	}
	
	
	public static void main(String[] args) {
		int a = 4;
		int b = 10;		
		System.out.println("Imprimo con for:");
		ImprimoConFor(a, b);
		System.out.println("Imprimo con while:");
		ImprimoConWhile(a, b);
		System.out.println("Imprimo sin utilizar estructuras de control iterativas:");
		ImprimoSinEstructuras(a, b);
	}

}
