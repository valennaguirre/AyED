package Ej5;

public class Calculos {
	public static Valores valores;

	public static Valores RetornarValoresA (int[] vector) {
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i=0; i<vector.length; i++) {
			if(vector[i]>max) {
				max = vector[i];
			}
			if(vector[i]<min) {
				min = vector[i];
			}
			sum = sum+vector[i];
		}
		Valores valores = new Valores();
		if (vector.length > 0) {
		valores.setPromedio(sum/vector.length);
		}
		valores.setMaximo(max);
		valores.setMinimo(min);
		return valores;		
	}
	
	public static void RetornarValoresB (int[] vector, Valores b) {
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i=0; i<vector.length; i++) {
			if(vector[i]>max) {
				max = vector[i];
			}
			if(vector[i]<min) {
				min = vector[i];
			}
			sum = sum+vector[i];
		}
		if (vector.length > 0) {
		b.setPromedio(sum/vector.length);
		}	
		b.setMaximo(max);
		b.setMinimo(min);
	}
	
	public static void RetornarValoresC (int[] vector) {
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i=0; i<vector.length; i++) {
			if(vector[i]>max) {
				max = vector[i];
			}
			if(vector[i]<min) {
				min = vector[i];
			}
			sum = sum+vector[i];
		}
		Calculos.valores = new Valores();
		if (vector.length > 0) {
		Calculos.valores.setPromedio(sum/vector.length);
		}
		Calculos.valores.setMaximo(max);
		Calculos.valores.setMinimo(min);
	}
}
