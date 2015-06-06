<%-- 
    Document   : signup
    Created on : Jun 6, 2015, 12:10:28 PM
    Author     : bipin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign Up</title>
    </head>
    <body>
        <h1>Sign up page</h1>
        <form:form commandName="user">
            <table>
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
                    <td><form:input path="password"/></td>
                    <td><form:errors path="password"/></td>
                </tr>
                <tr>
                    <td><form:label path="mobile">Mobile:<em>*</em> </form:label></td>
                    <td><form:input path="mobile"/></td>
                    <td><form:errors path="mobile"/></td>
                </tr>
                <tr>
                    <td><form:label path="address1">Address1:<em>*</em> </form:label></td>
                    <td><form:input path="address1"/></td>
                    <td><form:errors path="address1"/></td>
                </tr>
                <tr>
                    <td><form:label path="address2">Address2: </form:label></td>
                    <td><form:input path="address2"/></td>
                    <td><form:errors path="address2"/></td>
                </tr>
                <tr>
                    <td><form:label path="city">City:<em>*</em> </form:label></td>
                    <td><form:input path="city"/></td>
                    <td><form:errors path="city"/></td>
                </tr>
                <tr>
                    <td><form:label path="state">State:<em>*</em> </form:label></td>
                    <td><form:input path="state"/></td>
                    <td><form:errors path="state"/></td>
                </tr>
                <tr>
                    <td><form:label path="zipCode">Zip code:<em>*</em> </form:label></td>
                    <td><form:input path="zipCode"/></td>
                    <td><form:errors path="zipCode"/></td>
                </tr>
                <tr>
                    <td><form:label path="country">Country:<em>*</em> </form:label></td>
                    <td><form:input path="country"/></td>
                    <td><form:errors path="country"/></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td colspan="2"><input type="reset" value="Reset"/>&nbsp;&nbsp;
                        <input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>
