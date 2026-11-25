package ejercicios;
import java.util.Scanner;

public class EjerciciosJava {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora");
        System.out.println("Introduce el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2 = sc.nextInt();
        System.out.println("Introduce el tercer numero");
        int num3 = sc.nextInt();
        System.out.println("La suma es:"+ (num1 + num2 + num3));
        
        
        sc.close();
	}
}
