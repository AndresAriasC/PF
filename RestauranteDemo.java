package proyectorestaurante;
import proyectorestaurante.Menu;
import java.util.ArrayList;
import java.util.Scanner;

public class RestauranteDemo extends Menu{

	public static void main(String[] args) {
		
		  byte opPlatillo, opPlatillo2;
		  float total = 0;
		  String lista = "";	
		
		Scanner entrada = new Scanner(System. in);
		Mesero mes1 = new Mesero();
		Mesa mesita = new Mesa();
		Menu men = new Menu();
		Platos pl = new Platos();


		  System.out.println(mes1);
		  
	
		  do{
				MenuPlatillos();

		System.out.println("Seleccione una opcion: ");
		opPlatillo = entrada.nextByte();

		switch(opPlatillo){
		   case 1:
				entradas();
				System.out.println("Entrada: ");
				opPlatillo2 = entrada.nextByte();

				if(opPlatillo2 == 1){
					System.out.println(men.getNombrePlatillo() + men.getPrecio());
		 			lista += "|  Dedos de queso ---------------- C$60  |\n";
					total += 60;
		      		}else if(opPlatillo2 == 2){
					lista += "|  Guacamole --------------------- C$30  |\n";
					total += 30;
			        }else if(opPlatillo2 == 3){
					lista += "|  Papas a la francesa ----------- C$50  |\n";
		 			total += 50;
		                }

		     break;

		 case 2:

			System.out.println("     ------------------------------------------");
				System.out.println(
				      "    | 1- Verduras ---------------------- C$30  |\n"+
		    		      "    | 2- Fideos ------------------------ C$30  |");
			System.out.println("     ------------------------------------------");

				System.out.println("Sopa: ");
				opPlatillo2 = entrada.nextByte();

				if(opPlatillo2 == 1){
					lista += "|  Verduras ---------------------- C$30  |\n";
				}else if(opPlatillo2 == 2){
					lista += "|  Fideos ------------------------ C$30  |\n";
				}
					total += 30;
				break;


		 case 3: //plato Nica Principal

			System.out.println("     ------------------------------------------");
				System.out.println(
				      "    | 1- Pechuga de pollo empanizada -- C$120  |\n"+
		    		      "    | 2- Hamburguesa de carne de res --- C$90  |\n"+
		    		      "    | 3- Ensalada ---------------------- C$40  |");
			System.out.println("     ------------------------------------------");

				System.out.println("Plato Principal: ");
				opPlatillo2 = entrada.nextByte();

		      
		      if(opPlatillo2 == 1){
			 lista += "|  Pechuga de pollo empanizada -- C$120  |\n";
		         total += 120;
		      }else if(opPlatillo2 == 2){
		       lista += "|  Hamburguesa de carne de res --- C$90  |\n";
		       total += 90;
		      }else if(opPlatillo2 == 3){
			lista += "|  Ensalada ---------------------- C$40  |\n";
		       total += 40;
		      }
				
		       break;

		 case 4:
			System.out.println("     -------------------------------------------------");
				System.out.println(
				      "    | 1- Helado (vainilla/chocolate/fresa) ---- C$60  |\n"+
		    		      "    | 2- Flan napolitano ---------------------- C$60  |\n"+
		    		      "    | 3- Fresas con crema --------------------- C$60  |\n"+
		    		      "    | 4- Platanos fritos ---------------------- C$60  |");
			System.out.println("     -------------------------------------------------");

				System.out.print("Postre: ");
				opPlatillo2 = entrada.nextByte();

				if(opPlatillo2 == 1){
					lista += "|  Helado (Vainilla/Chocolate/Fresa) ---- C$60  |\n";
		  		}else if(opPlatillo2 == 2){
					lista += "| Flan napolitano ---------------------- C$60  |\n";
				}else if(opPlatillo2 == 3){
					lista += "|  Fresas con crema --------------------- C$60  |\n";
				}else if(opPlatillo2 == 4){
					lista += "|  Platanos fritos ---------------------- C$60  |\n";			
				}

				total += 60;
				
				break;
		 case 5:

			System.out.println("     -------------------------------------------------");
				System.out.println(
				      "    | 1- Naranja ------------------------------ C$35  |\n"+
		    		      "    | 2- Malteada ----------------------------- C$35  |\n"+
		    		      "    | 3- Grama -------------------------------- C$35  |\n"+
		    		      "    | 4- Cacao -------------------------------- C$40  |\n"+
		    		      "    | 5- Cerveza ------------------------------ C$45  |");
		System.out.println("     -------------------------------------------------");

				System.out.println("Bebida: ");
				opPlatillo2 = entrada.nextByte();


				
		     if(opPlatillo2 == 1 || opPlatillo2 == 2 || opPlatillo2 == 3){
					switch(opPlatillo2){
					  case 1:
						lista += "|  Naranja ------------------------------ C$35  |\n";
						break;

					 case 2: 
						lista += "|  Malteada ----------------------------- C$35  |\n";
						break;

					 case 3: 
						lista += "|  Grama -------------------------------- C$35  |\n";
						break;
					}
		       total += 35;
		      }else if(opPlatillo2 == 4){
			 lista += "|  Cacao -------------------------------- C$40  |\n";
		         total += 40;
		      }else if(opPlatillo2 == 5){
		        lista += "|  Cerveza ------------------------------ C$45  |\n";
			total += 45;
		     }
			break;

		case 6:
		 System.out.println("CURRUCUCHITOS RESTAURANT: \n"+
		"LISTA DE PEDIDO \n"+ lista);
		   System.out.println("El total del pedido es: "+ total);

		break;

		}

		}while (opPlatillo != 6);
		  
		  entrada.close();

		   }
	}
