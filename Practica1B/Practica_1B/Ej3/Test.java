package Ej3;
import java.util.Scanner;

public class Test {	

	public static void AsignarEstudiantes(Estudiante[] estudiantes) {
		Estudiante e = new Estudiante();
		e.setNombre("Fernando");
		e.setApellido("Lopez");
		e.setComision(1);
		e.setEmail("fernandolopez@gmail.com");
		e.setDireccion("1 y 85");
		estudiantes[0] = e;
		e = new Estudiante();
		e.setNombre("Micaela");
		e.setApellido("Fernandez");
		e.setComision(2);
		e.setEmail("micaelafernandez@gmail.com");
		e.setDireccion("23 y 32");
		estudiantes[1] = e;		
	}
	
	public static void AsignarProfesores(Profesor[] profesores) {
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<3; i++) {
			Profesor p = new Profesor();
			p.setApellido(sc.nextLine());
			p.setNombre(sc.nextLine());
			p.setEmail(sc.nextLine());
			p.setFacultad(sc.nextLine());
			p.setCatedra(sc.nextLine());
			profesores[i] = p;
		}
		sc.close();
	}
	public static void main(String[] args) {
		Estudiante[] estudiantes = new Estudiante[2];
		Profesor[] profesores = new Profesor[3];
		AsignarEstudiantes(estudiantes);
		for (int i=0; i<2; i++) {
			System.out.println(estudiantes[i].tusDatos());
		}
		AsignarProfesores(profesores);
		for (int i=0; i<3; i++) {
			System.out.println(profesores[i].tusDatos());
		}
	}
}
