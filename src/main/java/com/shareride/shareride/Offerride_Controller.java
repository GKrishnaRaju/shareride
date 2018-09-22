package com.shareride.shareride;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
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
	public String formInput(@RequestParam("source") String source,
			@RequestParam("destination") String destination,
			@RequestParam("localDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)LocalDate localDate,
			@RequestParam("localTime") @DateTimeFormat(iso = DateTimeFormat.ISO.TIME) LocalTime localTime,
			@RequestParam("stopOver") String stopOver,
			@RequestParam("noOfSeats") long noOfSeats,
			@RequestParam("max2seat") long max2seat,
			@RequestParam("rideDetails") String rideDetails,
			@RequestParam("termAndcon") String termAndcon)
	{
		repo.save(new OfferRide_Pojo(source, destination, localDate, localTime, stopOver, noOfSeats, max2seat, rideDetails, termAndcon));
		return "hello";

	}

}
