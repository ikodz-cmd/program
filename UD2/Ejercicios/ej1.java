import java.util.Scanner;
public class ej1 {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println ("Introduce tu sueldo");
int sueldo = sc.nextInt();
if (sueldo>3000) {
	System.out.println ("Debes abonar impuestos");
	}
else { 
	System.out.println ("No debes abonar impuestos");
	}
sc.close();
}
}