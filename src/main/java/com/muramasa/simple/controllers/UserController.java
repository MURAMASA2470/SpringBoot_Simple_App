package com.muramasa.simple.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.muramasa.simple.models.User;
import com.muramasa.simple.services.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService users;

	@GetMapping("")
	public String index(Model model) {
		List<User> list = users.findAll();
		
		model.addAttribute("users", list);
		
		return "/users";
	}
	
	@GetMapping("/{id}")
	public String detail(Model model, @PathVariable Long id) {
		User user = users.findOne(id);
		
		model.addAttribute("user", user);
		
		return "/users/detail";
	}
	
}
