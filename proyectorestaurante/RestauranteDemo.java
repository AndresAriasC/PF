package proyectorestaurante;
import proyectorestaurante.Menu;
import java.util.ArrayList;
import java.util.Scanner;

public class RestauranteDemo extends Menu{

	static Scanner entrada = new Scanner(System. in);
	
	public static void validar() {
		while (!entrada.hasNextInt()) {
			entrada.next();
			System.out.println("Digite un numero.");
		}
	}
	

	public static void main(String[] args) {
		
		  byte opPlatillo, opPlatillo2;
		  double subtotal=0,total = 0;
		  double efectivo;
		  String lista = "";	
		
		Mesero mes1 = new Mesero();
		Mesa mesita = new Mesa();
		Menu menu = new Menu();
		Platos pl = new Platos();


		  System.out.println(mes1);

		  do{
			  menu.header();
			  menu.Entrada();
			  menu.Sopas();
			  menu.Almuerzo();
			  menu.Postres();
			  menu.Bebidas();
			  menu.VerFactura();

				System.out.println("Seleccione una opcion: ");

				validar();
		opPlatillo = entrada.nextByte();

		switch(opPlatillo){
		   case 1:
				menu.Entrada();
				System.out.println("Entrada: ");
				validar();
				opPlatillo2 = entrada.nextByte();
				
		System.out.println(opPlatillo2);
		
		do {
			if(opPlatillo2 == 1){
	 			lista += "|  Dedos de queso ---------------- C$60  |\n";
	 			 subtotal += 60;
	 	
	      		}else if(opPlatillo2 == 2){
				lista += "|  Guacamole --------------------- C$30  |\n";
				 subtotal += 30;
				
		        }else if(opPlatillo2 == 3){
				lista += "|  Papas a la francesa ----------- C$50  |\n";
				 subtotal += 50;
	                }
			break;
			
		}while(opPlatillo2 < 1 || opPlatillo2 > 3);
		
		

		     break;

		 case 2:
			 
			 	menu.Sopas();
			 	
				System.out.println("Sopa: ");
				validar();
				opPlatillo2 = entrada.nextByte();
				System.out.println(opPlatillo2);
				do {
					if(opPlatillo2 == 1){
			 			lista += "|  Verduras --------------------- C$120  |\n";
			 			 subtotal += 120;
			 	
			      		}else if(opPlatillo2 == 2){
						lista += "|  Fideos ----------------------- C$100  |\n";
						 subtotal += 100;
						
				        }else if(opPlatillo2 == 3){
						lista += "|  Camarones -------------------- C$190  |\n";
						 subtotal += 190;
			                }
					break;
					
				}while(opPlatillo2 < 1 || opPlatillo2 > 3);

				break;
		 case 3:
			 
			 menu.Almuerzo();
			 
				System.out.println("Plato Principal: ");
				validar();
				opPlatillo2 = entrada.nextByte();

				do {
					if(opPlatillo2 == 1){
			 			lista += "|  Pollo empanizado ------------- C$130  |\n";
			 			 subtotal += 130;
			 	
			      		}else if(opPlatillo2 == 2){
						lista += "|  Hamburguesa / res ------------ C$140  |\n";
						 subtotal += 140;
						
				        }else if(opPlatillo2 == 3){
						lista += "|  Ensalada Veget --------------- C$150  |\n";
						 subtotal += 150;
			                }
					break;
					
				}while(opPlatillo2 < 1 || opPlatillo2 > 3);

				break;
		 case 4:
			 
			menu.Postres();

				System.out.print("Postre: ");
				opPlatillo2 = entrada.nextByte();

				do {
					if(opPlatillo2 == 1){
			 			lista += "|  Helado Vai/Cho/Fr ------------- C$80  |\n";
			 			 subtotal += 80;
			 	
			      		}else if(opPlatillo2 == 2){
						lista += "|  Flan napolitano --------------- C$80  |\n";
						 subtotal += 80;
						
				        }else if(opPlatillo2 == 3){
						lista += "|  Fresas con crema ------------- C$100  |\n";
						 subtotal += 100;
			                }
					break;
					
				}while(opPlatillo2 < 1 || opPlatillo2 > 3);

				break;
		 case 5:

			menu.Bebidas();
				System.out.println("Bebida: ");
				opPlatillo2 = entrada.nextByte();


				do {
					if(opPlatillo2 == 1){
			 			lista += "|  Naranja ----------------------- C$30  |\n";
			 			 subtotal += 80;
			 	
			      		}else if(opPlatillo2 == 2){
						lista += "|  Cacao ------------------------- C$50  |\n";
						 subtotal += 80;
						
				        }else if(opPlatillo2 == 3){
						lista += "|  Grama ------------------------- C$50  |\n";
						 subtotal += 100;
			                }
					break;
					
				}while(opPlatillo2 < 1 || opPlatillo2 > 3);

				break;

		case 6:
		System.out.println("------------- "+ mes1.getNombreRestaurante()+ " -------------");
		 System.out.println("LISTA DE PEDIDO \n"+ lista);
		 System.out.println("|  Subtotal es: ----------------- "+subtotal + "  |");
		 total = (subtotal+SacarIva(subtotal)+propina(subtotal));
		 System.out.println("|  El total es: ----------------- "+ total +"  |");
		 

			
			
		menu.MetodoPagar(total);
		 
		break;

		}
		
		}while (opPlatillo != 6  || opPlatillo > 6 );
		  
		  
		  
		  entrada.close();

		  
		  
		  
		   }
	}