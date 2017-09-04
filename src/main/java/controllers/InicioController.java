package controllers;

import model.SupermecadoModel;
import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class InicioController {
	public ModelAndView inicio(Request req, Response res){
		SupermecadoModel modelSuper = new SupermecadoModel();
		return new ModelAndView(modelSuper.getAll(), "inicio.hbs");
	}
}
