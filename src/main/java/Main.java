import entity.Libro;
import servicios.LibroMysqlFactory;
import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class Main {

  public static void main(String[] args) {

    //port(Integer.valueOf(System.getenv("PORT")));
    port(8080);
    staticFileLocation("/public");

    get("/hello", (req, res) -> "Hello " +
            "World");

    get("/resultados", (req, res) -> {
      Libro libro =  LibroMysqlFactory.obtener(req.queryParams("codigo"));
      Map<String, Object> attributes = new HashMap<>();
      attributes.put("libro", libro);
      return new ModelAndView(attributes, "resultados.ftl");
    }, new FreeMarkerEngine());

    /*get("/formulario", (request, response) -> {
        //Map<String, Object> attributes = new HashMap<>();
        //attributes.put("message", "Hello World!");

        return new ModelAndView(null, "form.ftl");
    }, new FreeMarkerEngine());*/

      get("/formulario", (request, response) -> {
          //Map<String, Object> attributes = new HashMap<>();
          //attributes.put("message", "Hello World!");

          return new ModelAndView(null, "form.ftl");
      }, new FreeMarkerEngine());


    /*get("/", (request, response) -> {
        Map<String, Object> attributes = new HashMap<>();
        attributes.put("message", "Hello World!");

        return new ModelAndView(attributes, "index.ftl");
    }, new FreeMarkerEngine());*/


  }

}
