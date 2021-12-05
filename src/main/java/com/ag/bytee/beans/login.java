package com.ag.bytee.beans;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class login {
	@NotEmpty(message="user shouldn't be empty")
private String user;
	@NotEmpty(message="password shouldn't be empy")
private String password;
private String role;


public login(String user, String password, String role) {
	super();
	this.user = user;
	this.password = password;
	this.role = role;
}

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}



public login() {
	super();
	// TODO Auto-generated constructor stub
}

public String getUser() {
	return user;
}
public void setUser(String user) {
	this.user = user;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}