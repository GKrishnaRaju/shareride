package com.shareride.shareride;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ShareRideSignUpController {
	@Autowired
	SignUpRepo repo;

	@PostMapping("/signup")
	@ResponseBody
	public String sign(@RequestParam("email") String email, @RequestParam("psw") String psw,
			@RequestParam("pswrepeat") String pswrepeat) {
		repo.save(new SignUpPojo(email, psw, pswrepeat));
		return " successful";

	}

}
