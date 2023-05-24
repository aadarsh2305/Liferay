<%@page import="com.test.serviceBuilder.service.DepartmentLocalServiceUtil"%>
<%@page import="com.test.serviceBuilder.model.Department"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="init.jsp"%>

<%-- <portlet:renderURL var="addDepartmentURL">
	<portlet:param name="mvcPath" value="/addDepartment.jsp" />
</portlet:renderURL> --%>

<portlet:renderURL var="addDepartmentURL">
	<portlet:param name="action" value="Add" />
</portlet:renderURL>

<button>
	<a href="${addDepartmentURL}">Add New Department</a>
</button>
<h2>View Department Portlet</h2>

<%
	List<Department> departmentList = DepartmentLocalServiceUtil.getDepartments(-1, -1);
%>

<liferay-ui:search-container emptyResultsMessage="there-are-no-department"
	total="${departmentList.size()}" delta="2" deltaConfigurable="true">

      <liferay-ui:search-container-results results="<%= ListUtil.subList(departmentList, searchContainer.getStart(),searchContainer.getEnd())%>" />	


	<liferay-ui:search-container-row
		className="com.test.serviceBuilder.model.Department"
		keyProperty="id" modelVar="currentDepartment">

		 <portlet:renderURL var="updateURL">
			<portlet:param name="action" value="edit" />
			<portlet:param name="id" value="${String.valueOf(currentDepartment.getId())}" />
		</portlet:renderURL> 

		 <portlet:actionURL name="deleteDepartment" var="DeleteURL">
			<portlet:param name="deleteid" value="${currentDepartment.id}" />
		</portlet:actionURL> 
		
		<liferay-ui:search-container-column-text name="Id"
			property="id" />

		<liferay-ui:search-container-column-text name="Name"
			property="name" />
			
		<liferay-ui:search-container-column-text name="Head"
			property="head" />

		 <liferay-ui:search-container-column-text name="Update"
			href="${updateURL}" value="Update">
		</liferay-ui:search-container-column-text>

		<liferay-ui:search-container-column-text name="Delete"
			href="${DeleteURL}" value="Delete">
		</liferay-ui:search-container-column-text> 

	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator />
</liferay-ui:search-container>