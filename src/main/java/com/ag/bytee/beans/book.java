package com.ag.bytee.beans;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class book {
	@NotNull(message="name shouldn't be empty")
 private String name;
	@Email(message="enter the valid email")
 private String email;
	@NotEmpty(message="phone number shouldn't be empty")
 private String phno;
 
public book() {
	super();
	// TODO Auto-generated constructor stub
}
public book(String name, String email, String phno) {
	super();
	this.name = name;
	this.email = email;
	this.phno = phno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhno() {
	return phno;
}
public void setPhno(String phno) {
	this.phno = phno;
}
 
	
}
