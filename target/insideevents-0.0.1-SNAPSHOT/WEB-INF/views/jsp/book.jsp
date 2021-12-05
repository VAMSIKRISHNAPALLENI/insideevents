<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s"%>
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
  <script>
  function fun()
  {
	  var doc=document.getElementById("book").value;
	  var doc1=document.getElementById("name").value;
	  var doc2=document.getElementById("phno").value;
	  var doc3=document.getElementById("email").value;
	  if(doc1==null||doc1=="")
		  {
		  alert("trying to submit empty name");
		  return false;
		  }
	  else if(doc2==null||doc2=="")
		  {
		  alert("trying to submit empty phone number");
		  return false;
		  }
	  else if(doc3==null||doc3=="")
		  {
		  alert("trying to submit empty email");
		  return false;
		  }
	  else
		  {
		  return true;
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
             
<s:form action="bookconf" method="post" id="book" comandName="book" class="work-request" onSubmit="return fun()">
<input type="hidden" name="option" id="option" value="${option }"/> 
name:<input type="text" id="name" name="name" Style="border: none;border-radius: 0;border-bottom: 1px solid #fff;background-color: transparent;" /><br>
phone<input type="text" id="phno" name="phno" Style="border: none;border-radius: 0;border-bottom: 1px solid #fff;background-color: transparent;" /><br>
email<input type="text" id="email" name="email" Style="border: none;border-radius: 0;border-bottom: 1px solid #fff;background-color: transparent;"/><br>
<label><input type="radio" name="imgsel" value="COD" checked="checked" />&nbsp;&nbsp;&nbsp;Cash On Delivery</label><br>
<input type="submit" value="BOOK" />
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
