package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.Userrepository;

@Service
public class UserserviceImpl implements Userservice{

@Autowired	
private Userrepository userrepository;

	


	@Override
	public List<User> getUserDetails() {
		List<User> user11	=userrepository.findAll();
		return user11;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
