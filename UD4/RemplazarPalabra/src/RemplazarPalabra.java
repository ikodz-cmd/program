import java.util.Scanner;
public class RemplazarPalabra {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		String [] frutas= {"platano", "fresa", "arandano", "kiwi", "naranja"};
		
		System.out.println("Elije la fruta para remplazar: ");
		String vieja= sc.nextLine();
		System.out.println("La fruta nueva");
		String nueva=sc.nextLine();
		
		String remplazo = remplazarFruta(vieja, nueva);
	}
	
	
}
