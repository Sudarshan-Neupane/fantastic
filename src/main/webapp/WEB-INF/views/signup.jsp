<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign Up</title>
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
            <h2>Sign up page</h2>
            <form:form commandName="user">
                <table>
                    <caption>${errors}
                        <form:errors path="*"/></caption>
                    <tr>
                        <td><form:label path="firstName">First Name:<em>*</em> </form:label></td>
                        <td><form:input path="firstName"/></td>
                        <td><form:errors path="firstName"/></td>
                    </tr>
                    <tr>
                        <td><form:label path="middleName">Middle Name: </form:label></td>
                        <td><form:input path="middleName"/></td>
                        <td><form:errors path="middleName"/></td>
                    </tr>
                    <tr>
                        <td><form:label path="lastName">Last Name:<em>*</em> </form:label></td>
                        <td><form:input path="lastName"/></td>
                        <td><form:errors path="lastName"/></td>
                    </tr>
                    <tr>
                        <td><form:label path="userName">Username:<em>*</em> </form:label></td>
                        <td><form:input path="userName"/></td>
                        <td><form:errors path="userName"/></td>
                    </tr>
                    <tr>
                        <td><form:label path="password">Password:<em>*</em> </form:label></td>
                        <td><form:password path="password"/></td>
                        <td><form:errors path="password"/></td>
                    </tr>
                    <tr>
                        <td><form:label path="rePassword">Re Password:<em>*</em> </form:label></td>
                        <td><form:password path="rePassword"/></td>
                        <td><form:errors path="rePassword"/></td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td colspan="2"><input type="reset" value="Reset"/>&nbsp;&nbsp;
                            <input type="submit" value="Submit"/></td>
                    </tr>
                </table>
            </form:form>
        </div>
    
    </body>
</html>
