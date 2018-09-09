package com.shareride.shareride;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Insert_Into_DB_Controller {
	
	@Autowired
	StudentRepository repository1;

	@PostMapping("/insertdb")
	@ResponseBody

	public String welcomeUser(@RequestParam Long id ,@RequestParam String  name,@RequestParam String passportNumber) {
		
		StudentRepository repository = repository1;
		//repository.
		repository.save(new Student(name,passportNumber));
		//repository.save(new Student("srikanth", "ABCD"));
		//repository.save(new Student("Prashant", "B889898"));
		
		
		return "Saved "+name+" "+passportNumber+"";//repository.findAll();//+"aaaaaaaaaaaaaaaa";
	}
}
