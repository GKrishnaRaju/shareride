package com.shareride.shareride;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
	private static final String welcomemsg = "Welcome Mr. %s!";

	@PostMapping("/welcome/user")
	@ResponseBody

	public Welcome welcomeUser(@RequestParam(name = "name", required = false, defaultValue = "Java Fan") String name) {
		return new Welcome(name);
	}

	@GetMapping("/aa/{ss}")
	@ResponseBody
	public Welcome Hello( @MatrixVariable("ss") String ss) {
	//public Welcome Hello() {
		
		Logger logger = LoggerFactory.getLogger(this.getClass());
		logger.info("HELLO FROM LOGGER ");
		return new Welcome("vsssvsand"+ss);

	}
	
	@GetMapping("/user/{name}")
	   @ResponseBody
	   public String handler(@MatrixVariable("name") String name) {

	      return "Matxrix variable <br> "
	            + "name =" + name;
	   }

}