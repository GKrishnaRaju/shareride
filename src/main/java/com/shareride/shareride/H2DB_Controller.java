package com.shareride.shareride;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class H2DB_Controller {
	
	@Autowired
	StudentRepository repository1;

	@GetMapping("/showh2")
	@ResponseBody

	public String welcomeUser() {
		
		StudentRepository repository = repository1;
		//repository.
		repository.save(new Student("John", "A1234657"));
		repository.save(new Student("srikanth", "ABCD"));
		repository.save(new Student("Prashant", "B889898"));
		
		
		return ""+repository.findAll();//+"aaaaaaaaaaaaaaaa";
	}
}
