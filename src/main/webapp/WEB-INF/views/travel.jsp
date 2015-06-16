<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="travel">
	<h2>Submit the Data where you want to visit</h2>
	<form:form>
		<form:label path="destination">Destination:</form:label>
		<br>
		<form:input path="destination" />
		<br>
		<form:errors path="destination" cssStyle="color=red"></form:errors>

		<form:label path="dateFrom">From</form:label>
		<br>
		<form:input path="deteFrom" />
		<br>
		<form:errors path="dateFrom"></form:errors>
		<br>
		<form:label path="dateTo">From</form:label>
		<br>
		<form:input path="dateTo" />
		<br>
		<form:errors path="dateTo"></form:errors>
		<br>
		<input type="reset" value="Reset" />&nbsp;&nbsp;
                        <input type="submit" value="Submit" />


	</form:form>

</div>