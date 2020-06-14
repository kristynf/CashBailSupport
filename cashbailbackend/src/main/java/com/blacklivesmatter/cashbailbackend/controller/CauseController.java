package com.blacklivesmatter.cashbailbackend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CauseController {

	@GetMapping("/causes")
	public String showCauses() {
		return "causes";
	}
}
