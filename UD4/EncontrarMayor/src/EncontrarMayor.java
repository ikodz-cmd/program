import java.util.Scanner;
public class EncontrarMayor {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Introduzca un numero: ");
		int num1= sc.nextInt();
		System.out.println("Introduzca un segundo numero: ");
		int num2= sc.nextInt();
		System.out.println("Introduzca un tercer numero: ");
		int num3= sc.nextInt();
		
		int resultado = mostrarMayor(num1, num2, num3);
		System.out.println("Introduzca un numero: " + resultado);
		
	}
	
	public static int mostrarMayor(int num1, int num2, int num3) {
		int mayor;
		
		if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }
		
		return mayor;
	}
}
