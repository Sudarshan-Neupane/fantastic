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
	<form:form commandName="user" action="profileUpdate" method="post">
		<label>User Name:</label>
		<form:input path="firstName"  value="${user.firstName}"  />
		<br>
<%-- 		 <label>Gender:</label><form:checkboxes items="${gender}" itemLabel="value" path="profile.gender"/><br> --%>
<!-- 		<label>Date of Birth:</label> -->
<%-- 		<form:input path="profile.dateOfBirth" /> --%>
<!-- 		<br> -->
		<label>Address1:</label>
		<form:input path="profile.address.address1" />
		<br>
		<label>Address2:</label>
		<form:input path="profile.address.address2" />
		<br>
		<label>City:</label>
		<form:input path="profile.address.city" />
		<br>
		<label>StateName:</label>
		<form:input path="profile.address.stateName" />
		<br>
		<label>Zip Code:</label>
		<form:input path="profile.address.zipCode" />
		<br>
		<label>Phone Number:</label>
		<form:input path="profile.phoneNumber" />
		<br>
<!-- 		<label>Interest Filed:</label> -->
<%-- 		<form:checkboxes items="${interestedField}" itemLabel="value" path="profile.category"/><br> --%>
<%-- 		<form:input type="file" path="profile.profileImage"/> --%>
		
		<form:button id="btnUpdate">Update</form:button>
	</form:form>
</body>
</html>