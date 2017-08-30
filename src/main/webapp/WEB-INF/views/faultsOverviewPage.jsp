<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>

<html>

<head>
	
	<title>Faults overview</title>
</head>


<body>
	
	<jsp:include page="_supportMenu.jsp" />


<div align="left">
            <h1>Faults overview</h1>
            
<c:if test="${!empty faultsToDo}">
	<table >
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
                    <td>
                        <a href="${pageContext.request.contextPath}/editFault/${fault.id}">Edit</a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="${pageContext.request.contextPath}/deleteFault/${fault.id}">Delete</a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="${pageContext.request.contextPath}/archiveFault/${fault.id}">Archive</a>
                    </td>
			
		</tr>
	</c:forEach>
	</table>
</c:if>           
           
           
</div>
	

</body>
</html>



<style type="text/css">

table{
   border: 1px solid;
   border-collapse: collapse;
   width: 100%;
}

tr, th, td{
	border: 1px solid;
	border-collapse: collapse;
}

</style>