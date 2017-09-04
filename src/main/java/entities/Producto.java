package entities;

public class Producto {
	private Double precio;
	private String nombre;

	public Producto(Double precio,String nombre) {
		super();
		this.precio = precio;
	}

	public Double getPrecio() {
		return precio;
	}
	
}
