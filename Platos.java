package proyectorestaurante;
import java.util.Scanner;

public class Platos {
static Scanner en = new Scanner(System.in);

	public static void mostrarPlatos() {
		int op;
		double total = 0;
		String lista = "";
		int p [] = new int [5];
		p [0] = 1;
		p [1] = 2;
		p [2] = 3;
		p [3] = 4;
		p [4] = 5;
		
		int en1 = 1;
		int en2 = 2;
		int en3 = 3;
		int en4 = 4;
		int en5 = 5;
		
System.out.println("1- Entradas\n"+
"1- Dedos de queso ------------------------------------------------ C$60  |\n"+
"2- Guacamole ----------------------------------------------------- C$30  |\n"+
"3- Papas a la francesa ------------------------------------------- C$50  |\n"+
"4- Guacamole ----------------------------------------------------- C$30  |\n"+
"5- Papas a la francesa ------------------------------------------- C$50  |\n");
	
validar();
		
	op = en.nextInt();
	
	for (int i = 0; i < p.length; i++) {
		if (p[i] == op) {
			 en1 = 1;
			 en2 = 2;
			 en3 = 3;
			 en4 = 4;
			 en5 = 5;
		}
	}
	
	if(op==1) {
		lista += "|  Dedos de queso ---------------- C$60  |\n";
		total += 60;
	}else if(op==2) {
		lista += "|  Guacamole --------------------- C$30  |\n";
		total += 30;
	}else if(op==3) {
		lista += "|  Papas a la francesa ----------- C$50  |\n";
		total += 50;
	}
	
	 System.out.println("CURRUCUCHITOS RESTAURANT: \n"+
			 "LISTA DE PEDIDO \n"+ lista);
			    System.out.println("El total del pedido es: "+ total);
}
	
	
	
	public static void validar() {
		while (!en.hasNextInt()) {
			en.next();
			System.out.println("Digite nuevamente");
		}
	}
	
	
}
