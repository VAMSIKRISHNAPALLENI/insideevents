
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s"%>
<!DOCTYPE html>
<html lang="en">
<head>
<script type="text/javascript">
		$(document).ready( function() {
		    let now = new Date();
		 
		    let day = ("0" + now.getDate()).slice(-2);
		    let month = ("0" + (now.getMonth() + 1)).slice(-2);

		    let today = (day)+"-"+(month)+"-"+ now.getFullYear();


		   
		   $('#fdate').val(today);
		   $('#tdate').val(today);
		    
		});
		function testClicked(a)
		{ 
			document.getElementById("fdate").value=$('#fdate').val();
			
		}
		function testClicked1()
		{
			document.getElementById("tdate").value=$('#tdate').val();
		
		}
		function fun()
		{
			var doc=document,getElementById("eventname").value;
			var doc1=document,getElementById("address").value;
		
			var doc4=document,getElementById("cost").value;
			if(doc==" "||doc==null)
				{
				alert("event name shouldn't be empty");
				return false;
				}
			else	if(doc1==" "||doc1==null)
			{
			alert("address shouldn't be empty");
			return false;
			}
			else if(doc4==" "||doc4==null)
			{
			alert("cost shouldn't be empty");
			return false;
			}

			else
				{
				return true;
				}

		}
		
		</script>
  <title>INSIDE EVENTS</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="description" content="HTML5 website template">
  <meta name="keywords" content="global, template, html, sass, jquery">
  <meta name="author" content="Bucky Maler">
  <link rel="stylesheet" href="assets/css/main.css">
</head>
<body>
<!-- notification for small viewports and landscape oriented smartphones -->
<div class="device-notification">
  <a class="device-notification--logo" href="index">
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
            <p >INSIDE EVENTS</p>
          </a>
        </header>
        <div align="center">
        <h5 Style="color:red">${ msg}</h5>
        <h5 Style="color:red">${ msg1}</h5>
        <h5 Style="color:red">${ msg2}</h5>
        <h5 Style="color:red">${ msg3}</h5>
        </div>
        
        <ul class="l-main-content main-content">
            <div class="intro">
             <s:form action="addgo" method="POST" id="add" commandName="add" class="work-request" onsubmit="return fun()">
eventname<s:input type="text" path="eventname" id="eventname" cssStyle="border: none;border-radius: 0;border-bottom: 1px solid #fff;background-color: transparent;" spellcheck="false"/><br>
address:<s:input type="text" path="address" id="address" cssStyle="border: none;border-radius: 0;border-bottom: 1px solid #fff;background-color: transparent;" spellcheck="false"/><br>
fromDate<input type="date" name="fdate" id="fdate" onchange="testClicked()" Style="border: none;border-radius: 0;border-bottom: 1px solid #fff;background-color: transparent;" spellcheck="false"/><br>
toDate<input type="date" name="tdate" id="tdate" onchange="testClicked1()" Style="border: none;border-radius: 0;border-bottom: 1px solid #fff;background-color: transparent;" spellcheck="false"/><br>
cost<s:input type="text" path="cost" id="cost" Style="border: none;border-radius: 0;border-bottom: 1px solid #fff;background-color: transparent;" spellcheck="false"/><br> 
   <br>          
 <input type="submit" value="submit"/>
                </s:form>
               
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