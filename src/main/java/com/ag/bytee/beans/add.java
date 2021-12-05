package com.ag.bytee.beans;

import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;

import java.lang.*;
import java.math.BigInteger;
public class add {
	@NotEmpty(message="eventname must be fill")
private String eventname;
	@NotEmpty(message="address must be fill")
private String address;
	@NotEmpty(message="from must be fill")
private Date fdate;
	@NotEmpty(message="to date must be fill")
private Date tdate;
	@NotEmpty(message="cost must be fill")
private Double cost;
public add() {
	super();
	// TODO Auto-generated constructor stub
}
public add(String eventname, String address, Date fdate, Date tdate, Double cost) {
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
public Date getFdate() {
	return fdate;
}
public void setFdate(Date fdate) {
	this.fdate = fdate;
}
public Date getTdate() {
	return tdate;
}
public void setTdate(Date tdate) {
	this.tdate = tdate;
}
public Double getCost() {
	return cost;
}
public void setCost(Double cost) {
	this.cost = cost;
}

}
