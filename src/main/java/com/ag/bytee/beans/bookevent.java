package com.ag.bytee.beans;

import java.util.Date;

public class bookevent {
private Long bookingid;
private String name;
private String emailid;
private Date fdate;
private Date tdate;
private String place;
private String eventname;
private Double cost;
private Double tax;
private Long phno;
private Double total;
public Double getTotal() {
	return total;
}
public void setTotal(Double total) {
	this.total = total;
}
public bookevent(Long bookingid, String name, String emailid, Date fdate, Date tdate, String place, String eventname,
		Double cost, Double tax, Long phno,Double total) {
	super();
	this.bookingid = bookingid;
	this.name = name;
	this.emailid = emailid;
	this.fdate = fdate;
	this.tdate = tdate;
	this.place = place;
	this.eventname = eventname;
	this.cost = cost;
	this.tax = tax;
	this.phno = phno;
	this.total=total;
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

public bookevent(Long phno) {
	super();
	this.phno = phno;
}
public Long getPhno() {
	return phno;
}
public void setPhno(Long phno) {
	this.phno = phno;
}
public bookevent() {
	super();
	// TODO Auto-generated constructor stub
}
public Long getBookingid() {
	return bookingid;
}
public void setBookingid(Long bookingid) {
	this.bookingid = bookingid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getPlace() {
	return place;
}
public void setPlace(String place) {
	this.place = place;
}
public String getEventname() {
	return eventname;
}
public void setEventname(String eventname) {
	this.eventname = eventname;
}
public Double getCost() {
	return cost;
}
public void setCost(Double cost) {
	this.cost = cost;
}
public Double getTax() {
	return tax;
}
public void setTax(Double tax) {
	this.tax = tax;
}

}
