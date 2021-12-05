
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
            <p>INSIDE EVENTS</p>
          </a>
          <button class="header--cta cta">Hire Us</button>
         
        </header>
      
        <ul class="l-main-content main-content">
            <div class="intro">
             
               <s:form action="login" method="POST" id="login" commandName="login" class="work-request" >
                
                <div class="work-request--information">
                                 <div class="information-name">
                  <s:input type="text" path="user" size="5" /> 
                    <label for="name">USERID</label>
                    <s:errors path="user" ><h6 Style="color:red">user id should not be empty</h6></s:errors>
                                      </div>
             <br>     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                  <div class="information-name">
                  
                    <s:input path="password" type="password" cssStyle="border: none;border-radius: 0;border-bottom: 1px solid #fff;background-color: transparent;" spellcheck="false" size="12"/>
                    <label for="name">PASSWORD</label>
                     <s:errors path="password" ><h6 Style="color:red">password should not be empty</s:errors>
                  </div>
                   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                  <div class="information-name">
                    <select name="role" id="role" Style="border: none;border-radius: 0;border-bottom: 1px solid #fff;background-color: transparent;" spellcheck="false" >
                    <option Style="color:black">user</option>
                    <option Style="color:black">admin</option>
                    </select>
                  </div>
                  
            </div>
            <br><br>    
                <input type="submit" value="login">
               <h4>are u not a member?</h4><a href="go"> <h3>SIGNUP</h3></a>
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
