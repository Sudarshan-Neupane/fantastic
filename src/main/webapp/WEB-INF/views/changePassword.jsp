<%-- 
    Document   : changePassword
    Created on : Jun 18, 2015, 4:15:00 AM
    Author     : bipin
--%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="travel">
    <div class="error">${error}</div>
    <div class="msg">${msg}</div>
    <form:form modelAttribute="changePassword" method="post">
        <form:label path="oldPassword" cssClass="leftfloat">Old Password:*</form:label>
        <form:password path="oldPassword"/>
        <form:errors path="oldPassword" cssClass="error"/>
        <br/>
        <form:label path="newPassword" cssClass="leftfloat">New Password:*</form:label>
        <form:password path="newPassword"/>
        <form:errors path="newPassword" cssClass="error"/>
        <br/>
        <form:label path="reNewPassword" cssClass="leftfloat">Re Password:*</form:label>
        <form:password path="reNewPassword"/>
        <form:errors path="reNewPassword" cssClass="error"/>
        <br/>
        <form:button type="submit">Submit</form:button>
        <form:button type="reset">Reset</form:button>
    </form:form>
</div>
