<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="false"%>
<html>
    <head>
        <title>Login</title>
        <link rel="stylesheet" type="text/css" href="resources/css/style.css"/>
    </head>
    <body>
        <div class="wrapper">

            <div class="logo"><img src='<spring:url value="/resources/images/logo.png"/>' height="160"/></div>
            <div class="menu">
                <div class="slogan"> Connecting People
                </div>
            </div>
            <div class="clear"></div>
            <hr/>
            <div class="login">
                <h2 class="form-signin-heading">Login Page</h2>
                ${msg}
                <c:if test="${not empty error}">
                    <div class="error">Invalid Username of Password</div>
                </c:if>
                <form method="POST"
                      action='<spring:url value="/j_spring_security_check"></spring:url>'>

                          <div class="form-group">
                              <label for="username">UserName:</label> <input type="text"
                                                                             id="j_username" name="j_username" placeholder="username">
                          </div>
                          <div class="form-group">
                              <label for="pwd">Password:</label> <input type="password"
                                                                        id="j_password" name="j_password" placeholder="password">
                          </div>
                          <input type="submit" value="Login" /> <input type="reset"
                                                                       value="Reset" />
                      </form>
                </div>

                <div class="loginLeft"></div>
                <div class="signin">
                    <a href='<spring:url value="/signup"></spring:url>' class="loginbtn"><button>Create new Account</button></a>

            </div>
            <div class="clear"></div>
            <hr/>
            <div class="footer">
                &copy; Fantastic group 2015
            </div>
        </div>
    </body>
</html>
