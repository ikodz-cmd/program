import java.util.Scanner;
public class BuscarNumero {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int [] numLista= {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
		
		
		System.out.println("Busca un numero en el array ");
		int numero = sc.nextInt();
		
		int i;
		for ( i = 0; i < numLista.length; i++) {
			if (numLista[i] == numero) {
				System.out.println("Tu numero esta en la posición: " + i);
				break;
			}
			
		}
        if (i == numLista.length) {
            System.out.println("Ese numero no existe");
        }
		
		sc.close();
    }
}
