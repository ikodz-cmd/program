import java.util.Scanner;

public class MenuVoluntario {
	public static void main(String []arg) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		String usuario = "";
		String contrasena = "";
		String usuarioRegistrado = "";
		String contrasenaResgistrada = "";
		String nombre = "";
		String apellido = "";
		String dni = "";
		
		int donacion;
		int opcionRuta;
		int opcion;
		
		boolean permanecer = true;
		boolean registrado = false;
		boolean sesionIniciada = false;
		
		
		
		while( permanecer) {
			
				//Menu Principal
			System.out.println("");
			System.out.println("****MENÚ****");
			System.out.println("1.Registar Usuario");
			System.out.println("2.Inicio Sesion");
			System.out.println("3.Ver rutas");
				
			//Menu del inicio de sesion
			if (sesionIniciada) {
					
				System.out.println("4.Donar");
				System.out.println("5.Inscribirse en una ruta");
				System.out.println("6.Cerrar Sesion");
				System.out.println("7.Salir");
			}
				
			else {
				System.out.println("4.Salir");
					
			}
				
			System.out.println("Selecciona una opcion:");
			opcion = sc.nextInt();
			sc.nextLine();
				

			switch (opcion) {
			
			//Inicio de registro
				case 1:
					
					if (registrado) {
						
						System.out.println("Ya existe un usuario registrado");
					}
					
					else {
						System.out.println("Registro de usuario");
						System.out.println("Introduce un nombre de usuario:");
						usuarioRegistrado= sc.nextLine();
						
						System.out.println("Introduce una contraseña:");
						contrasenaResgistrada= sc.nextLine();
						
						registrado = true;
					
						System.out.println("Usuario registrado correctamente");
					}
					break;
					
				case 2:
					
					 if (!registrado) {
						 System.out.println("Primero debes registrar un usuario");
					 }
					 
					 //Proceso de Inicio de Sesion
					 else {
						 if (sesionIniciada) {
							 System.out.println("Ya has inicado sesion");
						 }
						 
						 else {
							 System.out.println("Inicio de Sesion");
							 System.out.println("Introduce tu nombre de usuario:");
							 usuario = sc.nextLine();
							 
							 System.out.println("Introduce tu contraseña");
							 contrasena= sc.nextLine();
							 
							 if (usuario.equals(usuarioRegistrado) && contrasena.equals( contrasenaResgistrada)) {
								 sesionIniciada = true;
								 
								 System.out.println("Has iniciado sesion correctamente");	 
							 }
							 else {
								 System.out.println("Usuario o contraseña incorrecto");
							 }
						 }
						 
					 }
					 break; 
					 
				case 3:
					
					//Menu de rutas
					
					int ruta = 0;			      
					    while(ruta != 3) {
					    	
					    	System.out.println("");
					        System.out.println("MENU DE RUTAS");
					        System.out.println("1. Ruta Verano 2026");
					        System.out.println("2. Ruta invierno 2026");
					        System.out.println("3. Volver al menu principal");
					        System.out.println("Selecciona una opcion");
					        
					        ruta =sc.nextInt();
					        sc.nextLine();
					        
					        //Ver caracteristicas de cada ruta
					            switch (ruta) {
					            
					            case 1: 
					            	System.out.println("");
					                System.out.println("RUTA VERANO 2026");
					                System.out.println("Zona: Mediterraneo Central, costa de Libia");
					                System.out.println("Fecha inicio: 17 de julio");
					                System.out.println("Fecha fin: 30 de agosto");
					                break;
					            case 2:
					            	System.out.println("");
					                System.out.println("RUTA INVIERNO 2026");
					                System.out.println("Zona: Mediterraneo Central, isla de Lampedusa");
					                System.out.println("Fecha inicio: 15 de noviembre");
					                System.out.println("Fecha fin: 20 de diciembre");
					                break;
					            case 3:
					                System.out.println("Volviendo al menu principal");
					                break;
					            default:
					                System.out.println("Opcion no valida");
					            }
					    } 
					
					    break;
					
				//Hacer donaciones 
					
				case 4:
					if (sesionIniciada) {
			            System.out.println("¿Cuanto quieres donar?");
			            donacion = sc.nextInt();
			            
			            if (donacion > 0) {
			                System.out.println("Gracias por tu donacion de " + donacion);}
			                
			                else {
			                    System.out.println("La cantidad debe ser mayor que cero");}
			            if (permanecer=false) {
			                System.out.println("Hasta pronto, agur");
			            }
			        }
					break;
					
					//Inscripcion rutas 
				case 5:
					
					if (sesionIniciada) {
			            opcionRuta= 0;
			            
			            while (opcionRuta!=3) {
			            	System.out.println("");
			                System.out.println("INSCRIPCION EN RUTAS");
			                System.out.println("1. Ruta verano 2026");
			                System.out.println("2. Ruta invierto 2026");
			                System.out.println("3. Volver al menu principal");
			                System.out.println("Elige una ruta:");
			                opcionRuta = sc.nextInt();
			                sc.nextLine();
			                
			                switch (opcionRuta){
				                
				                case 1:
				                    ruta=1;
				                break;
				                
				                case 2:
				                    ruta=2;
				                break;
				                
				                case 3:
				                    System.out.println("Volviendo al menu principal");
				                break;
				                 
				                default:
				                        System.out.println("Opcion no valida");
				                        }
					            
				               //datos de inscripcion
				    
				            if (opcionRuta == 1 || opcionRuta == 2){
				                System.out.println("Escribre tu nombre:");
				                nombre = sc.nextLine();
				                System.out.println("Escribre tu apellido:");
				                apellido = sc.nextLine();
				                System.out.println("Escribe tu DNI:");
				                dni = sc.nextLine();
				                System.out.println("");
				                System.out.println("Inscripcion exitosa.");
				                System.out.println("Nombre: " + nombre);
				                System.out.println("Apellido: " + apellido);
				                System.out.println("DNI: " + dni);
				                
				                if  (ruta == 1) {
				                    System.out.println("Ruta elegida: Verano 2026");
				                }
				                else {
				                        System.out.println("Ruta elegida: Invierno 2026");}
				            }
			            }
					}
			            else{
			                System.out.println("Debes iniciar secion para inscribirte");
			                }
			        
	
					break;
					
				case 6:
					if (sesionIniciada) {
						sesionIniciada = false;	
						System.out.println("Has cerrado sesion correctamente");
					}
					else {
						System.out.println("Opcion no valida");
					}
					
					break;
					
				case 7:
					if(sesionIniciada) {
						permanecer = false;
						System.out.println("Hasta pronto,agur");	
					}
					else {
						System.out.println("Opcion no valida");
					}
					
					break;
				default:
	                System.out.println("Esa opcion no existe.");
	                break;
			
			}
		
		}
		
		sc.close();
		
	}

}
