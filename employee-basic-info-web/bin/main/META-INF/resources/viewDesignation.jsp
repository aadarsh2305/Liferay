<%@page import="com.test.serviceBuilder.service.DesignationLocalServiceUtil"%>
<%@page import="com.test.serviceBuilder.model.Designation"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@ include file="init.jsp"%>

<!-- "addEditDesignation is a action command name which is connected with 
                         "AddEditDesignationMVCActionCommand" class  in command package -->

<portlet:renderURL var="addDesignationURL">
	<portlet:param name="action" value="Add" />
</portlet:renderURL>

<button>
	<a href="${addDesignationURL}">Add New Designation</a>
</button>

<h2>View Designation Portlet</h2>

<%
	List<Designation> designationList = DesignationLocalServiceUtil.getDesignations(-1, -1);
%>

<liferay-ui:search-container emptyResultsMessage="there-are-no-designation"
	total="${designationList.size()}" delta="2" deltaConfigurable="true">

      <liferay-ui:search-container-results results="<%= ListUtil.subList(designationList, searchContainer.getStart(),searchContainer.getEnd())%>" />	


	<liferay-ui:search-container-row
		className="com.test.serviceBuilder.model.Designation"
		keyProperty="id" modelVar="currentDesignation">

		 <portlet:renderURL var="updateURL">
			<portlet:param name="action" value="edit" />
			<portlet:param name="id" value="${String.valueOf(currentDesignation.getId())}" />
		</portlet:renderURL>

		 <portlet:actionURL name="deleteDesignation" var="DeleteURL">
			<portlet:param name="deleteid" value="${currentDesignation.id}" />
		</portlet:actionURL> 
		
		<liferay-ui:search-container-column-text name="Id"
			property="id" />

		<liferay-ui:search-container-column-text name="Name"
			property="name" />

		 <liferay-ui:search-container-column-text name="Update"
			href="${updateURL}" value="Update">
		</liferay-ui:search-container-column-text>

		<liferay-ui:search-container-column-text name="Delete"
			href="${DeleteURL}" value="Delete">
		</liferay-ui:search-container-column-text> 

	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator />
</liferay-ui:search-container>