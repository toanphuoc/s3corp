package com.s3corp.web.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.s3corp.web.model.Role;

public class RoleDaoImpl implements RoleDao{

	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Role> getList() {
		String hql = "FROM Role";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}
}
