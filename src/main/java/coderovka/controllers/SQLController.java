package coderovka.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SQLController {
	
	@GetMapping("/SQL/PostgreSQL/mainpostgresql")
	public String mainpostgresql(Model model) {
		model.addAttribute("title", "PostgreSQL");
		return "SQL/PostgreSQL/mainpostgresql";
	}
	
	@GetMapping("/SQL/PostgreSQL/installation")
	public String installationPostgreSQL(Model model) {
		model.addAttribute("title", "Установка PostgreSQL");
		return "SQL/PostgreSQL/installation";
	}
	
	
	
	
}
