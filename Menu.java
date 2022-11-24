package proyectorestaurante;

import java.util.ArrayList;

public class Menu extends Platillos {

	public static void MenuPlatillos() {
		ArrayList<Platillos> listaPlatillosEntrada = new ArrayList<Platillos>();
		Platillos p1 = new Platillos("Dedos de queso ------", 60);
		Platillos p2 = new Platillos("Guacamole -----------", 50);
		Platillos p3 = new Platillos("Papas a la francesa -", 40);
		
		listaPlatillosEntrada.add(p1);
		listaPlatillosEntrada.add(p2);
		listaPlatillosEntrada.add(p3);
		System.out.println("-------------------------------------------------");
		System.out.println("-------------------- M E N U -------------------|");
		System.out.println("------------------------------------------------|");
		System.out.println("1) Entradas ------------------------------------|");
		for (int i = 0; i < listaPlatillosEntrada.size(); i++) {
			System.out.println("  "+(i+1+"- ")+listaPlatillosEntrada.get(i).getNombrePlatillo()+"----------- "+listaPlatillosEntrada.get(i).getPrecio() + " -----|");
		}
		
		ArrayList<Platillos> listaPlatillosSopas = new ArrayList<Platillos>();

		Platillos p4 = new Platillos("Verduras ------------", 120);
		Platillos p6 = new Platillos("Fideos --------------", 100);
		Platillos p7 = new Platillos("Camarones -----------", 90);
		
		listaPlatillosSopas.add(p1);
		listaPlatillosSopas.add(p2);
		listaPlatillosSopas.add(p3);
		
		System.out.println("2) Sopas ---------------------------------------|");
		for (int i = 0; i < listaPlatillosSopas.size(); i++) {
			System.out.println("  "+(i+1+"- ")+listaPlatillosSopas.get(i).getNombrePlatillo()+"----------- "+listaPlatillosSopas.get(i).getPrecio() + " -----|");
		}
		
		ArrayList<Platillos> listaPlatillosAlmuerzo = new ArrayList<Platillos>();
		
		Platillos p8 = new Platillos("Pollo empanizado ----", 130);
		Platillos p9 = new Platillos("Hamburguesa / res ---", 140);
		Platillos p10 = new Platillos("Ensalada Veget -----", 150);
		
		listaPlatillosAlmuerzo.add(p1);
		listaPlatillosAlmuerzo.add(p2);
		listaPlatillosAlmuerzo.add(p3);
		
		System.out.println("3) Almuerzo ------------------------------------|");
		for (int i = 0; i < listaPlatillosAlmuerzo.size(); i++) {
			System.out.println("  "+(i+1+"- ")+listaPlatillosAlmuerzo.get(i).getNombrePlatillo()+"----------- "+listaPlatillosAlmuerzo.get(i).getPrecio() + " -----|");
		}
		
		ArrayList<Platillos> listaPlatillosPostres = new ArrayList<Platillos>();
		
		Platillos p11 = new Platillos("Helado Vai/Cho/Fr ---", 80);
		Platillos p12 = new Platillos("Flan napolitano -----", 40);
		Platillos p13 = new Platillos("Fresas con crema ----", 60);
		
		listaPlatillosPostres.add(p1);
		listaPlatillosPostres.add(p2);
		listaPlatillosPostres.add(p3);
		
		System.out.println("4) Postres -------------------------------------|");
		for (int i = 0; i < listaPlatillosPostres.size(); i++) {
			System.out.println("  "+(i+1+"- ")+listaPlatillosPostres.get(i).getNombrePlatillo()+"----------- "+listaPlatillosPostres.get(i).getPrecio() + " -----|");
		}
		
		ArrayList<Platillos> listaPlatillosBebidas = new ArrayList<Platillos>();
		
		Platillos p14 = new Platillos("Naranja -------------", 30);
		Platillos p15 = new Platillos("Cacao ---------------", 50);
		
		listaPlatillosBebidas.add(p1);
		listaPlatillosBebidas.add(p2);
		
		System.out.println("5) Bebidas -------------------------------------|");
		for (int i = 0; i < listaPlatillosBebidas.size(); i++) {
			System.out.println("  "+(i+1+"- ")+listaPlatillosBebidas.get(i).getNombrePlatillo()+"----------- "+listaPlatillosBebidas.get(i).getPrecio() + " -----|");
		}
		System.out.println("6) Ver Factura ---------------------------------|");
		System.out.println("------------------------------------------------");
		
	}
	
	
	public static void entradas() {
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
	
	

}


