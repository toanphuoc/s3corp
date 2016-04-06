package com.s3corp.web.model;

import java.util.Set;

public class Role {

	private int roleId;
	
	private String roleName;

	private Set<User> users;
	
	public Role(){
		
	}
	
	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}
	
	@Override
	public String toString(){
		return "Role[id = " + roleId + ", roleName = " + roleName + "]";
	}
	
}
