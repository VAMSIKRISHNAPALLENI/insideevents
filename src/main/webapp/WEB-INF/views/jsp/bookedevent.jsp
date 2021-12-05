<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="s"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">
<head>
  <title>INSIDE EVENTS</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="description" content="HTML5 website template">
  <meta name="keywords" content="global, template, html, sass, jquery">
  <meta name="author" content="Bucky Maler">
  <link rel="stylesheet" href="assets/css/main.css">
<script type="text/javascript">
		$(document).ready( function() {
		    let now = new Date();
		 
		    let day = ("0" + now.getDate()).slice(-2);
		    let month = ("0" + (now.getMonth() + 1)).slice(-2);

		    let today = (day)+"-"+(month)+"-"+ now.getFullYear();

		    $('#fdate').val(today);
		   $('#tdate').val(today);
		    
		});
		function testClicked1()
		{
			document.getElementById("tdate").value=$('#tdate').val();
		}
		function testClicked()
		{
			document.getElementById("fdate").value=$('#fdate').val();
		}
		function bookhistory()
		{
			document.getElementById("myform").submit();
			}
		function setMV(x)
		{
			var y=document.getElementsByTagName("input");
			var count=y.length;
			for(var i=0;i<count;i++)
				{
					if(y[i].value===x)
						{
						y[i].checked=true;
						}
				}
		}
		</script>
  
</head>
<body>
<!-- notification for small viewports and landscape oriented smartphones -->
<div class="device-notification">
  <a class="device-notification--logo" href="#0">
    <img src="assets/img/logo.png" alt="Global">
    <p>INSIDE EVENTS</p>
  </a>
</div>

<div class="perspective effect-rotate-left">
  <div class="container"><div class="outer-nav--return"></div>
    <div id="viewport" class="l-viewport">
      <div class="l-wrapper">
        <header class="header">
          <a class="header--logo" href="index">
            <img src="assets/img/logo.png" alt="Global">
            <p>INSIDE EVENTS</p>
          </a>
          
         
        </header>
      
        <ul class="l-main-content main-content">
            <div class="intro">
             
<s:form action="bookh" method="post" class="work-request" comandName="eventbooking">
			<input type="hidden" value="${fdate}" name="fdate"/>
			<input type="hidden" value="${tdate }" name="tdate"/> 
			<input type="hidden" value="${user }" name="user"/>		
					<table align="center" cellspacing="10" width="100%" border="border">
				<tr><th>Option</th><th>EVENT NAME</th><th>FROM</th><th>TO</th><th>COST</th><th>ADDRESS</th></tr>
				<c:if test="${not empty result1.add }">
				<c:forEach var="list" items="${result1.add}" varStatus="idx">
				<tr align="center">
				<td><input type="radio"  name="option" id="option"  Style="opacity:1" value="${list.eventname }?${list.fdate}?${list.tdate}?${list.cost}?${list.place}"/><label for="option"><a href="#" onclick="setMV('${list.eventname }?${list.fdate}?${list.tdate}?${list.cost}?${list.place}')"><img src="assets\img\l=${list.eventname}.png" width="40px" height="40px" ></img></a></label> </td>
				<td>${list.eventname}</td>
				<td>${list.fdate }</td>
				<td>${list.tdate }</td>
				<td>${list.cost }</td>
				<td>${list.place }</td>
				</tr>
				</c:forEach>
				
				</c:if>
			</table>
			<br><br>
			<input type="submit" value="BOOK">
			</s:form>
               
                <br>
               
           </div>
            
          </ul>
          </div>
          </div>
          </div>
          </div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="assets/js/vendor/jquery-2.2.4.min.js"><\/script>')</script>
<script src="assets/js/functions-min.js"></script>
</body>
</html>
