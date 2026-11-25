import java.util.Scanner;
public class convertirCelsiusAFahrenheit {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		
		double grado;
		System.out.println("Introduzca la temperatura Celsius: ");
		grado= sc.nextInt();
		
		System.out.println("La temperatura a Fahrenheit es: " + mostrarTemperatura(grado));
		
		sc.close();
	}
	
	public static double mostrarTemperatura(double grado) {
		double resultado= (grado * 9.0 / 5.0) + 32;
		
		return resultado;
	}
}
