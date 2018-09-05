package com.shareride.shareride;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("thought")
public class SingleFieldController {

	@RequestMapping(value="/single-field",method=RequestMethod.GET)
	public ModelAndView singleFieldPage() {
		return new ModelAndView("single-field-page");
	}
	
	@RequestMapping(value="/remember")	
	public ModelAndView rememberThought(@RequestParam String thoughtParam) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("thought", thoughtParam);
		modelAndView.setViewName("single-field-page");
		return modelAndView;
	}
	
}