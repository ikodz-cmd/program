import java.util.Scanner;
public class ContarPalabras {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        String[] frutas = {"Manzana", "Plátano", "Naranja", "Fresa", "Uva"};

        System.out.print("Ingrese la fruta que desea reemplazar: ");
        String frutaBuscar = scanner.nextLine();

        System.out.print("Ingrese la nueva fruta: ");
        String frutaNueva = scanner.nextLine();

        boolean encontrada = false;

        for (int i = 0; i < frutas.length; i++) {
            if (frutas[i].equalsIgnoreCase(frutaBuscar)) {
                frutas[i] = frutaNueva;
                encontrada = true;
                break;
            }
        }

        if (encontrada) {
            System.out.println("Fruta reemplazada con éxito. Array actualizado:");
            for (String fruta : frutas) {
                System.out.println("- " + fruta);
            }
        } else {
            System.out.println("Error: La fruta '" + frutaBuscar + "' no se encontró en el array.");
        }

        scanner.close();
    }


    }

