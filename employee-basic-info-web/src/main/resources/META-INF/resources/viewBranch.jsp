 <%@page import="com.liferay.portal.kernel.service.CountryLocalServiceUtil"%>
<%@page import="com.test.serviceBuilder.service.BranchLocalServiceUtil"%>
<%@page import="com.test.serviceBuilder.service.BranchLocalService"%>
<%@page import="com.test.serviceBuilder.model.Branch"%>
<%@ include file="init.jsp"%>

<portlet:renderURL var="addBranchURL">
	<portlet:param name="action" value="Add" />
</portlet:renderURL>
<%-- 
<portlet:actionURL name="addEditBranch" var="addBranchURL">
	<portlet:param name="action" value="Add" />
</portlet:actionURL> --%>

<button>
	<a href="${addBranchURL}">Add New Branch</a>
</button>

<h2>View Branch Portlet</h2>
<%
	List<Branch> branchList = BranchLocalServiceUtil.getBranches(-1, -1);
%>

<liferay-ui:search-container emptyResultsMessage="there-are-no-branch"
	total="${branchList.size()}" delta="2" deltaConfigurable="true">

      <liferay-ui:search-container-results results="<%= ListUtil.subList(branchList, searchContainer.getStart(),searchContainer.getEnd())%>" />	


	<liferay-ui:search-container-row
		className="com.test.serviceBuilder.model.Branch"
		keyProperty="id" modelVar="currentBranch">

		 <portlet:renderURL var="updateURL">
			<portlet:param name="action" value="edit" />
			<portlet:param name="id" value="${String.valueOf(currentBranch.getId())}" />
		</portlet:renderURL>

		 <portlet:actionURL name="deleteBranch" var="DeleteURL">
			<portlet:param name="deleteid" value="${currentBranch.id}" />
		</portlet:actionURL> 
		
			<liferay-ui:search-container-column-text name="Id"
			property="id" />

		  	<liferay-ui:search-container-column-text name="Name"
			property="name" />
			
			<liferay-ui:search-container-column-text name="Home Address"
			property="address1" />
			
			<liferay-ui:search-container-column-text name="Work Address"
			property="address2" />
			
			<liferay-ui:search-container-column-text name="Country"
			property="country" />
			
			<liferay-ui:search-container-column-text name="State"
			property="state" />
			
			<liferay-ui:search-container-column-text name="City"
			property="city" />
			
			<liferay-ui:search-container-column-text name="Pincode"
			property="pincode" />

		 <liferay-ui:search-container-column-text name="Update"
			href="${updateURL}" value="Update">
		</liferay-ui:search-container-column-text>

		<liferay-ui:search-container-column-text name="Delete"
			href="${DeleteURL}" value="Delete">
		</liferay-ui:search-container-column-text> 

	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator />
</liferay-ui:search-container> 