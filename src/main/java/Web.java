import static spark.Spark.*;

import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

public class Web {
	public static void main(String[] args) {
		get("/", (req, res) -> {
			Map<String, Object> attributes = new HashMap<>();
			attributes.put("message", "Welcome to the daily generated r/leagueoflegends youtube playlist!");

			return new ModelAndView(attributes, "index.ftl");
		}, new FreeMarkerEngine());
	}
}