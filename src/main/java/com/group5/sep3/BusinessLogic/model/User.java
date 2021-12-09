package com.group5.sep3.BusinessLogic.model;

public class User {
	private String username;
	private String password;
	private String role;
	private int securityLevel;

	public User(String username, String password, String role, int securityLevel) {
		this.username = username;
		this.password = password;
		this.role = role;
		this.securityLevel = securityLevel;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getSecurityLevel() {
		return securityLevel;
	}

	public void setSecurityLevel(int securityLevel) {
		this.securityLevel = securityLevel;
	}

	@Override
	public String toString() {
		return "User{" + "username = '" + username + '\'' + ", password = '" + password + '\'' + ", role = '" + role + '\'' + ", securityLevel = " + securityLevel + '}';
	}
}
