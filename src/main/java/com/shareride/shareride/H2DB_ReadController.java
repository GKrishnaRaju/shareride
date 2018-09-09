package com.shareride.shareride;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class H2DB_ReadController {
	
	@Autowired
	StudentRepository repository1;

	@GetMapping("/show_data")
	@ResponseBody

	public String welcomeUser() {
		
		StudentRepository repository = repository1;
		
		
		return ""+repository.findAll();//+"aaaaaaaaaaaaaaaa";
	}
}
