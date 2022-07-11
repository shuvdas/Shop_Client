package com.shops.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shops.dto.User;
import com.shops.repository.UserRepository;

@Component
@RestController
@RequestMapping(value = "/shopapp")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	@Autowired
	private UserRepository userRepo;

	@PostMapping(value = "/createuser")
	public ResponseEntity<?> createUser(@RequestBody User user){
		userRepo.save(user);
//		System.out.println("User is " + user);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
