package proyectorestaurante;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu extends Platillos {
	Scanner entrada = new Scanner(System.in);
public int opcionPlatillo ;


	public int getOpcionPlatillo() {
	return opcionPlatillo;
}
public void setOpcionPlatillo(int opcionPlatillo) {
	this.opcionPlatillo = opcionPlatillo;
}
public void header() {
	System.out.println("-------------------------------------------------");
	System.out.println("-------------------- M E N U -------------------|");
	System.out.println("------------------------------------------------|");
}
	
	public void Entrada() {
		
		ArrayList<Platillos> listaPlatillosEntrada = new ArrayList<Platillos>();
		
		Platillos p1 = new Platillos("Dedos de queso ------", 60);
		Platillos p2 = new Platillos("Guacamole -----------", 50);
		Platillos p3 = new Platillos("Papas a la francesa -", 40);
		
		listaPlatillosEntrada.add(p1);
		listaPlatillosEntrada.add(p2);
		listaPlatillosEntrada.add(p3);

		System.out.println("1) Entradas ------------------------------------|");
		for (int i = 0; i < listaPlatillosEntrada.size(); i++) {
			System.out.println("  "+(i+1+"- ")+listaPlatillosEntrada.get(i).getNombrePlatillo()+"----------- "+listaPlatillosEntrada.get(i).getPrecio() + " -----|");
		}
	}
	
	public void Sopas() {
		ArrayList<Platillos> listaPlatillosSopas = new ArrayList<Platillos>();

		Platillos p4 = new Platillos("Verduras -----------", 120);
		Platillos p5 = new Platillos("Fideos -------------", 100);
		Platillos p6 = new Platillos("Camarones ----------", 190);
		
		listaPlatillosSopas.add(p4);
		listaPlatillosSopas.add(p5);
		listaPlatillosSopas.add(p6);
		
		System.out.println("2) Sopas ---------------------------------------|");
		for (int i = 0; i < listaPlatillosSopas.size(); i++) {
			System.out.println("  "+(i+1+"- ")+listaPlatillosSopas.get(i).getNombrePlatillo()+"----------- "+listaPlatillosSopas.get(i).getPrecio() + " -----|");
		}
	}
	
	public void Almuerzo() {
		
		ArrayList<Platillos> listaPlatillosAlmuerzo = new ArrayList<Platillos>();
		
		Platillos p7 = new Platillos("Pollo empanizado ---", 130);
		Platillos p8 = new Platillos("Hamburguesa / res --", 140);
		Platillos p9 = new Platillos("Ensalada Veget -----", 150);
		
		listaPlatillosAlmuerzo.add(p7);
		listaPlatillosAlmuerzo.add(p8);
		listaPlatillosAlmuerzo.add(p9);
		
		System.out.println("3) Almuerzo ------------------------------------|");
		for (int i = 0; i < listaPlatillosAlmuerzo.size(); i++) {
			System.out.println("  "+(i+1+"- ")+listaPlatillosAlmuerzo.get(i).getNombrePlatillo()+"----------- "+listaPlatillosAlmuerzo.get(i).getPrecio() + " -----|");
		}
	}
	
	public void Postres() {
ArrayList<Platillos> listaPlatillosPostres = new ArrayList<Platillos>();
		
		Platillos p10 = new Platillos("Helado Vai/Cho/Fr ---", 80);
		Platillos p11 = new Platillos("Flan napolitano -----", 40);
		Platillos p12 = new Platillos("Fresas con crema ----", 60);
		
		listaPlatillosPostres.add(p10);
		listaPlatillosPostres.add(p11);
		listaPlatillosPostres.add(p12);
		
		System.out.println("4) Postres -------------------------------------|");
		for (int i = 0; i < listaPlatillosPostres.size(); i++) {
			System.out.println("  "+(i+1+"- ")+listaPlatillosPostres.get(i).getNombrePlatillo()+"----------- "+listaPlatillosPostres.get(i).getPrecio() + " -----|");
		}
	}
	
	public void Bebidas() {
		ArrayList<Platillos> listaPlatillosBebidas = new ArrayList<Platillos>();
		
		Platillos p13 = new Platillos("Naranja -------------", 30);
		Platillos p14 = new Platillos("Cacao ---------------", 50);
		Platillos p15 = new Platillos("Grama ---------------", 50);
		
		listaPlatillosBebidas.add(p13);
		listaPlatillosBebidas.add(p14);
		listaPlatillosBebidas.add(p15);
		
		System.out.println("5) Bebidas -------------------------------------|");
		for (int i = 0; i < listaPlatillosBebidas.size(); i++) {
			System.out.println("  "+(i+1+"- ")+listaPlatillosBebidas.get(i).getNombrePlatillo()+"----------- "+listaPlatillosBebidas.get(i).getPrecio() + " -----|");
		}
	}
	
	public static void VerFactura() {
		
		System.out.println("6) Ver Factura ---------------------------------|");
		System.out.println("------------------------------------------------");
		
	}
	
	public void MetodoPagar(double sumaTotal) {
		double dollar = 36;
		int op, montoBillete;
		System.out.println("Con que tipo de moneda desea pagar?");
		System.out.println("1) Cordobas /t 2) Dolares");
		op = entrada.nextInt();
		switch (op) {
		case 1: 
			System.out.println("Ha elegido pagar en cordobas \n " + 
		" Digite el monto: ");
			montoBillete = entrada.nextInt();
			
		do {	
			if (montoBillete < sumaTotal) {
			System.out.println("El dinero brindado no es suficiente para realizar el pago");
		}else {
			System.out.println("El pago se ha realizado con exito");
		}
			}while(montoBillete >= sumaTotal);
		}
		
	}
	
	public static double SacarIva(double subtotal) {
		double IVA= (subtotal*0.15);
		 System.out.println("|  IVA 15% : ------------------- " +  String.format("%.2f",(IVA)) + "  |");
		   return IVA;
	}
	
	public static double propina(double subtotal) {
		Mesero mes1 = new Mesero();
		double propina=(subtotal*0.05);
		System.out.println("|  La Propina de "+ mes1.getNombre() +" es de: --- "+propina + "  |");
		return propina;
	}
	
	
	}
	



