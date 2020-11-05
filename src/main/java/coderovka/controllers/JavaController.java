package coderovka.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JavaController {
	
	@GetMapping("/JavaPage/ApacheCamel/ApacheCamelHome")
	public String apacheCamel(Model model) {
		model.addAttribute("title", "Apache Camel");
		return "JavaPage/ApacheCamel/ApacheCamelHome";
	}
	
	@GetMapping("/JavaPage/ApacheCamel/WorkWithZipAndXML/WorkWithZipAndXML")
	public String workWithZapAndXML(Model model) {
		model.addAttribute("title", "Работа с Zip и XML файлами");
		return "JavaPage/ApacheCamel/WorkWithZipAndXML/WorkWithZipAndXML";
	}
	
	@GetMapping("/JavaPage/CreatingSite/adressinuse/adressinuse")
	public String adressinuse(Model model) {
		model.addAttribute("title", "adressinuse");
		return "JavaPage/CreatingSite/adressinuse/adressinuse";
	}
	
	@GetMapping("/JavaPage/CreatingSite/WorkWithEclipse/WorkWithEclipse")
	public String workWithEclipse(Model model) {
		model.addAttribute("title", "Работа с Eclipse");
		return "JavaPage/CreatingSite/WorkWithEclipse/WorkWithEclipse";
	}
	
	
}


