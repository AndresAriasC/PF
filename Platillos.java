package proyectorestaurante;

public class Platillos{
	
	private String nombrePlatillo;
	private double precio;
	
	public Platillos() {}
	
	public Platillos(String nombrePlatillo, double precio) {
		
		this.nombrePlatillo = nombrePlatillo;
		this.precio = precio;
	}

	public String getNombrePlatillo() {
		return nombrePlatillo;
	}

	public void setNombrePlatillo(String nombrePlatillo) {
		this.nombrePlatillo = nombrePlatillo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {

		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Platillos [nombrePlatillo=" + nombrePlatillo + ", precio=" + precio + "]";
	}
	
	
	
	
}
