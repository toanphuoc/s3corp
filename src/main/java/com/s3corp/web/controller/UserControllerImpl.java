package com.s3corp.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.s3corp.web.model.User;
import com.s3corp.web.service.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserControllerImpl implements UserController{

	@Autowired
	private UserServiceImpl userService;
	
	@RequestMapping(value = "/getList", method = RequestMethod.GET)
	public ResponseEntity<List<User>> listAllUsers() {
		List<User> users= userService.findAllUsers();
		if(users.isEmpty()){
            return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}

	public ResponseEntity<User> getUser(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseEntity<List<User>> getUser(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public void createUser(String name, int age, double salary,
			UriComponentsBuilder ucBuilder) {
		// TODO Auto-generated method stub
		
	}

	
}
