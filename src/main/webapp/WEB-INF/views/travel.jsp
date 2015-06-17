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
        <style type="text/css">
            input[type="text"]{
                width: 250px;
                border: solid 1px #85b1de;
                height: 25px;
                margin: 10px;
            }
            textarea{
                width:250px;
                border: solid 1px #85b1de;
            }
            input[type="submit"]{
                width: 100px;
                background-color: #85b1de;
                border-radius: 5px;
                height: 30px;

            }
            input[type="reset"]{
                width: 100px;
                background-color: #85b1de;
                border-radius: 5px;
                height: 30px;

            }
            .travel{
                width: 600px;
                border: solid 1px #85b1de;
                margin: 0px auto;
                padding: 5px;
            }
            h2{
                color:blue;
                text-transform: capitalize;
                text-align: center;
                
            }
        </style>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
        <script src="//code.jquery.com/jquery-1.10.2.js"></script>
        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
        <script>
            $(function () {
                $("#dateFrom").datepicker();
                $("#dateTo").datepicker();
            });
        </script>
    </head>
    <body>
        <div class="travel">
            <h2>Add your travel details</h2>
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
            </div>
    </body>
</html>
