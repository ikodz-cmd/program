import java.util.Scanner;
public class BuscarCiudad {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    	String [] ciudades = {"Donosti", "Bilbao", "Barcelona", "Sevilla", "Malaga"};

    	System.out.println("Indroduce una ciudad");
    	String user= sc.nextLine();
    	
    	boolean encontrada = false;
    	
    	for(int i = 0; i < ciudades.length; i++) {
    		if(ciudades[i].equals(user)) {
    		encontrada=true;
    		}
    	}
    	
    	if (encontrada == true){
    		System.out.println("Esta en el arrays");
    	} else {
    		System.out.println("NO esta en el arrays");
    	}
    	
    	
    	
    	sc.close();
    }
}
