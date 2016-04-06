package com.s3corp.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.s3corp.web.model.Role;
import com.s3corp.web.service.RoleService;

@RestController
@RequestMapping("/role")
public class RoleControllerImpl implements RoleController{

	@Autowired
	private RoleService roleService;
	
	@RequestMapping(value = "/getList", method = RequestMethod.GET)
	public List<Role> listRole() {
		return roleService.getList();
	}

}
