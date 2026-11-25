import java.util.Scanner;
public class Suma {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		int suma;
		
		System.out.println("Ingrese un numero");
		num1 = sc.nextInt();
		System.out.println("Ingrese un segundo numero");
		num2 = sc.nextInt();
		
		mostarSuma(mensaje + suma));

	}
	
	private static int mostarSuma(String mensaje, int num1, int num2) {
		int suma= num1 + num2;
		mostarMensaje(mensaje + suma);
		return suma;
	}
	
	private static void mostarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
}
