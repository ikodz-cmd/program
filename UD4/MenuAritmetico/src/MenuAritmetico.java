import java.util.Scanner;
public class MenuAritmetico {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		boolean permanecer = true;
		
		while (permanecer) {
			System.out.println("Menu Aritmetico");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Salir");
			int opcion = sc.nextInt();
			
			switch (opcion) {
			
				case 1:
					System.out.println("Ingrese un numero");
					num1 = sc.nextInt();
					System.out.println("Ingrese un segundo numero");
					num2 = sc.nextInt();
					
					System.out.println("La suma es: " + mostarSuma(num1, num2) );
					
					break;
				
				case 2:
					System.out.println("Ingrese un numero");
					num1 = sc.nextInt();
					System.out.println("Ingrese un segundo numero");
					num2 = sc.nextInt();
					
					System.out.println("La resta es: " + mostarResta(num1, num2) );
					
					break;
				case 3:
					System.out.println("Ingrese un numero");
					num1 = sc.nextInt();
					System.out.println("Ingrese un segundo numero");
					num2 = sc.nextInt();
					
					System.out.println("La multiplicación es: " + mostarMultiplo(num1, num2) );
					
					
					break;
					
				case 4:
					System.out.println("Ingrese un numero");
					num1 = sc.nextInt();
					System.out.println("Ingrese un segundo numero");
					num2 = sc.nextInt();
					
					mostarDivisor(num1, num2);
					
					
					break;
					
				case 5:
					permanecer = false;
					System.out.println("Vuelve pronto");
					break;
				
			default:
				System.out.println("Esa opcion no existe");
			}
			
		}
		
		sc.close();
	}
	
	private static int mostarSuma(int num1, int num2) {
		int suma= num1 + num2;
		return suma;
	}
	
	private static int mostarResta(int num1, int num2) {
		int resta= num1 - num2;
		return resta;
	}
	
	private static int mostarMultiplo(int num1, int num2) {
		int multiplo= num1 * num2;
		return multiplo;
	}
	
	
	private static void mostarDivisor(int num1, int num2) {
		if(num1 == 0 || num2 ==0) {
			System.out.println("Ese numero no se puede dividir");
		}
		else {
			double divisor= num1 % num2;
			System.out.println("La division es: " + divisor);
		}
		
		
	}
	
	
	
}
