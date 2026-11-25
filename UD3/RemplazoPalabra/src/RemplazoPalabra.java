import java.util.Scanner;
public class RemplazoPalabra {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
	
    	String [] fruta = {"uva", "fresa", "platano", "melon", "arandonos", "sandia", "piña"};
    	
    	System.out.println("Fruta remplazada: ");
    	String vieja= sc.nextLine();
	
    	System.out.println("Remplazar fruta");
    	String nueva= sc.nextLine();

    	boolean encontrada=false;
    	
    	for (int i=0; i<fruta.length;i++) {
    		if(fruta[i].compareToIgnoreCase(vieja) == 0) {
    			fruta[i] = nueva;
    			encontrada=true;
    		}
    	}
    	
    	 if (encontrada) {
             System.out.println("Fruta reemplazada. Array actualizado:");
             for (String elem:fruta) {
                 System.out.println(elem);
             }
         } else {
             System.out.println("No se encontró la fruta " + vieja);
         }
    	
	sc.close();
    }
}
