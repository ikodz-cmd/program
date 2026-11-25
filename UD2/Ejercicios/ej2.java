import java.util.Scanner;
public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su edad");
        int edad = sc.nextInt();
        if (edad>17) System.out.println("Eres mayor de edad");
        else System.out.println("Eres menor de edad");
        sc.close();
}
}