
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
             <h2 Style="color:red">${msg10 }</h2>
              <s:form action="home" method="POST" id="register" commandName="register" class="work-request">
              
              FIRSTNAME<s:input type="text" path="first" cssStyle="border: none;border-radius: 0;border-bottom: 1px solid #fff;background-color: transparent;" spellcheck="false"/><s:errors path="first" Style="color:red"></s:errors>             
              LASTNAME <s:input type="text" path="last" cssStyle="border: none;border-radius: 0;border-bottom: 1px solid #fff;background-color: transparent;" spellcheck="false"/><s:errors path="last" Style="color:red"></s:errors>
                 EMAIL  <s:input type="text" path="email" cssStyle="border: none;border-radius: 0;border-bottom: 1px solid #fff;background-color: transparent;" spellcheck="false"/><s:errors path="email" Style="color:red"></s:errors>      
       PASSWORD<s:input type="password" path="password" cssStyle="border: none;border-radius: 0;border-bottom: 1px solid #fff;background-color: transparent;" spellcheck="false"/><s:errors path="password" Style="color:red"></s:errors>
            <br>
           <div class="information-name">
                    <s:input type="hidden" path="role" id="role" value="user"/>
                  </div>
        <br>          
               <input type="submit" value="submit"/>
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
