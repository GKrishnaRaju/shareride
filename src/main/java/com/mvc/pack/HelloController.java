package com.mvc.pack;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController
{
	@RequestMapping("/index")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping("/hello")
	public String sayHello(@RequestParam("name") String name,Model model)
	{
		model.addAttribute("name", name);
		return "hello";
	}
}
