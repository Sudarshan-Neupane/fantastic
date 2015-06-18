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
            /*            body{
                            margin: 0px auto;
                            width: 600px;
                        }
                      tr:nth-child(odd){ background-color:#eee; }
                      .travelContainer{
                          width: 960px;
                          margin:0px auto;
                      }
                      .userProfile{ 
                          
                      }*/
        </style>
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
            <div class="travelContainer">
                <h2>My Travel Posts</h2>

                <div class="mytravel">
                    <div class="profileimage">
                        <img src="<c:url value="resources/images/no_pic.jpg"/>" alt="user images"/>
                        <!--<img src="../../resources/images/no_pic.jpg" alt="User Image"/>-->
                    </div>
                    <div class="travelDetails">
                        fdfsdf
                    </div>
                </div>

                <div class="travelOtherPost">
                    <h3>Peoples who want to travel</h3>
                    <c:forEach items="${travellist}" var="lists">
                        <div class="prof">
                            <img src='<c:url value="resources/images/no-user-image.gif"/>' alt="friends">
                            <br>
                            Royan
                        </div>
                        <div class="details">
                            <b>${lists.destination}</b>
                            <br/>
                            <em> ${lists.dateFrom} </em> To <em> ${lists.dateTo} </em>
                            <br>
                            ${lists.description}<br>
                            <a href="#"> Connect </a> <a href="#"> Details </a>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </div>    
    </body>
</html>
