package com.s3corp.web.dao;

import java.util.List;

import com.s3corp.web.model.User;

public interface UserDao {

	public List<User> listUser();
	
	User findUser(long id);
	
	List<User> findUser(String name);
	
	void createUser(User user);
}
