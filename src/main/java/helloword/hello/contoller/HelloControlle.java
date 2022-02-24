package helloword.hello.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello")
public class HelloControlle {
	
	@GetMapping
	public String hello() {
		
		return "Hello Gen!";
		
	}
 

}
