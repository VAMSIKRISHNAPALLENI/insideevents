<html>
<head>
<title>Insert title here</title>
</head>

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
  <script type="text/javascript">
function printdiv()
		{
			var contents = document.getElementById("print").innerHTML;
            var frame1 = document.createElement('iframe');
            frame1.name = "frame1";
            frame1.style.position = "absolute";
            frame1.style.top = "-1000000px";
            document.body.appendChild(frame1);
            var frameDoc = (frame1.contentWindow) ? frame1.contentWindow : (frame1.contentDocument.document) ? frame1.contentDocument.document : frame1.contentDocument;
            frameDoc.document.open();
            frameDoc.document.write('<html><head><title>EVENT TICKET</title>');
            frameDoc.document.write('</head><body>');
            frameDoc.document.write(contents);
            frameDoc.document.write('</body></html>');
            frameDoc.document.close();
            setTimeout(function () {
                window.frames["frame1"].focus();
                window.frames["frame1"].print();
                document.body.removeChild(frame1);
            }, 500);
            return false;
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
             <div id="print" class="work-request">
<h2><table  width="120%" align="center" height="50%">
<tr><th>NAME:</th><th>${name}</th></tr>
  <tr>
    <th colspan="2"> </th>
  </tr>
<tr><th>Mobile Number:</th><th>${phno}</th></tr>
<tr><th>E-mail:</th><th>${email}</th></tr>
<tr><th>EventName:</th><th>${ eventname}</th></tr>
<tr><th>Place:</th><th>${place}</th></tr>
<tr><th>From Date:</th><th>${fdate}</th></tr>
<tr><th>TO Date:</th><th>${tdate}</th></tr>
<tr><th>Cost:</th><th>${cost}</th></tr>
<tr><th>Tax:</th><th>${tax}</th></tr>
<tr><th>TOTAL:</th><th>${total}</th></tr>

</table></h2>
<input type="button" value="Print Ticket" onclick="printdiv()" style="color: #000000;
background: #993399; " />         
       
         </div>   
               
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
