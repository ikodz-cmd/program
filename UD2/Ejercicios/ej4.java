import java.util.Scanner;
	public class ej4 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("MUESTRA EL MAYOR NUMERO");
			System.out.println("Introduce un numero;");
			int num1 = sc.nextInt();
			System.out.println("Introduce un numero;");
			int num2 = sc.nextInt();
			System.out.println("Introduce un numero;");
			int num3 = sc.nextInt();
			
			if ((num1 > num2) && (num1 > num3)) {
		    System.out.println(num1 + " es el mayor.");
			} else if ((num2 > num1) && (num2 > num3)) {
		    System.out.println(num2 + " es el mayor.");
			} else {
		    System.out.println(num3 + " es el mayor.");
			}
			sc.close();
		}
}

	

