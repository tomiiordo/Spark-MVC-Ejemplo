package model;

import java.util.LinkedList;
import java.util.List;

import entities.*;

public class SupermecadoModel {
	private List<Supermercado> supermercados;

	public SupermecadoModel() {
		this.supermercados = new LinkedList<>();
	}
	
	public void boot(){
		Producto desodorante = new Producto(66.0,"Desodorante Rexona");
		Producto salchichas = new Producto(15.0, "Salchichas");
		Producto gaseosa = new Producto(45.5, "Coca 2L");
		Producto dentrifico = new Producto(50.2, "Colgate");
		Producto jugo = new Producto(5.5, "Jugo en sobre");
		Producto escoba = new Producto(70.3, "Escoba");
		Producto galletitas = new Producto(19.5, "Galletitas");
		
		Venta venta1 = new Venta();
		venta1.addProducto(desodorante);
		venta1.addProducto(dentrifico);
		
		Venta venta2 = new Venta();
		venta2.addProducto(gaseosa);
		venta2.addProducto(jugo);
		
		Venta venta3 = new Venta();
		venta3.addProducto(salchichas);
		
		Venta venta4 = new Venta();
		venta4.addProducto(escoba);
		venta4.addProducto(galletitas);
		
		Supermercado supermarket1 = new Supermercado();
		supermarket1.setRazonSocial("Coto");
		supermarket1.addVenta(venta1);
		
		Supermercado supermarket2 = new Supermercado();
		supermarket2.setRazonSocial("Dia");
		supermarket2.addVenta(venta2);
		
		Supermercado supermarket3 = new Supermercado();
		supermarket3.setRazonSocial("Carrefour");
		supermarket3.addVenta(venta3);
		supermarket3.addVenta(venta4);
		
		this.addSupermercado(supermarket1);
		this.addSupermercado(supermarket2);
		this.addSupermercado(supermarket3);
		
	}
	
	public void addSupermercado(Supermercado supermercado){
		this.supermercados.add(supermercado);
	}
	
	public List<Supermercado> getAll(){
		return this.supermercados;
	}
}
