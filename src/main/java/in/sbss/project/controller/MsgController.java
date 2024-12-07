package in.sbss.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {
	
	@GetMapping("/contact")
	public String getContact() {
		return "+91 7724908390";
	}
	
	
	@GetMapping("/hi")
	public String sayHi() {
		return "Hii , How are you";
	}
	
	@GetMapping("/welcome")
	public String getWelcome() {
		return "Welcome, to tech world ";
	}


}
