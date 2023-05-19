<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="init.jsp" %>
 
 <p>
	<b><liferay-ui:message key="MyCustomLoginPortlet.caption"/></b>
</p>

<c:choose>
    <c:when test="<%= themeDisplay.isSignedIn() %>">

        <%
         
        String signedInAs = HtmlUtil.escape(user.getFullName());

        if (themeDisplay.isShowMyAccountIcon() && (themeDisplay.getURLMyAccount() != null)) {
            String myAccountURL = String.valueOf(themeDisplay.getURLMyAccount());

            signedInAs = "<a class=\"signed-in\" href=\"" + HtmlUtil.escape(myAccountURL) + "\">" + signedInAs + "</a>";
        }
        %>

        <liferay-ui:message arguments="<%= signedInAs %>" key="you-are-signed-in-as-x" translateArguments="<%= false %>" />
    </c:when>
    <c:otherwise>
    
        <%
        String redirect = ParamUtil.getString(request, "redirect");
        %>
    
        
         
       <portlet:actionURL name="customLoginAction" var="loginURL"></portlet:actionURL>
    
        <aui:form action="${loginURL}" autocomplete='on' cssClass="sign-in-form1" method="post" name="loginForm1">
     
            <aui:input name="saveLastPath" type="hidden" value="<%= false %>" />
            <aui:input name="redirect" type="hidden" value="<%= redirect %>" />
                    
            <aui:input autoFocus="true" cssClass="clearable" label="email-address" name="login" showRequiredLabel="<%= false %>" type="text" value="">
                <aui:validator name="required" />
            </aui:input>

            <aui:input name="password" showRequiredLabel="<%= false %>" type="password">
                <aui:validator name="required" />
            </aui:input>
            
            <aui:button-row>
                <aui:button cssClass="btn-lg" type="submit" value="sign-in" />
            </aui:button-row>
                
        </aui:form>
    </c:otherwise>
</c:choose>