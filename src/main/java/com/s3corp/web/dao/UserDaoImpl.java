package com.s3corp.web.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
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
		String hsql = "SELECT e.user_id, e.name, e.age, e.salary, e.username FROM User e INNER JOIN Role r ON r.role_id = e.role_id AND r.role_id = :roleId";
		SQLQuery query = sessionFactory.getCurrentSession().createSQLQuery(hsql);
		query.setParameter("roleId", 1).setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
//		Query query = sessionFactory.getCurrentSession().createQuery(hsql).setParameter("roleId", 1);
		return query.list();
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public User findUser(long id) {
		String hql = "FROM User WHERE user_id = :id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("id", id);
		List<User> users = query.list();
		if(users.size() == 1)
			return (User) users.get(0);
		return null;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<User> findUser(String name) {
		String hql = "FROM User where str(name) LIKE :name";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("name", name + "%");
		return query.list();
	}

	public void createUser(User user) {
		// TODO Auto-generated method stub
		
	}

}
