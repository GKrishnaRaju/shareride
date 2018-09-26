package com.shareride.shareride;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FindRide_Controller {
	@Autowired
	Offerride_Repo repo;

	StringBuffer sb;

	@PostMapping("/findride")
	@ResponseBody
	public String formInput(@RequestParam("source") String source, @RequestParam("destination") String destination)

	{
		System.out.println("--------" + source + "  " + destination);
		sb = new StringBuffer();
		List<OfferRide_Pojo> findBySourceDest = repo.findBySourceDest(source, destination);
		// return "hello"+findBySourceDest;
		for (Iterator iterator = findBySourceDest.iterator(); iterator.hasNext();) {
			OfferRide_Pojo offerRide_Pojo = (OfferRide_Pojo) iterator.next();
			Long offerId = offerRide_Pojo.getOfferId();
			String str = "<a href='/bookride/id=" + offerId + "'>" + offerId + "</a>";
			sb.append(str + "</br>");

		}

		// String s = "One";
		// String link="visit";
		return sb.toString();
		// "<a href='servlet2?uname="+n+"'>visit</a>");

	}
	// {
	// System.out.println(source+" "+destination);
	// List<OfferRide_Pojo> findBySourceDest =
	// repo.findBySourceDest(source,destination);
	// StringBuffer sb = new StringBuffer();
	// for (OfferRide_Pojo offerRide_Pojo : findBySourceDest) {
	// sb.append(offerRide_Pojo.toString()+"\n");
	// }
	//
	// return "hello"+sb.toString();
	//
	// }

	// @Query(
	// value = "SELECT * FROM USERS u WHERE u.status = 1",
	// nativeQuery = true)
	// Collection<User> findAllActiveUsersNative();

}
