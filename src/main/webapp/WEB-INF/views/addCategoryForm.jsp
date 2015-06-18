<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Add new Category</title>
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
            <form:form modelAttribute="newCategory">
                <form:errors path="*" />
                <div>
                    <table>
                        <tr>
                            <td><label for="categoryName"> 
                                    <spring:message code="addCategory.form.categoryName.label" />
                                </label>
                            <td><form:input id="categoryName" path="categoryName" type="text" /> 
                                <form:errors path="categoryName" /></td>
                        </tr>
                        <tr>
                            <td><label for="categoryStatus">
                                    <spring:message code="addCategory.form.categoryStatus.label" />
                                </label>
                            <td>
                                <form:radiobutton path="categoryStatus" value="1" />Active
                                <form:radiobutton path="categoryStatus" value="0" />Inactive 
                                <form:errors path="categoryStatus" /></td>
                        </tr>
                        <tr>
                            <td colspan=2 align="center"><input type="submit" id="btnAdd" value="Add" /></td>
                        </tr>
                    </table>
                </div>
            </form:form>
        </div>
    </body>
</html>