package com.tradingapp.tradingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tradingapp.tradingapp.model.User;
import com.tradingapp.tradingapp.repository.UserRepository;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	private UserRepository userRepository;

	
	@Autowired
	public AuthController(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	
	@PostMapping("/signup")
	public ResponseEntity<User> register(@RequestBody User user) {
		
		System.out.println("recived user is "+user.toString());
		
	 	userRepository.save(user);
		
		return new ResponseEntity<>(user,HttpStatus.CREATED);
	}
	
}
