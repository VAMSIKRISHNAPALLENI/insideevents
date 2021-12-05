package com.ag.bytee;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.ag.bytee.beans.*;

import java.util.List;
//import com.ag.bytee.beans.login;
import com.ag.bytee.DatabaseCon.DatabaseCon;
//import java.lang.NullPointerException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
@Controller
public class FirstController {
	@RequestMapping(value="/",method=RequestMethod.GET)
	protected String second(ModelMap model)
	{
		model.addAttribute("login",new com.ag.bytee.beans.login());
	return "index";
	
	}
	@RequestMapping(value="/index",method=RequestMethod.GET)
	protected String second1(ModelMap model)
	{
		model.addAttribute("login",new com.ag.bytee.beans.login());
	return "index";
	
	}

	@RequestMapping(value="/start",method=RequestMethod.GET)
	protected String secondmethod(@Valid ModelMap model)
	{
		model.addAttribute("login",new com.ag.bytee.beans.login());
	return "login";
	
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	protected String login(@Valid @ModelAttribute("login")com.ag.bytee.beans.login login,BindingResult result, ModelMap model,HttpServletRequest request )
	{ 
		DatabaseCon con=new DatabaseCon();
		String result1=con.userCheck(login);
		//System.out.println("hello");
		//System.out.println(login.getRole());
		try {
			if (result.hasErrors()) {
				System.out.println("done");
	            return "login";
	        }
		/*if(result1.equals("failure"))
		{
			
		return "login";
		}*/
		else if(result1.equals("admin"))
		{ 
			HttpSession session=request.getSession();
			session.setAttribute("user",login.getUser());
			session.setAttribute("password",login.getPassword());
			session.setAttribute("role",login.getRole());
			return "index4";
		}
		else if(result1.equals("user"))
		{
			model.addAttribute("user",login.getUser());
			//System.out.println(login.getUser());
			return "userint";
		}
		}
		catch(Exception e)
		{
			return "failure";
		}
		return "failure";
	}
	@RequestMapping(value="/go",method=RequestMethod.GET)
	protected String sixth(ModelMap model)
	{
	model.addAttribute("register",new com.ag.bytee.beans.register());
	return "register";
	}
	@RequestMapping(value="/home",method=RequestMethod.POST)
	protected String seventh(@Valid @ModelAttribute("register")com.ag.bytee.beans.register register,BindingResult result,ModelMap model)
	{
		if(result.hasErrors())
		{
			result.rejectValue("", "", "failed to login");
			System.out.println("regiser");
			return "register";
		}
		DatabaseCon con=new DatabaseCon();
		String result1=con.register(register);
		if(result1.equals("success"))
		{ 
		register res=con.userLogin(register);
		model.addAttribute("first",res.getFirst());
		model.addAttribute("last",res.getLast());
		model.addAttribute("email",res.getEmail());
		model.addAttribute("password",res.getPassword());
		model.addAttribute("role",res.getRole());
		return "registersuccess";
		}
		else {
			model.addAttribute("msg10","not registered");
			return "register";
		}
			
	}
	@RequestMapping(value="/addadmin",method=RequestMethod.GET)
	protected String add(ModelMap model)
	{
		
	model.addAttribute("add",new com.ag.bytee.beans.addbeans());
	return "add";
	}
	@RequestMapping(value="/loginsucess",method=RequestMethod.GET)
	protected String add1(ModelMap model)
	{
		model.addAttribute("searchevent",new com.ag.bytee.beans.searchdates());
		return "loginsucess";
	}
	@RequestMapping(value="/addgo",method=RequestMethod.POST)
	protected String seventh(@ModelAttribute("add")com.ag.bytee.beans.addbeans add,BindingResult result,ModelMap model)
	{
		try {
		
		DatabaseCon con=new DatabaseCon();
		if(add.getEventname()=="")
		{
			model.addAttribute("msg","event name shouldn,t be empty");
			System.out.println(add.getEventname());
			return "add";
		}
		else if(add.getAddress()=="")
		{
			model.addAttribute("msg1","address shouldn,t be empty");
			System.out.println(add.getEventname());
			return "add";
		}
		else if(add.getFdate()=="")
		{
			model.addAttribute("msg2","from date shouldn,t be empty");
			System.out.println(add.getEventname());
			return "add";
		}
		else if(add.getTdate()=="")
		{
			model.addAttribute("msg3","to date shouldn,t be empty");
			System.out.println(add.getEventname());
			return "add";
		}
		String result1=con.addput(add);
		if(result1.equals("success"))
		{ 
		 
		return "adminsucess";
		}
		else
		{  //System.out.println(result1);
			return "add";
	   }
		}
		catch(Exception e)
		{
			return "add";
		}
		}
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	protected String logout(ModelMap model,HttpServletRequest request)
	{   HttpSession session=request.getSession();
		session.invalidate();
		model.addAttribute("login",new com.ag.bytee.beans.login());
		return "index";
	}
	@RequestMapping(value="/deleteevent",method=RequestMethod.GET)
	protected String tenth11(ModelMap model)
	{ 
		
		model.addAttribute("deletedates",new Deletedates());
		return "deleteevent";
	}
	@RequestMapping(value="/deleteeventstart",method=RequestMethod.POST)
	protected String tenth112(@ModelAttribute("deletedates")Deletedates dates,ModelMap model)
	{
		List<add> result1=new DatabaseCon().deletedates(dates);
		System.out.println(result1.size());
		Deletedatesbeans dcb=new Deletedatesbeans();
		dcb.setadd(result1);
		model.addAttribute("result1",dcb);
		model.addAttribute("fdate", dates.getFdate());
		model.addAttribute("tdate", dates.getTdate());
		return "deleteeventnext";
	}
	@RequestMapping(value="/deletecarsfinal",method=RequestMethod.POST)
	protected String tenth113(@RequestParam("option")String option,@RequestParam("fdate")String fdate,@RequestParam("tdate")String tdate,ModelMap model)
	{
		//List<Addcar> result1=new DatabaseCon().deletedates(dates);
		//model.addAttribute("result1",result1);
		String act=new DatabaseCon().deletecars(option);
		Deletedates da=new Deletedates();
		da.setFdate(fdate);
		da.setTdate(tdate);
		if(act.equals("success"))
		{
			model.addAttribute("msg", " EVENT Deleted Successfully");
			List<add> result1=new DatabaseCon().deletedates(da);
			System.out.println(result1.size());
			Deletedatesbeans dcb=new Deletedatesbeans();
			dcb.setadd(result1);
			model.addAttribute("result1",dcb);
			return "deleteeventnext";
		}
		else
		{
			model.addAttribute("msg", "EVENT Deleting Failed");
			List<add> result1=new DatabaseCon().deletedates(da);
			System.out.println(result1.size());
			Deletedatesbeans dcb=new Deletedatesbeans();
			dcb.setadd(result1);
			model.addAttribute("result1",dcb);
			return "deleteeventnext";
		}
	}
	/*@RequestMapping(value="/deletecarsfinal",method=RequestMethod.POST)
	protected String tenth123(@RequestParam("option")String option,@RequestParam("fdate")String fdate,@RequestParam("tdate")String tdate,ModelMap model)
	{
		//List<Addcar> result1=new DatabaseCon().deletedates(dates);
		//model.addAttribute("result1",result1);
		String act=new DatabaseCon().deletecars(option);
		Deletedates da=new Deletedates();
		da.setFdate(fdate);
		da.setTdate(tdate);
		if(act.equals("success"))
		{
			model.addAttribute("msg", " EVENT Deleted Successfully");
			List<add> result1=new DatabaseCon().deletedates(da);
			System.out.println(result1.size());
			Deletedatesbeans dcb=new Deletedatesbeans();
			dcb.setadd(result1);
			model.addAttribute("result1",dcb);
			return "deleteeventnext";
		}
		else
		{
			model.addAttribute("msg", "EVENT Deleting Failed");
			List<add> result1=new DatabaseCon().deletedates(da);
			System.out.println(result1.size());
			Deletedatesbeans dcb=new Deletedatesbeans();
			dcb.setadd(result1);
			model.addAttribute("result1",dcb);
			return "deleteeventnext";
		}
	}*/

	@RequestMapping(value="/searcheventform",method=RequestMethod.POST)
	protected String tenth12(@ModelAttribute("searchevent")searchdates dates,ModelMap model)
	{   
		List<add> result1=new DatabaseCon().getEventList(dates);
		System.out.println(result1.size());
		com.ag.bytee.beans.searcheventbeans dcb=new com.ag.bytee.beans.searcheventbeans();
		dcb.setadd(result1);
		model.addAttribute("result1",dcb);
		model.addAttribute("fromdate", dates.getFdate());
		model.addAttribute("todate", dates.getTdate());
		return "searchevent";
	}
	@RequestMapping(value="/eventbooking",method=RequestMethod.POST)
	protected String tt(@Valid @RequestParam("option")String option,ModelMap model)
	{ 
		System.out.println(option);
		//if(result.hasErrors())
		if(option.equals(null))
		{
		
		
			return "searchevent";
		
		}
		else
		{
		model.addAttribute("book",new com.ag.bytee.beans.book());
		
		model.addAttribute("option", option);
		return "book";
		}
	}
	@RequestMapping(value="/bookconf",method=RequestMethod.POST)
	protected String book(@Valid @ModelAttribute("book")com.ag.bytee.beans.book book,@RequestParam("option")String option,BindingResult result,ModelMap model)
	{  
		/*if(result.hasErrors())
		{
			model.addAttribute("book",new com.ag.bytee.beans.book());
			model.addAttribute("option", option);
		   return "book";	
		}*/
		try
		{
		if(result.hasErrors())
		{
			
			model.addAttribute("book",new com.ag.bytee.beans.book());
			model.addAttribute("option", option);

			result.rejectValue("", "", "failed to add");
			return "book";
		}
		else
		{
		DatabaseCon d=new DatabaseCon();
		//System.out.println(book.getName());
		//System.out.println(book.getPhno());
		bookevent bo=d.result(book,option);
		model.addAttribute("name",bo.getName());
		model.addAttribute("email",bo.getEmailid());
		model.addAttribute("phno",bo.getPhno());
		model.addAttribute("place",bo.getPlace());
		model.addAttribute("eventname",bo.getEventname());
		model.addAttribute("cost",bo.getCost());
		model.addAttribute("tax",bo.getTax());
		model.addAttribute("fdate",bo.getFdate());
		model.addAttribute("tdate",bo.getTdate());
		model.addAttribute("total",bo.getTotal());
		//model.addAttribute("bookingid",bo.getBookingid());
		return "bookticket";
	}}
		catch(Exception e)
		{
			model.addAttribute("book",new com.ag.bytee.beans.book());
			model.addAttribute("option", option);
			return "book";
		}
		}
	@RequestMapping(value="/bookhistory",method=RequestMethod.GET)
	protected String tenth127(@RequestParam("user")String user,ModelMap model)
	{   //System.out.println(user);
		List<add> result1=new DatabaseCon().getEventLis(user);
		System.out.println(result1.size());
		com.ag.bytee.beans.searcheventbeans dcb=new com.ag.bytee.beans.searcheventbeans();
		dcb.setadd(result1);
		model.addAttribute("user",user);
		model.addAttribute("result1",dcb);
		return "bookedevent";
	}
	@RequestMapping(value="/bookh",method=RequestMethod.POST)
	protected String booke(@RequestParam("user")String user,@RequestParam("option")String option,ModelMap model)
	{  	//System.out.println(user);
		DatabaseCon d=new DatabaseCon();
		//System.out.println(book.getName());
		//System.out.println(book.getPhno());
		bookevent bo=d.result1(user,option);
		model.addAttribute("name",bo.getName());
		model.addAttribute("email",bo.getEmailid());
		model.addAttribute("phno",bo.getPhno());
		model.addAttribute("place",bo.getPlace());
		model.addAttribute("eventname",bo.getEventname());
		model.addAttribute("cost",bo.getCost());
		model.addAttribute("tax",bo.getTax());
		model.addAttribute("fdate",bo.getFdate());
		model.addAttribute("tdate",bo.getTdate());
		model.addAttribute("total",bo.getTotal());
		//model.addAttribute("bookingid",bo.getBookingid());
		return "bookticket";
	}
	@RequestMapping(value="/workshop")
	protected String workshop(ModelMap model)
	{
		return "workshop";
	}
	@RequestMapping(value="/cultural")
	protected String cultural(ModelMap model)
	{
		return "cultural";
	}
	@RequestMapping(value="/food")
	protected String food(ModelMap model)
	{
		return "food";
	}
	@RequestMapping(value="/tem")
	protected String tt(ModelMap model)
	{
		return "index3";
	}
	
}
