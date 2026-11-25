import java.util.Scanner;

public class ej15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero DEL 0 AL 100");

        int numero = sc.nextInt();
        int i = 1;
        while (i<=100) {
        	System.out.println((numero*i)); i++;
        }
        sc.close();
    }
}


