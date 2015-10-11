<%-- 
    Document   : categories
    Created on : Jun 17, 2015, 7:52:45 PM
    Author     : bipin
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="travel">
    <form:form modelAttribute="category" method="post">
        <form:select items="${categories}" path="category" ></form:select>
        <form:button type="submit">Submit</form:button>
    </form:form>
</div>