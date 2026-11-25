import java.util.Scanner;
	public class ej21 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
        
			System.out.println("Introduce un numero para visualizar su factorial");
			int num = sc.nextInt();
			for (int i = 1; i <= 5; i++) {
			System.out.println(num + "x" + i + "=" + (num*i));
			}
        sc.close();
    }
}