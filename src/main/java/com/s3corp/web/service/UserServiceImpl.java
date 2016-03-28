package com.s3corp.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.s3corp.web.dao.UserDao;
import com.s3corp.web.model.User;

public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	public User findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveUser(String name, int age, double salary) {
		// TODO Auto-generated method stub
		
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public void deleteUserById(long id) {
		// TODO Auto-generated method stub
		
	}

	public List<User> findAllUsers() {
		return userDao.listUser();
	}

	public void deleteAllUsers() {
		// TODO Auto-generated method stub
		
	}

	public boolean isUserExist(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
