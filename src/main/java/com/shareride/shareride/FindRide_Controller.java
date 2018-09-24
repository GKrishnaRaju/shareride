package com.shareride.shareride;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FindRide_Controller {
	@Autowired
	Offerride_Repo repo;

	@PostMapping("/findride")
	@ResponseBody
	public String formInput(@RequestParam("source") String source,
			@RequestParam("destination") String destination)
	{
		System.out.println(source+"  "+destination);
		return "hello";

	}

}
