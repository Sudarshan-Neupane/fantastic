<%-- 
    Document   : travelList
    Created on : Jun 16, 2015, 2:13:19 PM
    Author     : sudarshan
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display lists</title>
        <style>
            body{
                margin: 0px auto;
                width: 600px;
            }
          tr:nth-child(odd){ background-color:#eee; }
        </style>
    </head>
    <body>
        <h1>Travel lists</h1>
        <table>
            <tr> <td>Id </td><td>Username</td><td>Destination</td><td>Date From</td> <td>Date To</td>
                <td>Destination</td>
            </tr> 
            <c:forEach items="${travellist}" var="lists">
                <tr>
                    <td>${lists.id}</td>
                    <td> User AA</td>
                    <td>${lists.destination} </td>
                    <td> ${lists.dateFrom} </td>
                    <td> ${lists.dateTo} </td>
                    <td>${lists.description}</td>
                </tr>
            </c:forEach>
                
        </table>
    </body>
</html>
