package com.ag.bytee.beans;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import java.lang.*;
import java.math.BigInteger;
public class addbeans {
	@NotEmpty(message="eventname must be fill")
private String eventname;
	@NotEmpty(message="eaddress must be fill")
private String address;
	@NotEmpty(message="from must be fill")
private String fdate;
	@NotEmpty(message="to date must be fill")
private String tdate;
	@NotEmpty(message="cost must be fill")
private Double cost;
public addbeans() {
	super();
	// TODO Auto-generated constructor stub
}
public addbeans(String eventname, String address, String fdate, String tdate, Double cost) {
	super();
	this.eventname = eventname;
	this.address = address;
	this.fdate = fdate;
	this.tdate = tdate;
	this.cost = cost;
}
public String getEventname() {
	return eventname;
}
public void setEventname(String eventname) {
	this.eventname = eventname;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getFdate() {
	return fdate;
}
public void setFdate(String fdate) {
	this.fdate = fdate;
}
public String getTdate() {
	return tdate;
}
public void setTdate(String tdate) {
	this.tdate = tdate;
}
public Double getCost() {
	return cost;
}
public void setCost(Double cost) {
	this.cost = cost;
}

}

