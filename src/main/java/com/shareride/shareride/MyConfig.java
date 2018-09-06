package com.shareride.shareride;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.util.UrlPathHelper;

@Configuration
public class MyConfig extends WebMvcConfigurerAdapter  {
	public void configurePathMatch(PathMatchConfigurer configurer) {
		  System.out.println("$$$$$$$$$$$$$$$$$$$$$=========");
		  UrlPathHelper pathHelper = new UrlPathHelper();
		  //Enable matrix variable
		  pathHelper.setRemoveSemicolonContent(false);
		  configurer.setUrlPathHelper(pathHelper);
		}
}
