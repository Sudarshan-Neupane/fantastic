<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Dating</h1>
        <form:form modelAttribute="dating">
            <label>Interested On</label>
            <select id="interestedOn" name="interestedOn">
                <option value="M">Male</option>
                <option value="F">Female</option>
                <option value="O">Others</option>
            </select>
<!--            <input type="text" id="user" name="user" >-->
            <input type="submit"  value="Submit" />
        </form:form>
    </body>
</html>
