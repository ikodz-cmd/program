
public class ListaSinAyuda {
    public static void main(String[] args) {
    	
    	int[] lista = new int[10];
    	
    	for (int i=0; i<lista.length;i++) {
			lista[i]= (int) (Math.random()*100)+1;
		}
    	
    	System.out.println("Lista Desordenada");
	    for (int elem:lista) {
	    	System.out.print(elem + " ");
	    }
    	    	
    	
    	for (int i = 0; i < lista.length - 1; i++) {      
    	    for (int j = 0; j < lista.length - 1; j++) {  
    	        if (lista[j] > lista[j + 1]) {         
    	            int temp = lista[j];             
    	            lista[j] = lista[j + 1];
    	            lista[j + 1] = temp;
    	        }
    	    }
    	}
    	
    	System.out.println(" ");

    	
    	System.out.println("Lista Ordenada");
    	for (int elem:lista) {
    		System.out.print(elem + " ");
    	}	
    }
}
