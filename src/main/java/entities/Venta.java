package entities;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Venta {
	private List<Producto> productos;
	private Date fechaYhora;
	private Double monto;
	private String link;
	private int id;
	
	static int index = 0;
	
	public Venta() {
		super();
		this.productos = new LinkedList<>();
		this.fechaYhora = Calendar.getInstance().getTime();
		this.monto = 0.0;
		this.id = Venta.index;
		Venta.index++;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public int getId() {
		return id;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public void addProducto(Producto producto){
		this.productos.add(producto);
		this.sumarVenta(producto.getPrecio());
	}
	
	private void sumarVenta(Double precio){
		this.monto+=precio;
	}
	
	public Date getFechaYhora(){
		return this.fechaYhora;
	}

	public Double getMonto() {
		return monto;
	}
	
}
