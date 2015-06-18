<%-- 
    Document   : baseLayout
    Created on : Jun 7, 2015, 10:06:17 PM
    Author     : bipin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><tiles:insertAttribute name="title"/></title>
    </head>
    <body>
        <header>
            <tiles:insertAttribute name="header"/>
            <tiles:insertAttribute name="subHeader"/>
        </header>
        <nav><tiles:insertAttribute name="menu"/></nav>
        <section><tiles:insertAttribute name="body"/></section>
        <footer><tiles:insertAttribute name="footer"/></footer>
    </body>
</html>
