package com.muramasa.simple.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.muramasa.simple.repositories.UserRepository;
import com.muramasa.simple.models.User;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepos;

	public List<User> findAll() {
		return userRepos.findAll();
	}
	
	public User findOne(Long id) {
		return userRepos.findById(id).orElseGet(null);
	}

}
