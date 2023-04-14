package Ej5;

public class Ej5 {
	
	public static void main(String[] args) {
		int[] vector = {1,2,3,4,5};
		Valores a = Calculos.RetornarValoresA(vector);
		//System.out.println("Máximo: " + a.getMaximo() + "Mínimo: " + a.getMinimo() + "Promedio: " + a.getPromedio());
		Valores b = new Valores();
		Calculos.RetornarValoresB(vector, b);
		//System.out.println("Máximo: " + b.getMaximo() + "Mínimo: " + b.getMinimo() + "Promedio: " + b.getPromedio());
		Calculos.RetornarValoresC(vector);
		Valores c = Calculos.valores;
		//System.out.println("Máximo: " + c.getMaximo() + "Mínimo: " + c.getMinimo() + "Promedio: " + c.getPromedio());
	}

}
