<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <spring:url value="/resources/css/style.css" var="mainCss" />
        <link href="${mainCss}" rel="stylesheet" />
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
                <h2>Dating</h2>
                <form:form modelAttribute="dating">
                    <form:label path="interestedOn" cssClass="leftfloat">Interested On</form:label>
                    <form:select path="interestedOn">
                        <form:option value="-" selected="selected">Select gender</form:option>
                        <form:options items="${gender}"/>
                    </form:select>
                    <form:errors path="interestedOn" cssClass="error"/><br/>

                    <form:label path="interestedAge" cssClass="leftfloat">Interested Age</form:label>
                    <form:select path="interestedAge">
                        <form:option value="-" selected="selected">Select Interested Age</form:option>
                        <form:options items="${ageGroup}"/>
                    </form:select>
                    <form:errors path="interestedAge" cssClass="error"/><br/>
                    <br>
                    <form:label path="description" cssClass="leftfloat">Description</form:label>
                    <form:textarea path="description"/>
                    <form:errors path="description" cssClass="error" /><br/>
                    <input type="submit"  value="Submit" />
                </form:form>
            </div>
        </div>
    </body>
</html>
