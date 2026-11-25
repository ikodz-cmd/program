import java.util.Scanner; 
public class ej23_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int numOculto = (int) (Math.random() * 6 + 1);
        int intentos;
        int contadorIntentos = 0;
     
         do {
            System.out.print("Introducir un numero (1 al 6):");
            intentos = sc.nextInt();
            
            contadorIntentos++;
            
        } while (intentos != numOculto);
        
        System.out.println("Enhorabuena, has acertado en " + contadorIntentos + " intentos");
        sc.close();
    }
}