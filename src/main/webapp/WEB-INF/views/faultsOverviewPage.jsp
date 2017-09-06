<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>

<html>

<head>
	<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
	<title>Faults overview</title>
</head>


<body>
	
	<jsp:include page="_supportMenu.jsp" />

	<div id="tableDiv-faultsOverview">
            
		<c:if test="${!empty faultsToDo}">
		
			<table>
			
				<tr>
					<th>Date</th>
		            <th>Time</th>
		            <th>Product type</th>
		            <th>Client</th>
		            <th>Street</th>
		            <th>Place</th>
		            <th>Phone #1</th>
		            <th>Phone #2</th>
		            <th>Fault description</th>
		            <th>Note</th>
		            <th>Serviceman</th>
		            <th>Type of service</th>
				</tr>
				
				<c:forEach items="${faultsToDo}" var="fault">
					<tr>
						<td>${fault.date}</td>
			            <td>${fault.time}</td>
			            <td>${fault.ident}</td>
			            <td>${fault.client}</td>
			            <td>${fault.street}</td>
			            <td>${fault.place}</td>
			            <td>${fault.phoneOne}</td>
			            <td>${fault.phoneTwo}</td>
			            <td>${fault.faultDescription}</td>
			            <td>${fault.note}</td>
			            <td>${fault.serviceman}</td>
			            <td>${fault.typeOfService}</td>
			            <td><a href="${pageContext.request.contextPath}/editFault/${fault.id}">Edit</a></td>
			            <td><a href="${pageContext.request.contextPath}/deleteFault/${fault.id}">Delete</a></td>
			            <td><a href="${pageContext.request.contextPath}/archiveFault/${fault.id}">Archive</a></td>
					</tr>
				</c:forEach>
				
			</table>
			
		</c:if>           
           
	</div> <!-- close tableDiv-faultsOverview -->
	

</body>

<style type="text/css">

#tableDiv-faultsOverview{
  background: -webkit-linear-gradient(left, #25c481, #25b7c4);
  background: linear-gradient(to right, #25c481, #25b7c4);
  font-family: 'Roboto', sans-serif;
}

table{
  width:100%;
  table-layout: fixed;
}

th{
  padding: 20px 15px;
  text-align: left;
  font-weight: 500;
  font-size: 12px;
  color: #fff;
  text-transform: uppercase;
 }
 
 td{
  padding: 15px;
  text-align: left;
  vertical-align:middle;
  font-weight: 300;
  font-size: 12px;
  color: #fff;
  border-bottom: solid 1px rgba(255,255,255,0.1);
}

body{
   background: -webkit-linear-gradient(left, #25c481, #25b7c4);
   background: linear-gradient(to right, #25c481, #25b7c4);
}

</style>

</html>



