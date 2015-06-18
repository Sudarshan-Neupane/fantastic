<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<nav>
    <div class="menuLink">
        <a href='<spring:url value="/sec/home"/>'>Home </a> 
        | <a href='<spring:url value="/sec/profile"/>'>Profile </a> 
        | <a href='<spring:url value="/sec/password"/>'>Change Password</a>
        | <a href='<spring:url value="/logout"/>'>Logout </a>
    </div>
</nav>
<!--<hr/>-->
<div class="clear"></div>