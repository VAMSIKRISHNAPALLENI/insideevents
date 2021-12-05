package com.ag.bytee.beans;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class register {
@NotEmpty(message="enter valid name")
@Size(min=4,max=10,message="enter the 4-10 length")
	private String first;
@NotEmpty(message="enter valid name")
@Size(min=4,max=10,message="enter the 4-10 length")
private String last;
@NotEmpty(message="enter valid email")
@Email(message="enter the correct email")
private String email;
@NotEmpty(message="enter valid password")
@Size(min=6,max=10,message="enter the 6-10 characters")
private String password;
private String role;
public register(String first, String last, String email, String password, String role) {
	super();
	this.first = first;
	this.last = last;
	this.email = email;
	this.password = password;
	this.role = role;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public register() {
	super();
}
public String getFirst() {
	return first;
}
public void setFirst(String first) {
	this.first = first;
}
public String getLast() {
	return last;
}
public void setLast(String last) {
	this.last = last;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


}
