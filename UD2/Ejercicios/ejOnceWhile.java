import java.util.Scanner;

public class ejOnceWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INTRODUCE UN NUMERO");

        int numero = sc.nextInt();
        int i = 1;
        String asteriscos = "";

        while (i <= numero) {
            asteriscos += "*";   
            i++;
        }

        System.out.println(asteriscos);   
        sc.close();
    }
}
