<%-- 
    Document   : travel
    Created on : Jun 16, 2015, 12:44:55 PM
    Author     : sudarshan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
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
        <spring:url value="/resources/css/style.css" var="mainCss" />
        <link href="${mainCss}" rel="stylesheet" />
    </head>
