package entities;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Supermercado {
	private List<Venta> ventas;
	private String razonSocial;
	
	public Supermercado() {
		super();
		this.ventas = new LinkedList<>();
	}

	public void setRazonSocial(String nombre){
		this.razonSocial = nombre;
	}
	
	public String getRazonSocial(){
		return this.razonSocial;
	}
	
	public void addVenta(Venta venta){
		this.ventas.add(venta);
	}

	public List<Venta> getVentas() {
		return ventas;
	}

	public Venta getVentaById(int idVenta){
		return this.ventas.stream().filter(v->v.getId()==idVenta).collect(Collectors.toList()).get(0);
	}
}
