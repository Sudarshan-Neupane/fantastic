<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Insert title here</title>
    </head>
    <body>

        <h1>Profile Update</h1>
        <div>${errors}</div>
        <form:form commandName="profile" method="post">
            <form:errors path="*"/>
            <form:label path="gender">Gender:</form:label>
            <form:radiobuttons items="${gender}" path="gender"/>
            <br/>
            <form:label path="dateOfBirth">Date of Birth:</form:label> 
            <form:input path="dateOfBirth" /> 
            <br/> 
            <form:label path="address.address1">Address1:</form:label>
            <form:input path="address.address1" />
            <br/>
            <form:label path="address.address2">Address2:</form:label>
            <form:input path="address.address2" />
            <br/>
            <form:label path="address.city">City:</form:label>
            <form:input path="address.city" />
            <br/>
            <form:label path="address.stateName">State Name:</form:label>
            <form:input path="address.stateName" />
            <br/>
            <form:label path="address.zipCode">Zip Code:</form:label>
            <form:input path="address.zipCode" />
            <br/>
            <form:label path="phoneNumber">Phone Number:</form:label>
            <form:input path="phoneNumber" />
            <br/>
            <form:label path="category">Interest Filed:</form:label> 
            <form:checkboxes items="${interestedField}" itemLabel="value" path="category"/><br> 
            <br/>
            <form:button type="submit" id="btnUpdate">Update</form:button>
        </form:form>
    </body>
</html>