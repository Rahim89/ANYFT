<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1> welcome to the welcome page </h1>
	<div class = "container">
		<form action = "user_info" method="POST">
		
		<div class = "sub_field">
			<label for ="name">User name </label><br>
			<input id = "name" name="username" type = "text" placeholder = "Enter your Name" />		
		</div>
		<br>
		<div class = "sub_field">
			<label for ="password">Password</label><br>
			<input type = "password" id = "pass" name="password"  />		
		</div>
		<br>		
		<div class = "btn">
			<input type = "submit" name = "submit"  value = "Submit Info" />		
		</div>			
		
		</form>			
	
	</div>

</body>
</html>