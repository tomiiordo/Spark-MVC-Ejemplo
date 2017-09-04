package controllers;

import model.SupermecadoModel;
import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class VentasController {

	public ModelAndView listarVentas(Request req, Response res){
		SupermecadoModel modelSuper = new SupermecadoModel();
		return new ModelAndView(modelSuper.getAll(), "ventas.hbs");
	}
}
