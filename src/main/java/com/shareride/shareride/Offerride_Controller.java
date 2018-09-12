package com.shareride.shareride;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Offerride_Controller {
	@Autowired
	Offerride_Repo repo;

	@PostMapping("/saveride")
	@ResponseBody
	public String formInput(@RequestParam String source, @RequestParam String destination,
			@RequestParam String stopOver, @RequestParam long noOfSeats, @RequestParam long max2seat,
			@RequestParam String rideDetails, @RequestParam String termAndcon) {
		repo.save(new OfferRide_Pojo(source, destination, stopOver, noOfSeats, max2seat, rideDetails, termAndcon));
		return "hello";

	}

}
