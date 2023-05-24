<%@ include file="/init.jsp"%>


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

<!-- This "addEditDesignation" is a actionURL name which is directly connected with 
                          "AddEditDesignationMVCActionCommand" class in command package-->
	<portlet:actionURL name="addEditDesignation" var="addDesignationURL"></portlet:actionURL>

	<h3>Designation Form</h3>

	<div class="container">
		<form action="${addDesignationURL}" method="post"}>
		<input id="id" name="<portlet:namespace/>id" type="hidden" value="${selectedDesignation.id}" />
			<label for="fname">Designation Name</label> 
			<input type="text" id="name" name="<portlet:namespace />firstName" value="${selectedDesignation.name}" } /> 
			<br> <br> <input type="button" class="back-button" value="Back" >	
			<input type="submit" value="Submit">
		</form>
	</div>
</body>
</html>

<script>
jQuery(function($){
	  $('.back-button').click(function(e){
	    history.back();
	  });
	});
</script>
