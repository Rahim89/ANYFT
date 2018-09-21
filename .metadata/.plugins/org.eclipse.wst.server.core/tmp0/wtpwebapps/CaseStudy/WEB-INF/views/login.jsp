<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<div id = "header">
    <%@include file="header.jsp" %>
    </div>

	<form action="userverification" method="post">
	  <fieldset>
	    <legend>Log In:</legend>
	    
	    <div class="container">
    <hr>
	
	<label for="text"><b>User Name</b></label>
    <input type="text" placeholder="Enter User Name" name="userName" required>
	
    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>
	
	<hr>
   
	    <button type="submit" class="registerbtn">Login</button>   
	    </div>
	    
	    <div class="container signin">
   		 <p>Don't have an account? <a href="register">Sign Up</a>.</p>
  		</div>
	    
	  </fieldset></form>
	
	
	<div>
    <%@include file="footer.jsp" %>
    </div>
</body>
</html>