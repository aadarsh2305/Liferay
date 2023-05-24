<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/init.jsp"%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
    <script src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/additional-methods.min.js"></script>
<script>
$().ready(function(){
	$("#formValidation").validate({
		rules:{
			<portlet:namespace />firstName:{required : true, minlength : 3},
			<portlet:namespace />mobileNumber:{required:true,minlength:10,maxlength:10},
			<portlet:namespace />email:{required:true,email:true},
			<portlet:namespace/>department:{required:true},
			<portlet:namespace/>designation:{required:true},
			<portlet:namespace/>branch:{required:true}
			},
			 messages : {
				 <portlet:namespace />firstName : {required:"* This field is required",minlength:"* Minimum length should be 3"},
				 <portlet:namespace />mobileNumber:{required:"* This field is required",minlength:"* length should be 10"},
				 <portlet:namespace />email:{required:"* This field is required",minlength:"* PLease enter Valid Mail"},
				 <portlet:namespace/>department:{required:"* This field is required"},
				 <portlet:namespace/>designation:{required:"* This field is required"},
				 <portlet:namespace/>branch:{required:"* This field is required"}
				}
         });
	});
	
jQuery(function($){
	  $('.back-button').click(function(e){
	    history.back();
	  });
	});
</script>

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
	
		<portlet:actionURL name="addEditEmployee" var="addEmployeeURL">
	</portlet:actionURL>

	
	<h3>Employee Form</h3>

	<div class="container">
		<form id="formValidation" action="${addEmployeeURL}" method="post">
		<input id="id" name="<portlet:namespace/>id" type="hidden" value="${selectedEmployee.id}" />
			<label for="fname">First Name</label> 
			<input type="text" id="fname" name="<portlet:namespace />firstName" value="${selectedEmployee.name}">
			<label for="mobile">Mobile No</label> 
			<input type="long" id="mobileNumber" name="<portlet:namespace />mobileNumber" value="${selectedEmployee.mobileNo}">
			<br><br>
			<label for="email">Email</label> 
			<input type="String" id="email" name="<portlet:namespace />email" value="${selectedEmployee.email}">  
			<br><br>
			<label for="department">Department</label> 
			<select name="<portlet:namespace/>department" value="${selectedEmployee.departmentId}"> 
				 <c:forEach items="${departmentList}" var="department">
					<option value="${department.getId()}"> ${department.getName()} </option> 
				</c:forEach> 
			</select> 
			
			<label for="designation">Designation</label> 
			<select name="<portlet:namespace/>designation" value="${selectedEmployee.designationId}"> 
			 <c:forEach items="${designationList}" var="designation">
			<option value="${designation.getId()}"> ${designation.getName()} </option> 
			</c:forEach> 
			</select> 
			
			<label for="branch">Branch</label> 
			<select name="<portlet:namespace/>branch" value="${selectedEmployee.branchId}"> 
			 <c:forEach items="${branchList}" var="branch">
			<option value="${branch.getId()}"> ${branch.getName()} </option> 
			</c:forEach> 
			</select>  
			<br> <br> <input type="button" class="back-button" value="Back" >
			<input type="submit" value="Submit">
		</form>
	</div>

</body>
 

