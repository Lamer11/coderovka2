package coderovka.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("title", "coderovka.ru");
		return "home";
	}
	
	@GetMapping("/JavaPage/JavaHome")
	public String javaHome(Model model) {
		model.addAttribute("title", "Java");
		return "JavaPage/JavaHome";
	}
	
	@GetMapping("/Android/AndroidHome")
	public String androidHome(Model model) {
		model.addAttribute("title", "Android");
		return "Android/AndroidHome";
	}
	
	@GetMapping("/SAS/SASHome")
	public String sasHome(Model model) {
		model.addAttribute("title", "SAS Home");
		return "SAS/SASHome";
	}
	
	@GetMapping("/SQL/SQLHome")
	public String sqlHome(Model model) {
		model.addAttribute("title", "SQL");
		return "SQL/SQLHome";
	}
	
	@GetMapping("/English/EnglishHome")
	public String englishHome(Model model) {
		model.addAttribute("title", "English");
		return "English/EnglishHome";
	}
	 
	@GetMapping("/Others/OthersHome")
	public String others(Model model) {
		model.addAttribute("title", "Other");
		return "Others/OthersHome";
	}
	
	@GetMapping("/aboutme")
	public String aboutme(Model model) {
		model.addAttribute("title", "aboutme");
		return "aboutme";
	}
	
	
}

