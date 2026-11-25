import java.util.Scanner;
	public class ej5 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Ingrese una nota");
			
			int nota = sc.nextInt();
			
			switch (nota) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("Suspenso");
				break;
			case 5:
				System.out.println("Suficiente");
				break;
			case 7:
				System.out.println("Bien");
				break;
			case 8: 
				System.out.println("Muy bien");
				break;
			case 9:
			case 10:
				System.out.println("Sobresaliente");
			}
			  sc.close();
		}
	}
