<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Page</title>
</head>
<body>
	<% String sessionName = "";
	   if(session.getAttribute("u") != null){
		   sessionName = session.getAttribute("u").toString();
	   }%>
	   
	   <div class= "resquest_container">
	   	<h1>Name From Request</h1>
	   	<h3>${user_name}</h3>
	   </div>
	   <div class="request_container">
	   	<h1>Name From Session</h1>
	   	<h3><%=session.getAttribute("u") %></h3>
	   </div>
</body>
</html>