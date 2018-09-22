/*package com.shareride.shareride;


import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Offerride_Controller_Test {
	@Autowired
	Offerride_Repo repo;

	@RequestMapping(value ="saveride_test",method=RequestMethod.POST  )
	 @ResponseBody
	 public String formInput(@RequestParam("from") String source, @RequestParam("to") String
	 destination,
	 @RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate  dateAndTime,
	 @RequestParam("stopOver") String stopOver, @RequestParam("noOfSeats") long noOfSeats, @RequestParam
	 long max2seat,
	 @RequestParam("rideDetails") String rideDetails, @RequestParam("termAndcon") String termAndcon) {
		 
		 
	 System.out.println("Test save ride called -------------------");
	 repo.save(new OfferRide_Pojo(source, destination, dateAndTime, stopOver, noOfSeats, max2seat, rideDetails, termAndcon));
	 //System.out.println("---------------called -------------");
	 return "hello";
	
	 }
//	@PostMapping("/saveride_test")
//	@ResponseBody
//	public String formInput() {
//		System.out.println("Hello");
//		return "hello";
//
//	}
	@RequestMapping( value = "testdate", method = RequestMethod.POST)
    public void processDate(@RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        System.out.println("Processing date: {}"+date);
        //dateTimeService.processDate(date);
    }
	//@DateTimeFormat(pattern = "dd.MM.yyyy", iso = DateTimeFormat.ISO.DATE)	 LocalDateTime dateAndTime
}
*/