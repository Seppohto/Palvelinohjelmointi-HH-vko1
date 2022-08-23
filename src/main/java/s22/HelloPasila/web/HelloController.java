package s22.HelloPasila.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("index")
	@ResponseBody
	public String sayIndex() {
		return "This is the main page";
	}
	
	@RequestMapping("contact")
	@ResponseBody
	public String sayContact() {
		return "This is the contact page";
	}
	
	@RequestMapping("hello")
	@ResponseBody
	public String sayHelloLocationName(@RequestParam(name="location", required=false, defaultValue="Moon") String location, 
			@RequestParam(name="name") String name) {
		return "Welcome to the "+ location +" " + name +"!";
	}
	
	@RequestMapping("alku")
	@ResponseBody
	public String sayHello() {
		return "Hei vaan!";
	}
	
	@RequestMapping("moikkaa")
	@ResponseBody
	public String sayHelloToSomeone(@RequestParam(name="nimesi", required=false, defaultValue="Muumi") String nimi, 
			@RequestParam(name="ika") int age) {
		return "Hei " + nimi + " " + age + " vuotta.";
	}

}
