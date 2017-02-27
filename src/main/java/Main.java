import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class Main {

  public static void main(String[] args) {

    //port(Integer.valueOf(System.getenv("PORT")));
    port(8080);
    staticFileLocation("/public");

    get("/hello", (req, res) -> "Hello World1");

    post("/formulario", (req, res) -> req.queryParams("nombre2"));

    get("/formulario", (request, response) -> {
        //Map<String, Object> attributes = new HashMap<>();
        //attributes.put("message", "Hello World!");

        return new ModelAndView(null, "form.ftl");
    }, new FreeMarkerEngine());

    get("/", (request, response) -> {
        Map<String, Object> attributes = new HashMap<>();
        attributes.put("message", "Hello World!");

        return new ModelAndView(attributes, "index.ftl");
    }, new FreeMarkerEngine());


  }

}
