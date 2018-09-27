package com.shareride.shareride;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookRide_Test_Contoller {
	@Autowired
	Offerride_Repo repo;
	Long remainingSeats;
	boolean flag;
	@RequestMapping("/bookride/{offerid}/book/{noofseat}")
	public void bookride(@MatrixVariable("offerid") Long offerid,@MatrixVariable("noofseat") Long noOfSeat)
	{
		System.out.println(offerid+"	"+noOfSeat);
		System.out.println("hello world");
		OfferRide_Pojo bookRide = repo.bookRideOne(offerid);
		System.out.println(bookRide.getNoOfSeats());
		long availableSeats = bookRide.getNoOfSeats();
		if(noOfSeat<=availableSeats)
		{
			 remainingSeats = availableSeats-noOfSeat;
			repo.bookRideTwo(offerid, remainingSeats);
		}
		if(remainingSeats<=0)
		{
			flag=true;
			repo.bookridesetseatsfilled(offerid, flag);
		}
		
		System.out.println(bookRide);
		//return bookRide.toString();
	}

}
