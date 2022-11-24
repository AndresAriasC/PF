package proyectorestaurante;

public class Mesa {
	private String mesaLibre;
	private String codigo;
	private int numMesa;
	
	
	
	
	public int getnumMesa() {
		return numMesa;
	}
	public void setnumMesa(int mesa) {
		this.numMesa = mesa;
	}
	public String getMesaLibre() {
		return mesaLibre;
	}
	public void setMesaLibre(String mesaLibre) {
		this.mesaLibre = mesaLibre;
	}


	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	
	public void generarNumero() {
		int alea = 0;
		alea = (int) Math.random() * 20;
		System.out.println("No. Mesa: " + alea);
	}
	

	@Override
	public String toString() {
		generarNumero();
		return "Mesa disponible: " + mesaLibre + ", Codigo de mesa: " + codigo + ".";
	}
	
	
	
	
	
}
