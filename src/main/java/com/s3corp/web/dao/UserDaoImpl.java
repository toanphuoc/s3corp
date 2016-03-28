package com.s3corp.web.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.s3corp.web.model.User;

public class UserDaoImpl implements UserDao{
	
	private SessionFactory sessionFactory;

	public UserDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<User> listUser() {
		String hsql = "FROM User";
		Query query = sessionFactory.getCurrentSession().createQuery(hsql);
		return query.list();
	}

	public User findUser(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findUser(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public void createUser(User user) {
		// TODO Auto-generated method stub
		
	}

}
