<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<body>
	<div id = "header">
    <%@include file="header.jsp" %>
    </div>
    
    
    <div class="row">
    <c:forEach var="p" items="${picture}">
    <div class="column">
    <c:out value="${p.pictureName}" />
  </div>

  <div class="column">
    <img src="${p.locationfile}" style="width:99%"/>
  </div>
  </c:forEach>
</div>
   
     
    <div>
    <%@include file="footer.jsp" %>
    </div>
</body>
</html>