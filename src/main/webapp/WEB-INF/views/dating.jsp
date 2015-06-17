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
            <form:label path="interestedOn">Interested On</form:label>
            <form:select path="interestedOn">
                <form:option value="-" selected="selected">Select gender</form:option>
                <form:options items="${gender}"/>
            </form:select>
            <form:errors path="interestedOn" /><br/>
            
            <form:label path="interestedAge">Interested Age</form:label>
            <form:select path="interestedAge">
                <form:option value="-" selected="selected">Select Interested Age</form:option>
                <form:options items="${ageGroup}"/>
            </form:select>
            <form:errors path="interestedAge" /><br/>
            
            <form:label path="description">Description</form:label>
            <form:textarea path="description"/>
            <form:errors path="description" /><br/>
            <input type="submit"  value="Submit" />
        </form:form>
    </body>
</html>
