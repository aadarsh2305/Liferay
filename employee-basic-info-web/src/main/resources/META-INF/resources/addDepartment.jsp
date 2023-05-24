<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="init.jsp"%>

<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
}

* {
	box-sizing: border-box;
}

input[type=text], select, textarea {
	width: 100%;
	padding: 12px;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
	margin-top: 6px;
	margin-bottom: 16px;
	resize: vertical;
}

input[type=submit] {
	background-color: #04AA6D;
	color: white;
	padding: 12px 20px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

input[type=submit]:hover {
	background-color: #45a049;
}

.container {
	border-radius: 5px;
	background-color: #f2f2f2;
	padding: 20px;
}
</style>

<body>
	
	<portlet:actionURL name="addEditDepartment" var="addDepartmentURL">
	</portlet:actionURL>
	<h3>Department Form</h3>

	<div class="container">
		<form action="${addDepartmentURL}" method="post">
		<input id="id" name="<portlet:namespace/>id" type="hidden" value="${selectedDepartment.id}" />
			<label for="fname">First Name</label>
			 <input type="text" id="fname" name="<portlet:namespace />firstName" placeholder="Your name.." value="${selectedDepartment.name}"">
			<label for="Hname">Head of Department</label> 
			<input type="text" id="hname" name="<portlet:namespace />headName" placeholder="Department head name.." value="${selectedDepartment.head}""> 
				<br> <br> <input type="button" class="back-button" value="Back" >
				<input type="submit" value="Submit">
		</form>
	</div>

</body>

<script>
jQuery(function($){
	  $('.back-button').click(function(e){
	    history.back();
	  });
	});
</script>
