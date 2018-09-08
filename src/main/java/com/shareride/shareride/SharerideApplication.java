package com.shareride.shareride;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScan(value="com.login.pack")
@ComponentScans(value = { @ComponentScan })
public class SharerideApplication {

	public static void main(String[] args) {
		SpringApplication.run(SharerideApplication.class, args);
	}
}
