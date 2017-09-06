<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Submit fault</title>
</head>

<body>

	<jsp:include page="_supportMenu.jsp" />

	<c:url var="addAction" value="/saveFault" ></c:url>

	<div id="wrapper">
		
		<form:form action="${addAction}" commandName="fault">
		
			<!-- Today date -->
			<form:input path="date" type="hidden" id="dateLabel"/>
		    	<script type="text/javascript">
		        	var todayDate = new Date();
		        	var formatTodayDate = todayDate.toISOString().slice(0,10).replace(/-/g,"");
					var labelDate = document.getElementById("dateLabel");
					labelDate.value = formatTodayDate;	
				</script>
						
			<!-- Time now -->
		    <form:input path="time" type="hidden" id="timeLabel"/>
			    <script type="text/javascript">
				    var timeNow = new Date();
				    var formatTimeNow = timeNow.getHours() + ':' + timeNow.getMinutes() + ':' + timeNow.getSeconds();
					var labelTime = document.getElementById("timeLabel");
					labelTime.value = formatTimeNow;	
				</script>
				
			<!-- Status -->
			<form:input path="status" type="hidden" value="UrgentToDo"/>
						
			<div id="tableDiv-submitFault">				
		
				<table id="table-submitFault">
		        
		            <tr>
		                <td>Product type:</td>
		                <td>
							<form:select path="ident">
								<form:option value="" label="Select"/>
				            	<form:options  items="${productTypeList}"/>
							</form:select>
						</td>
		            </tr>
		            
		            <tr>
		                <td>Serial number:</td>
		                <td><form:input path="serialNumber" /></td>
		            </tr>
		            
		            <tr>
		                <td>Client:</td>
		                <td><form:input path="client" /></td>
		            </tr>
		            
		            <tr>
		                <td>Street:</td>
		                <td><form:input path="street" /></td>
		            </tr>
		            
		            <tr>
		                <td>Place:</td>
		                <td><form:input path="place" /></td>
		            </tr>
		            
		            <tr>
		                <td>Phone #1:</td>
		                <td><form:input path="phoneOne" /></td>
		            </tr>
		            
		            <tr>
		                <td>Phone #2:</td>
		                <td><form:input path="phoneTwo"/></td>
		            </tr>
		            
		            <tr>
		                <td>Fault description:</td>
		                <td><form:textarea path="faultDescription" cols="30" rows="5" /></td>
		            </tr>
		            
		            <tr>
		                <td>Note:</td>
		                <td><form:textarea path="note" cols="30" rows="5" /></td>
		            </tr>
		            
		            <tr>
		            	<td>Serviceman:</td>
		            	<td>
		            		<form:select path="serviceman">
		            			<form:option value="" label="Select"/>
				            	<form:options  items="${servicemanList}"/>
							</form:select>
						</td>
		            </tr>
		            
		            <tr>
		            	<td>Fault submitted by:</td>
		            	<td>
		            		<form:select path="orderBy">
		            			<form:option value="" label="Select"/>
				            	<form:options  items="${usersList}"/>
							</form:select>
						</td>
		            </tr>
		            
		            <tr>
		            	<td>Type of service:</td>
		            	<td>
		            		<form:select path="typeOfService">
		            			<form:option value="" label="Select"/>
				            	<form:options  items="${typeOfServiceList}"/>
							</form:select>
						</td>
		            </tr>
		            
		            <tr>
		                <td colspan="2" align="center"><input type="submit" value="Submit fault"></td>
		            </tr>
		            
		        </table>
		        
			</div> <!-- close tableDiv-submitFault -->
			
		</form:form>

	</div> <!-- close wrapper -->


</body>

<style type="text/css">

body{
   background: -webkit-linear-gradient(left, #25c481, #25b7c4);
   background: linear-gradient(to right, #25c481, #25b7c4);
}

#wrapper {
    width: 100%;
    height:100%;
  	left: 50%;
   	position: absolute;
   	margin: 0 0 0 -350px;
   	padding-top: 30px;
}

#table-submitFault{
  width:100%;
  background: -webkit-linear-gradient(left, #25c481, #25b7c4);
  background: linear-gradient(to right, #25c481, #25b7c4);
  font-family: 'Roboto', sans-serif;
}

#tableDiv-submitFault{
  background: -webkit-linear-gradient(left, #25c481, #25b7c4);
  background: linear-gradient(to right, #25c481, #25b7c4);
  font-family: 'Roboto', sans-serif;
  width: 600px;
}

table{
  width:100%;
}
 
 td{
  padding: 10px;
  vertical-align:middle;
  font-weight: 300;
  font-size: 12px;
  color: #fff;
  border-bottom: solid 1px rgba(255,255,255,0.1);
}

input {
    width: 400px;
}

textarea {
    width: 400px;
}

select {
    width: 400px;
}

</style>


</html>