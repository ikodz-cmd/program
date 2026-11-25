import java.util.Scanner;
public class ej12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("TABLA DE MULTIPLICAR");
		int numero = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(numero +  "x"  + i + " = " + (numero * i));
			}
		
		sc.close();
	}
}  
	