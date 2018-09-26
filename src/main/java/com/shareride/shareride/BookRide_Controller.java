package com.shareride.shareride;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookRide_Controller {
	@Autowired
	Offerride_Repo repo;

	//@GetMapping("/")
	@GetMapping("/bookride/{id}")
	@ResponseBody
	public String formInput(@MatrixVariable String id) {
		
		System.out.println("----------Book ride called ---------");
		System.out.println(id + "  ");
		
		
		// List<OfferRide_Pojo> findBySourceDest = repo.findBySourceDest();
		// StringBuffer sb = new StringBuffer();
		// for (OfferRide_Pojo offerRide_Pojo : findBySourceDest) {
		// sb.append(offerRide_Pojo.toString()+"\n");
		// }

		return "hello" + id + "";// +seats;
	}
}
