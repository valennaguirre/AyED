package Ej2;

import java.util.Scanner;

public class Ej2 {
	
	public static int[] DevuelvoVector(int n) {
		int[] vector = new int[n];
		for (int i = 0; i<n; i++) {
			vector[i] = n*(i+1);
		}
		return vector;
	}
	
	public static int Numero() {
		Scanner s = new Scanner(System.in);
		int n = 1;
		while (s.nextInt() != 10) {
			n++;
		}
		return n;
	}
	
	public static void main (String[] args) {
		int n = Numero(); // n será igual a la cantidad de números que ingrese el usuario por teclado hasta insertar 10.
		int[] vector = DevuelvoVector(n);
		for (int i = 0; i<n; i++) {
			System.out.println(vector[i]);
		}
	}

}
