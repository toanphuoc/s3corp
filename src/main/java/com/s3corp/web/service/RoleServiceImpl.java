package com.s3corp.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.s3corp.web.dao.RoleDao;
import com.s3corp.web.model.Role;

public class RoleServiceImpl implements RoleService{

	@Autowired
	private RoleDao roleDao;
	
	public List<Role> getList() {
		return roleDao.getList();
	}
}
