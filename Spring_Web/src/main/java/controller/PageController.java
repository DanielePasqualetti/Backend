package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {
	
	@GetMapping("/homepage")
	public @ResponseBody String stampaHomePage() {
		return "Prima pagina Spring web MVC";
	}
	
	@GetMapping("/about")
	public String stampaAboutPage() {
		return "LoremIpsumLoremIpsumLoremIpsumLoremIpsum";
	}
	
}
