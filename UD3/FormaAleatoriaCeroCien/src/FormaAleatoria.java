import java.util.Arrays;

import java.util.Random;
public class FormaAleatoria {
    public static void main(String[] args) {
    	
    	int[] lista = new int[10];
		int aleatorio= (int) (Math.random()*100)+1;
        
        //lista desordenada con numero aleatorios
    	for (int i = 0; i < lista.length; i++) {
    		lista[i] = aleatorio;
    	}
    	
    	//lista con array ayuda
    	int[] ayuda = new int[10];
    	for (int i = 0; i < ayuda.length; i++) {
			ayuda[i] = lista[i];
		}
    	//te ordena la lista
    	Arrays.sort(ayuda);
    	
    	
    	//inprime las listas (el toString es una cadena de caracteres)
    	System.out.println("Ordenados: " + Arrays.toString(lista));
    	System.out.println("Ordenados con arrays: " + Arrays.toString(ayuda));
    	
    	//sin el arrays
    	Arrays.sort(lista);
    	System.out.println("Sin arrays: " + Arrays.toString(lista));

    }
}
