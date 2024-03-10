package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.Userservice;

@RestController
public class Usercontroller {

@Autowired	
private Userservice userservice;

@GetMapping("/getUserDetails")
public List<User>getUserDetails(){
	
	List<User> user12=userservice.getUserDetails();
	
	return user12;
}
	
	
	
	
	
	
	
	
	
	
	
	
}
