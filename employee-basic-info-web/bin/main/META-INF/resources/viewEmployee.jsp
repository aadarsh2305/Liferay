
<%@page import="com.test.serviceBuilder.service.BranchLocalServiceUtil"%>
<%@page import="com.test.serviceBuilder.service.BranchServiceUtil"%>
<%@page import="com.test.serviceBuilder.service.DesignationLocalServiceUtil"%>
<%@page import="com.test.serviceBuilder.service.DepartmentLocalServiceUtil"%>
<%@ include file="init.jsp"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>

<portlet:renderURL var="addEmployeeURL">
	<portlet:param name="action" value="Add" />
</portlet:renderURL>

<portlet:actionURL name="searchCustomQuery" var="searchCustomQueryURL"></portlet:actionURL>

<portlet:resourceURL id="exportExcelXLS" var="exportExcelXLSURL" />
<portlet:resourceURL id="exportExcelXLSX" var="exportExcelXLSXURL" />
<portlet:resourceURL id="exportPDF" var="exportPDF_URL" />

 
  <a class="btn btn-success" href="${exportExcelXLSURL}">Download IN XLS File</a>
  <a class="btn btn-success" href="${exportExcelXLSXURL}">Download IN XLSX File</a>
  <a class="btn btn-danger" href="${exportPDF_URL}">Download IN PDF File</a>
  <a class="btn btn-primary"href="${addEmployeeURL}">Add New Employee</a>

<h2>View Employee Portlet</h2>

<form action="${searchCustomQueryURL}" method="post">
  <label for="fromDate">From-Date</label>
  <input type="date" id="fromDate" name="<portlet:namespace />fromDate" >
   <label for="toDate">To-Date</label>
  <input type="date" id="toDate" name="<portlet:namespace />toDate" >
  
  <input type="text" id="customSqlName" name="<portlet:namespace />customSqlName">
  <input class="btn btn-success" type="submit" value="Submit">
 <button class="btn btn-success" type="button" onclick="clearFilter()">Clear Filter</button>
</form>

<%
List<Employee> employeeList = (List<Employee>)renderRequest.getAttribute("employeeList");
%>

   <liferay-ui:search-container emptyResultsMessage="there-are-no-employee"
	total="${employeeList.size()}" delta="2" deltaConfigurable="true">


	<liferay-ui:search-container-results results ="<%= ListUtil.subList(employeeList, searchContainer.getStart(), searchContainer.getEnd()) %>" />

  

	<liferay-ui:search-container-row
		className="com.test.serviceBuilder.model.Employee"
		keyProperty="id" modelVar="currentEmployee">

		 <portlet:renderURL var="updateURL">
			<portlet:param name="action" value="edit" />
			<portlet:param name="employeeid" value="${currentEmployee.id}" />
		</portlet:renderURL>

		 <portlet:actionURL name="deleteEmployee" var="DeleteURL">
			<portlet:param name="id" value="${currentEmployee.id}" />
		</portlet:actionURL> 
		
		<liferay-ui:search-container-column-text name="Id"
			property="id" />

		<liferay-ui:search-container-column-text name="Employee Name"
			property="name" />

		<liferay-ui:search-container-column-text name="Mobile Number"
			property="mobileNo" />

		<liferay-ui:search-container-column-text name="Email" property="email" />

		<%-- <liferay-ui:search-container-column-text name="Department"
			value="<%=DepartmentLocalServiceUtil.getDepartment(currentEmployee.getDepartmentId()).getName() %>" />

		<liferay-ui:search-container-column-text name="Designation"
			value="<%=DesignationLocalServiceUtil.getDesignation(currentEmployee.getDesignationId()).getName() %>" />

		<liferay-ui:search-container-column-text name="Branch"
			value="<%=BranchLocalServiceUtil.getBranch(currentEmployee.getBranchId()).getName() %>" />
 --%>
 <liferay-ui:search-container-column-text name="Department"
			property="departmentId" />

		<liferay-ui:search-container-column-text name="Designation"
			property="designationId" />

		<liferay-ui:search-container-column-text name="Branch"
			property="branchId" />
 

		 <liferay-ui:search-container-column-text name="Update"
			href="${updateURL}" value="Update">
		</liferay-ui:search-container-column-text>

		<liferay-ui:search-container-column-text name="Delete"
			href="${DeleteURL}" value="Delete">
		</liferay-ui:search-container-column-text> 

	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator />
</liferay-ui:search-container>

<script>
	function clearFilter() {
		var input = document.querySelector('input[name="<portlet:namespace/>customSqlName"]');
		input.value = "";
		document.querySelector('form').submit();
	}
</script>
 