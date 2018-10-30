package com.example.postgreDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.postgreDemo.domain.Domain;
import com.example.postgreDemo.service.UserService;

@RestController
@RequestMapping("/api/v1")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/hi", method=RequestMethod.GET)
	public void hello() {
		System.out.println("hello, Working!!");
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public  Domain saveUser(@RequestBody Domain domain) {
	return userService.save(domain);
		
	}
	@RequestMapping(value = "/users", method = RequestMethod.GET)

	public ResponseEntity<List<Domain>> getAllUsers() {
		List<Domain> userList = userService.getAll();
		return new ResponseEntity<List<Domain>>(userList, HttpStatus.OK);
	}
}


// Get all the movies the data from database 


