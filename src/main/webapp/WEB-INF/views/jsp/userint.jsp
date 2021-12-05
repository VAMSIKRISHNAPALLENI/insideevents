
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s"%>
<!DOCTYPE html>
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
</head>
<script type="text/javascript">
function validateMyForm()
{
	if(document.getElementById("user").value=="")
		{
		alert("Enter Username");
		return false;
		}
	}
function bookhistory()
{
	document.getElementById("myform").submit();
	}

</script>
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
            <body>
    <form action="bookhistory" id="myform" onsubmit="return validateMyForm()">        
<a href="loginsucess" cssStyle=" background-color:white ;color:blue">BOOK EVENTS</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="#" onclick="bookhistory()">BOOK HISTORY</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="logout">LOGOUT</a>&nbsp;&nbsp;&nbsp;&nbsp;
<input type="hidden" name="user" id="user" value="${user }" Style="color:red;background:yellow " />
</form>
<p><h1><font Style="color:black"> HELLO :${user }</font> </h1></p>
          </a>
      
          
        </header>
        <img  src="assets/img/admin.jpg" height="750px" width="1300px"/>
          </div>
          </div>
           
          </div>
          </div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="assets/js/vendor/jquery-2.2.4.min.js"><\/script>')</script>
<script src="assets/js/functions-min.js"></script>
</body>
</html>
