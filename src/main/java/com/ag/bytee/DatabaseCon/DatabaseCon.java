package com.ag.bytee.DatabaseCon;

import org.apache.taglibs.standard.lang.jstl.BooleanLiteral;
import org.hibernate.Query;
import org.hibernate.Session;
import java.lang.NullPointerException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.ag.bytee.beans.Deletedates;
import com.ag.bytee.beans.add;
import com.ag.bytee.beans.addbeans;
import com.ag.bytee.beans.book;
import com.ag.bytee.beans.bookevent;
import com.ag.bytee.beans.register;
import com.ag.bytee.beans.searcheventresult;
import com.ag.bytee.util.HibernateUtil;
import com.ag.bytee.beans.login;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class DatabaseCon {
 public String register(com.ag.bytee.beans.register reg)
 {
	 Session session =com.ag.bytee.util.HibernateUtil.getSessionFactory().openSession();
	 session.beginTransaction();
	com.ag.bytee.beans.register res=new com.ag.bytee.beans.register();
	 res.setFirst(reg.getFirst());
	 res.setLast(reg.getLast());
	 res.setEmail(reg.getEmail());
	 res.setPassword(reg.getPassword());
	 res.setRole(reg.getRole());
	 try
	 {
		 session.save(res);
		 session.getTransaction().commit();
		 //System.out.println("success");
		 return "success";
	 }
	 catch (Exception e)
	 {
		// System.out.println("failure");
		 return "failure";
		 
	 }
	 
 }
 public register userLogin(com.ag.bytee.beans.register req)
 	{
	 Session session=com.ag.bytee.util.HibernateUtil.getSessionFactory().openSession();
	 session.beginTransaction();
	String querystring=" from register as r where r.first=:first and r.last=:last and r.email=:email and r.password=:password";
 	Query query=session.createQuery(querystring);
 	query.setParameter("first",req.getFirst());
 	query.setParameter("last",req.getLast());
 	query.setParameter("email",req.getEmail());
 	query.setParameter("password",req.getPassword());
 	Object qr=query.uniqueResult();
 	register li = (register)qr;
 	session.getTransaction().commit();
 	return li;
 	}  
 public String userCheck(com.ag.bytee.beans.login req)
	{
	 Session session =com.ag.bytee.util.HibernateUtil.getSessionFactory().openSession();
	 session.beginTransaction();
	 //System.out.println("i am here");
	String querystring=" from login as r where r.user=:first and r.password=:password and r.role=:role";
	Query query=session.createQuery(querystring);
	query.setParameter("first",req.getUser());
	query.setParameter("password",req.getPassword());
	query.setParameter("role", req.getRole());
	Object qr=query.uniqueResult();
	login li = (login)qr;
	session.getTransaction().commit();
	if(null==li||"null".equals(li.getUser())||"null"==li.getUser())
	{
		//System.out.println("i am done in check");
		return "failure";
	}
	else if("admin".equals(li.getRole()))
		{
		return "admin";
		}
	else if("user".equals(li.getRole()))
		{
		return "user";
		}
	else
	{
	return "failure";
	}
 }
 public String addput(com.ag.bytee.beans.addbeans ad)
 { 
		//System.out.println("hey i am checking ");
	 Session session=com.ag.bytee.util.HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		Date d1=new Date();
		Date d2=new Date();
		try {
			d1=new SimpleDateFormat("yyyy-MM-dd").parse(ad.getFdate());
			d2=new SimpleDateFormat("yyyy-MM-dd").parse(ad.getTdate());
			
		} 
		catch (ParseException e1) {
			// TODO Auto-generated catch block
			//System.out.println("qwertyui");
			e1.printStackTrace();
		}
		com.ag.bytee.beans.add ca=new com.ag.bytee.beans.add() ;
		ca.setFdate(d1);
		ca.setTdate(d2);
		//System.out.println(ca.getFdate());
		//System.out.println(ca.getTdate());
		ca.setAddress(ad.getAddress());
		ca.setEventname(ad.getEventname());
		ca.setCost(ad.getCost());
		//System.out.println(ca.getCost());
		//ca.setNoofcars(car.getNoofcars());
		try{ 
			session.save(ca);
			 session.getTransaction().commit();
			//System.out.println("yooyo");
			return "success";
			
			}
		catch(Exception e)
		{
			return "failure";
		}
	 
 }
 public String deletecars(String car)
	{
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		String st[]=car.split("\\?");
		Date d1=new Date();
		Date d2=new Date();
		try {
			d1=new SimpleDateFormat("yyyy-MM-dd").parse(st[1]);
			d2=new SimpleDateFormat("yyyy-MM-dd").parse(st[2]);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		
		/*System.out.println(st[0]);
		System.out.println(st[1]);
		System.out.println(st[2]);
		System.out.println(st[3]);
		System.out.println(st[4]);*/
		String queryString="delete from add where eventname=:eventname and fdate=:fdate and tdate=:tdate and address=:address and cost=:cost";
		Query query=session.createQuery(queryString);
		query.setParameter("eventname",st[0]);
		query.setParameter("fdate",d1);
		query.setParameter("tdate", d2);
		query.setParameter("address", st[4]);
		query.setParameter("cost", Double.parseDouble(st[3]));
		System.out.println("hai");
		//query.setParameter("", Long.parseLong(st[4]));
		try {
			query.executeUpdate();
			if(!session.getTransaction().wasCommitted())
			{
				session.getTransaction().commit();
			}
			return "success";
		}
		catch (Exception e) {
			// TODO: handle exception
			return "failure";
		}
		}
	
	public List<add> deletedates(Deletedates car)
	{
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Date d1=new Date();
		Date d2=new Date();
		try {
			d1=new SimpleDateFormat("yyyy-MM-dd").parse(car.getFdate());
			d2=new SimpleDateFormat("yyyy-MM-dd").parse(car.getTdate());
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String queryString="from add as E where E.fdate>=:fdate and E.tdate<=:tdate";
		Query query=session.createQuery(queryString);
		query.setParameter("fdate",d1);
		query.setParameter("tdate",d2);
		List<add> ad=query.list();
		return ad;
	}
	public List<add> getEventList(com.ag.bytee.beans.searchdates search)
	{ 
		Session session=HibernateUtil.getSessionFactory().openSession();
	session.beginTransaction();
		Date d1=new Date();
		Date d2=new Date();
		try{
			d1=new SimpleDateFormat("yyyy-MM-dd").parse(search.getFdate());
			d2=new SimpleDateFormat("yyyy-MM-dd").parse(search.getTdate());
			System.out.println("vamsi");
		}
		catch (ParseException e1) {
			e1.printStackTrace();
		}
		String queryString="from add as E where (fdate>=:fdate or (fdate<=:fdate and tdate>=:fdate)) and (tdate<=:tdate or(tdate>=:tdate and fdate<=:tdate)) ";
		Query query=session.createQuery(queryString);
		query.setParameter("fdate",d1);
		query.setParameter("tdate",d2);
		List<add> ad=query.list();
        return ad;
	}
	public bookevent result(book b,String option)
	{
		Session session=com.ag.bytee.util.HibernateUtil.getSessionFactory().openSession();
		 session.beginTransaction();
		 String st[]=option.split("\\?");
		 Date d1=new Date();
			Date d2=new Date();
			try {
				d1=new SimpleDateFormat("yyyy-MM-dd").parse(st[1]);
				d2=new SimpleDateFormat("yyyy-MM-dd").parse(st[2]);
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			/*System.out.println(st[0]);
			System.out.println(st[1]);
			System.out.println(st[2]);
			System.out.println(st[3]);
			System.out.println(st[4]);*/
		 bookevent be = new bookevent();
		String querystring=" from register as r where r.email=:email ";
	 	Query query=session.createQuery(querystring);
	 	//query.setParameter("first",req.getFirst());
	 	//query.setParameter("last",req.getLast());
	 	query.setParameter("email",b.getEmail());
	 	//query.setParameter("password",req.getPassword());
	 	Object qr=query.uniqueResult();
	 	Long l=new Long(b.getPhno());
	 	register li = (register)qr;
	 	be.setName(li.getFirst());
	 	be.setEmailid(li.getEmail());
	 	be.setPhno(l);
	 	be.setFdate(d1);
	 	be.setTdate(d2);
	 	Double d = Double.parseDouble(st[3]);
	 	Double t=3.14;
	 	Double total=t+d;
	 	be.setCost(d);
	 	be.setEventname(st[0]);
	 	be.setPlace(st[4]);
	 	be.setTax(t);
	 	be.setTotal(total);
	 	//System.out.println(be.getBookingid());
	 	try
		 {   
			 session.save(be);
			 session.getTransaction().commit();
			 //System.out.println("success");
			 return be;
		 }
		 catch (Exception e)
		 {
			 System.out.println("failure");
			  
		 }
	 	return be;
	}
	public List<add> getEventLis(String user)
	{ 
		Session session=HibernateUtil.getSessionFactory().openSession();
	session.beginTransaction();
		/*Date d1=new Date();
		Date d2=new Date();
		try{
			d1=new SimpleDateFormat("yyyy-MM-dd").parse(search.getFdate());
			d2=new SimpleDateFormat("yyyy-MM-dd").parse(search.getTdate());
			System.out.println("vamsi");
		}
		catch (ParseException e1) {
			e1.printStackTrace();
		}*/
		String queryString="from bookevent as E where E.name=:user";
		Query query=session.createQuery(queryString);
		query.setParameter("user",user);
		List<add> ad=query.list();
        return ad;
	}
	public bookevent result1(String user,String option)
	{
		Session session=com.ag.bytee.util.HibernateUtil.getSessionFactory().openSession();
		 session.beginTransaction();
		 String st[]=option.split("\\?");
		 Date d1=new Date();
			Date d2=new Date();
			try {
				d1=new SimpleDateFormat("yyyy-MM-dd").parse(st[1]);
				d2=new SimpleDateFormat("yyyy-MM-dd").parse(st[2]);
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			/*System.out.println(st[0]);
			System.out.println(st[1]);
			System.out.println(st[2]);
			System.out.println(st[3]);
			System.out.println(st[4]);*/
		 bookevent be = new bookevent();
		String querystring=" from bookevent as r where r.name=:user and r.eventname=:eventname and r.place=:place ";
	 	Query query=session.createQuery(querystring);
	 	query.setParameter("eventname",st[0]);
	 	query.setParameter("place",st[4]);
	 	query.setParameter("user",user);
	 	Object qr=query.uniqueResult();
	 	bookevent b = (bookevent)qr;
	 	return b;
	 		 	
	}

 }
