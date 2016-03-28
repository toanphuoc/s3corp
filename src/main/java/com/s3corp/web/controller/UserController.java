package com.s3corp.web.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.util.UriComponentsBuilder;

import com.s3corp.web.model.User;

public interface UserController {

	public ResponseEntity<List<User>> listAllUsers();
	
	public ResponseEntity<User> getUser(long id);
	
	public ResponseEntity<List<User>> getUser(String name);
	
	public void createUser(String name, int age, double salary, UriComponentsBuilder ucBuilder);
}
