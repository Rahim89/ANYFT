package com.anyft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.anyft.Beans.Login;

@Controller
@RequestMapping(value="/registration", method=RequestMethod.POST)
public class HomeController {
	@RequestMapping("/")
	public ModelAndView welcome(@ModelAttribute("Login") Login log) {
		
		ModelAndView mav = new ModelAndView("Login");
		
		return mav;
		
	}

}
