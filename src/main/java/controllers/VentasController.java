package controllers;

import java.util.HashMap;
import java.util.Map;

import entities.Supermercado;
import entities.Venta;
import model.SupermecadoModel;
import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class VentasController {
	private Map<String, Object> model=new HashMap<>();
	
	public ModelAndView listarVentas(Request req, Response res){
		SupermecadoModel modelSuper = SupermecadoModel.getInstance();
		String supermercadoBuscado = req.queryParams("nombreSupermercado");
		Supermercado supermercado = modelSuper.get(supermercadoBuscado);
		model.put("supermercado", supermercado);
		model.put("ventas", supermercado.getVentas());
		return new ModelAndView(model, "ventas.hbs");
	}
	
	public ModelAndView verdetalleVenta(Request req, Response res){
		SupermecadoModel modelSuper = SupermecadoModel.getInstance();
		String supermercadoBuscado = req.queryParams("nombreSupermercado");
		String ventaId = req.queryParams("idVenta");
		Venta venta = modelSuper.getVenta(supermercadoBuscado, new Integer(ventaId));
		
		model.clear();
		model.put("venta", venta);
		model.put("productos", venta.getProductos());
		return new ModelAndView(model, "detalleVenta.hbs");
	}
	
	public ModelAndView verdetalleVenta2(Request req, Response res){
		SupermecadoModel modelSuper = SupermecadoModel.getInstance();
		String market = req.params(":supermercado");
		int idVenta = Integer.parseInt(req.params(":venta"));
		
		Venta venta = modelSuper.getVenta(market, idVenta);
		model.clear();
		model.put("venta", venta);
		model.put("productos", venta.getProductos());
		return new ModelAndView(model, "detalleVenta.hbs");
	}
}
