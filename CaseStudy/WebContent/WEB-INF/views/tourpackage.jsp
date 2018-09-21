<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Package</title>
</head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<body>
	<div id = "header">
    <%@include file="header.jsp" %>
    </div>
    
    <%-- <div class="container">
      <div class="card-deck mb-3 text-center">
        <div class="card mb-4 shadow-sm">
        <c:forEach var="tourpackage" items="${packages}">
          <div class="card-header">
            <h4 class="my-0 font-weight-normal"><c:out value="${tourpackage.name}" /></h4>
          </div>
          <div class="card-body">
            <h1 ><c:out value="${tourpackage.descriptions}" /></h1>
            <!-- <ul class="list-unstyled mt-3 mb-4">
              <li>10 users included</li>
              <li>2 GB of storage</li>
              <li>Email support</li>
              <li>Help center access</li>
            </ul> -->
            <button type="button" class="btn btn-lg btn-block btn-outline-primary">Sign up for free</button>
          </div>
           </c:forEach>
        </div>
       </div>
      </div> --%>
    
    
   
    
    
    
    
   
     
        	 
            <c:forEach var="tourpackage" items="${packages}">
                <div align="center">
                
                    Name: <b><c:out value="${tourpackage.name}" /></b>
                </div>
                 
                 
                 <div align="center">
                    <p> <c:out value="${tourpackage.descriptions}" /></p>
                 </div>
                
                 <%-- <div >
                    Itinerary: <p><c:out value="${tourpackage.itineraryDescription}" /></p>
                 </div> --%>
                
                 <div align="center">
                   Duration: <c:out value="${tourpackage.duration_max}" /> hours
                 </div >
                 
                 <div align="right">
                   Price:  <b>$<c:out value="${tourpackage.price}" /></b>  
                </div>
                <div align="right" padding: 16px; margin-bottom: 30px;>
  					<a href="booking" class="active">Book Now</a>
 			   </div>
                <hr>
                 

            </c:forEach>
      
             
  
    <div>
    <%@include file="footer.jsp" %>
    </div>
</body>
	

</html>