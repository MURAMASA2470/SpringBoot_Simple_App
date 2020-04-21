package com.muramasa.simple.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserListController {

	@Autowired
	private JdbcTemplate jdbc;

	@GetMapping("/users")
	public String index(Model model) {
		List<Map<String, Object>> list = jdbc.queryForList("SELECT * FROM users");
		
		model.addAttribute("users", list);
		
		return "/users";
	}
	
}
