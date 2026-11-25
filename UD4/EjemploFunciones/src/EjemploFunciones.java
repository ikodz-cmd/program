
import java.util.Scanner;

public class EjemploFunciones {



	
	static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		/*
		 * Leer dos numeros enteros y hacer la suma
		 */
		
		int num1, num2, suma;
		
		num1 = obtenerNumeroValido();
		num2 = obtenerNumeroValido();
		
		suma = sumarDosNumero(num1, num2);
		
		System.out.println("La suma de los numeros "+num1+" + "+num2+" = "+suma);
		
	}

	private static int sumarDosNumero(int numero1, int numero2) {
		int suma;
		
		suma = numero1+numero2;
		
		return suma;
	}

	private static int obtenerNumeroValido() {
		int numero=0;
		boolean invalidNumber=true;
		do {
			System.out.println("Introduce un numero: ");
			try {
				numero = input.nextInt();
				invalidNumber=false;
			}catch(Exception e) {
				System.out.println("Introduce un valor valido");
				input.nextLine();
			}
			
		}while(invalidNumber);
		
		return numero;
	}
}