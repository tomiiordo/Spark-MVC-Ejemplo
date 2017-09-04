package entities;

import java.util.LinkedList;
import java.util.List;

public class Venta {
	private List<Producto> productos;
	
	public Venta() {
		super();
		this.productos = new LinkedList<>();
	}

	public void addProducto(Producto producto){
		this.productos.add(producto);
	}
	
	@Override
	public String toString(){
		return "Ventas [Total:  " + this.monto().toString() + "]";
	}
	
	public Double monto(){
		return this.productos.stream().mapToDouble(producto->producto.getPrecio()).sum();
	}
	
}
