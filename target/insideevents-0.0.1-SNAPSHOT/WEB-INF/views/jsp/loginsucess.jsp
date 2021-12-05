<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="s"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

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
		function testClicked()
		{
			document.getElementById("tdate").value=$('#tdate').val();
		}
		function testClicked1()
		{
			document.getElementById("fdate").value=$('#fdate').val();
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
             
<form action="searcheventform" id="searchdates" method="post" class="work-request">
				<table align="center" cellspacing="10">
				<tr><th>From Date</th></tr>
				<tr>
				<td><input type="date" name="fdate" id="fdate"  onchange="testClicked()" Style="border: none;border-radius: 0;border-bottom: 1px solid #fff;background-color: transparent;" spellcheck="false""></td>
				<tr><th>To Date</th></tr>
				</tr><tr><td><input type="date" name="tdate" id="tdate"  onchange="testClicked1()" Style="border: none;border-radius: 0;border-bottom: 1px solid #fff;background-color: transparent;" spellcheck="false"></td>
				</tr><tr></tr>
				</table><br>
<input type="submit" value="search event"/>
</form>
               
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
