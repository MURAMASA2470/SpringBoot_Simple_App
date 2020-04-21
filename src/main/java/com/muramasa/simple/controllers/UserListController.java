package com.muramasa.simple.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserListController {

	@GetMapping("/users")
	public String index(Model model) {
		return "/users";
	}
	
}
