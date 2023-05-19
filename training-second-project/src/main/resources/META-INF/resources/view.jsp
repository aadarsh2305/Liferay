<%@page import="java.util.ArrayList"%>
<%@page import="training.second.project.Employee.Employee"%>
<%@page import="java.awt.List"%>
<%@ include file="/init.jsp"%>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}
</style>
<p>
	<b><liferay-ui:message key="trainingsecondproject.caption" /></b>
<h1>Hello</h1>
</p>
<h2>A basic HTML table</h2>

<table class="table table-bordered">
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Enrollent_No</th>
		<th>Subject</th>
	</tr>
	<%-- <tbody>
		<%
			ArrayList<Employee> emp1 = (ArrayList<Employee>) request.getAttribute("list");
		%>

		<%
			for (Employee user1 : emp1) {
		%>
		<tr>
			<td><%=user1.getId() %></td>
			<td><%=user1.getName() %></td>
			<td><%=user1.getEnrollment_No() %></td>
			<td><%=user1.getSubject() %></td>
		</tr>
		<%
			}
		%>
	</tbody> --%>
	<tbody>
		<c:forEach items="${list}" var="user">
			<tr>
				<td>${user.id}</td>
				<td>${user.name}</td>
				<td>${user.enrollment_No}</td>
				<td>${user.subject}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>