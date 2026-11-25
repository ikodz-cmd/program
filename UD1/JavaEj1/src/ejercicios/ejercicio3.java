package ejercicios;
import java.util.Scanner;

public class ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String nombre = sc.nextLine();
		System.out.println("Introduce tu apellido");
		String apellido = sc.nextLine();
		System.out.println("Hola, " + (nombre) +(" ") + (apellido));
		System.out.println("Agur");
		
		sc.close();
	}
}
