package com.blacklivesmatter.cashbailbackend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@GetMapping("/")
	public ModelAndView home() {
		return new ModelAndView("index");
	}

	@RequestMapping("/base")
	public String base(){
		return "base";
	}

	@RequestMapping("/index")
	public String index(){
		return "index";
	}
}
