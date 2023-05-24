<%@page import="com.test.serviceBuilder.service.StateLocalService"%>
<%@page import="com.test.serviceBuilder.model.State"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.model.Country"%>
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

<body>
	
	<portlet:resourceURL id="/fetch/state" var="fetchStateURL" />
	<portlet:resourceURL id="/fetch/city" var="fetchCityURL" />
	<portlet:actionURL name="/add-edit/branch" var="addEditBranchURL"></portlet:actionURL>
	
	
	<h3>Branch Form</h3>

	<div class="container">
		<form action="${addEditBranchURL}" method="post">
		<input id="id" name="<portlet:namespace/>id" type="hidden" value="${selectedBranch.id}" />
			<label for="fname">First Name</label> <input type="text"
				id="firstName" name="<portlet:namespace />firstName" value="${selectedBranch.name}"> 
				
			<label for="HAddress">Home
				Address</label> <input type="text" id="address1"
				name="<portlet:namespace />address1" value="${selectedBranch.address1}"> 
			<label for="WAddress">Work
				Address</label> <input type="text" id="address2"
				name="<portlet:namespace />address2" value="${selectedBranch.address2}"> 
			
			<label for="country">Country</label>
			   <select id="<portlet:namespace />country" name="<portlet:namespace />country" value="${selectedBranch.country}">
			   <c:forEach items="${listCountries}" var="country">
					<option value="${country.getCountryId()}"  <c:if test="${country.getCountryId() == selectedBranch.id}">selected</c:if>> ${country.getName(locale)}</option> 
				</c:forEach>
			  </select>
			
			<label for="state">State</label> 
			<select  id="<portlet:namespace />state" name="<portlet:namespace />state" value="${selectedBranch.state}">
		    
		    <option value=""> Select State </option>
		    </select>
		    
		    <label
				for="Cityname">City</label> 
				<select id="<portlet:namespace />city" name="<portlet:namespace />cityName" value="${selectedBranch.city}"> 
					<option value=""> Select City </option> 
				</select>
				
			<label for="pincode">Pincode</label>
			<input type="number" id="pincode" name="<portlet:namespace />pincode" value="${selectedBranch.pincode}">
			
			<br> <br> <input type="button" class="back-button" value="Back" >
			<br> <br> <input type="submit" value="Submit" >
		</form>
	</div>
</body>


 <script>
$(document).ready(function(){
	 $("#<portlet:namespace />country").on('change',function() {         
			var countryId = $(this).val();
			console.log("countryId : "+countryId);
		    $.ajax({
		        url : "${fetchStateURL}",
		        type:"post",
		        data : { 
		        	'<portlet:namespace />countryId' : countryId	 
		        },
		        dataType : 'json',
		        success : function(response) {
		        	console.log("response");
		        	console.log(response);
		        	if(response.status == 'success' && response.data)
		            {
		        	
			            var state = response.data;
			            console.log("state :"+state);
			           
			            $('#<portlet:namespace />state').empty();
			            for(var i=0; i<state.length;i++)
	                    {
			            	console.log("i=:"+i);
			            	console.log("stateId :"+state[i].stateId +"stateName :"+state[i].stateName);
	                        $('#<portlet:namespace />state').append($("<option value='" + state[i].stateId + "'> </option>")
	                        	.text(state[i].stateName));
	                    }
		            }
		        },
		        error: function (data) {
		           console.log("Error Occurred");
		           console.log(data);
		        }
		    });
		});

	 $("#<portlet:namespace />state").on('change',function() {         
			var stateId = $(this).val();
			console.log("stateId : "+stateId);
		    $.ajax({
		        url : "${fetchCityURL}",
		        type:"post",
		        data : { 
		        	'<portlet:namespace />stateId' : stateId	 
		        },
		        dataType : 'json',
		        success : function(response) {
		        	console.log("response");
		        	console.log(response);
		        	if(response.status == 'success' && response.data)
		            {
			            var city = response.data;
			            console.log(city);
			           
			            $('#<portlet:namespace />city').empty();
			            for(var i=0; i<city.length;i++)
	                    {
			            	console.log("cityId :"+city[i].cityId +"cityName :"+city[i].cityName);
	                        $('#<portlet:namespace />city').append($("<option value='" + city[i].cityId + "'> </option>")
	                        	.text(city[i].cityName));
	                    }
		            }
		        },
		        error: function (data) {
		           console.log("Error Occurred");
		           console.log(data);
		        }
		    });
		});
}); 

jQuery(function($){
	  $('.back-button').click(function(e){
	    history.back();
	  });
	});

</script>