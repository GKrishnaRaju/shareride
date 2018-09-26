package com.rest_client;

import org.springframework.web.client.RestTemplate;

public class FirstRestClientDemo {

	public static void main(String[] args) {
		 RestTemplate restTemplate = new RestTemplate();
		 final String uri = "http://localhost:8811/greeting";
	        // Send request with GET method and default Headers.
	        String result = restTemplate.getForObject(uri, String.class);
	 
	        System.out.println(result);
		
	}
}
