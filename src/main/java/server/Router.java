package server;

import controllers.InicioController;
import controllers.VentasController;
import spark.Spark;
import spark.template.handlebars.HandlebarsTemplateEngine;
import spark.utils.BooleanHelper;
import spark.utils.HandlebarsTemplateEngineBuilder;

public class Router {
	public static void configure(){
		HandlebarsTemplateEngine engine = HandlebarsTemplateEngineBuilder
				.create()
				.withDefaultHelpers()
				.withHelper("isTrue", BooleanHelper.isTrue)
				.build();

		Spark.staticFiles.location("/public");
		
		InicioController inicioController = new InicioController();
		VentasController ventasController = new VentasController();
		
		Spark.get("/", inicioController::inicio, engine);
		Spark.get("/ventas", ventasController::listarVentas, engine);
	}
}
