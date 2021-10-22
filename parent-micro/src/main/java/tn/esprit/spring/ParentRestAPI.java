package tn.esprit.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParentRestAPI {

	private String title = "Hello candidate service";
	@RequestMapping("/hello")
	public String  sayHello(){
		System.out.println(title);
		return title;
	}
}
