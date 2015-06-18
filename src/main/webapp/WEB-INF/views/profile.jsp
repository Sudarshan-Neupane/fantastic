<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style type="text/css">
    input[type="text"].area{
        width: 30px;
    }
    input[type="text"].prefix{
        width: 30px;
    }
    input[type="text"].number{
        width: 40px;
    }
</style>
<div class="travel">
    <h2>Profile Update</h2>
    <c:if test="${user.firstLogin}">
        <p class="error">Please update your profile and proceed.</p>
        <br/>
    </c:if>
    <label for="userName"> Full Name: </label> <label> ${user.firstName} ${user.middleName} ${user.lastName}</label>
    <br/>
    <label for="userName"> User Name: </label> <label> ${user.userName} </label>
    <br/>
    <br>
    <div class="error">${errors}</div>
    <div class="profileForm">
        <form:form commandName="profile" method="post">
            <div class="radiobutton">
                <form:label path="gender" cssClass="leftfloat">Gender:</form:label>
                <form:radiobuttons items="${gender}" path="gender" cssClass="radiobtns"/>
                <form:errors path="gender"/>
            </div>
            <br/>
            <form:label path="dateOfBirth" cssClass="leftfloat">Date of Birth:</form:label> 
            <form:input path="dateOfBirth" /> 
            <form:errors path="dateOfBirth"/>
            <br/> 
            <form:label path="address.address1" cssClass="leftfloat">Address1:</form:label>
            <form:input path="address.address1" />
            <form:errors path="address.address1"/>
            <br/>
            <form:label path="address.address2" cssClass="leftfloat">Address2:</form:label>
            <form:input path="address.address2" />
            <form:errors path="address.address2"/>
            <br/>
            <form:label path="address.city" cssClass="leftfloat">City:</form:label>
            <form:input path="address.city" />
            <form:errors path="address.city"/>
            <br/>
            <form:label path="address.stateName" cssClass="leftfloat">State Name:</form:label>
            <form:input path="address.stateName" />
            <form:errors path="address.stateName"/>
            <br/>
            <form:label path="address.zipCode" cssClass="leftfloat">Zip Code:</form:label>
            <form:input path="address.zipCode" />
            <form:errors path="address.zipCode"/>
            <br/>
            <form:label path="phone" cssClass="leftfloat">Phone Number:</form:label>
            <form:input path="phone.area" size="3" maxlength="3" cssClass="area" />-<form:input path="phone.prefixValue" size="3" maxlength="3" cssClass="prefix" />-<form:input path="phone.number" size="4" maxlength="4" cssClass="number" />
            <form:errors path="phone"/>
            <br/>
            <br/>
            <div class="radiobutton">
                <form:label path="category" cssClass="leftfloat">Interest Filed:</form:label> 
                <form:checkboxes items="${interestedField}" itemLabel="value" path="category" cssClass="radiobtns"/>
                <form:errors path="category"/> 
            </div>
            <br/>
            <form:button type="submit" id="btnUpdate">Update</form:button>
            <form:button type="reset">Reset</form:button>
        </form:form>
    </div>
    <div class="prfileImage">
        <img src='<spring:url value="/resources/images/${image}"/>'height="200" width="250"/>
        <form action="profile/image/upload" enctype="multipart/form-data" method="POST">
            <input type="file" name="imageFile"/>
            <input type="submit" value="Upload"/>
        </form>
    </div>
    <div class="clear"></div>
</div>