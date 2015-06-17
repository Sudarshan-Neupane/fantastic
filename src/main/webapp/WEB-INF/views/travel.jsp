<%-- 
    Document   : travel
    Created on : Jun 16, 2015, 12:44:55 PM
    Author     : sudarshan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form:form modelAttribute="travel">
            <form:label path="destination">Destination:</form:label>
            <form:input path="destination"  />
            <form:errors path="destination" cssStyle="color:red"/><br/>

            <form:label path="dateFrom">From</form:label>
            <form:input path="dateFrom" />
            <form:errors path="dateFrom"/><br/>
            
            <form:label path="dateTo">To</form:label>
            <form:input path="dateTo" />
            <form:errors path="dateTo"/><br/>
            
            <form:label path="description">Description</form:label>
            <form:textarea path="description" cols="25" rows="5"/>
            <form:errors path="description"/><br/>
                <br/>
                <input type="reset" value="Reset" />&nbsp;&nbsp;
                <input type="submit" value="Submit" />


        </form:form>
    </body>
</html>
