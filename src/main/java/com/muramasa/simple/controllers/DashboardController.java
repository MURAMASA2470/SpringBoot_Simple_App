package com.muramasa.simple.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

	public DashboardController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/dashboard")
	public String index() {
		return "/dashboard";
	}

}
