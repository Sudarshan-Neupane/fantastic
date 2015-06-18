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
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
        <script src="//code.jquery.com/jquery-1.10.2.js"></script>
        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
        <script>
            $(function () {
                $("#dateFrom").datepicker();
                $("#dateTo").datepicker();
            });
        </script>
        <link rel="stylesheet" type="text/css" href="resources/css/style.css"/>
    </head>
    <body>
        <div class="wrapper">

            <div class="logo"></div>
            <div class="menu">
                <div class="slogan"> Fantastic4 Connecting People
                </div>
            </div>
            <hr/>
            <div class="travel">
                <h2>Add your travel details</h2>
                <form:form modelAttribute="travel">
                    <form:label path="destination" cssClass="leftfloat">Destination:</form:label>
                    <form:input path="destination"  />
                    <form:errors path="destination" cssStyle="color:red"/><br/>

                    <form:label path="dateFrom" cssClass="leftfloat">From</form:label>
                    <form:input path="dateFrom" />
                    <form:errors path="dateFrom"/><br/>

                    <form:label path="dateTo" cssClass="leftfloat">To</form:label>
                    <form:input path="dateTo" />
                    <form:errors path="dateTo"/><br/>

                    <form:label path="description" cssClass="leftfloat">Description</form:label>
                    <form:textarea path="description" cols="25" rows="5"/>
                    <form:errors path="description"/><br/>
                    <br/>
                    <input type="reset" value="Reset" />&nbsp;&nbsp;
                    <input type="submit" value="Submit" />


                </form:form>
            </div>
        </div>
    </body>
</html>
