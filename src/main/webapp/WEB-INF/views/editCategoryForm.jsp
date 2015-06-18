<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:url var="editCategory" value="category/add"></c:url>
<div class="travel">
	<form:form modelAttribute="category">
		<table>
			<tr>
				<td><form:label path="id">
						<spring:message text="ID" />
					</form:label></td>
				<td><form:input path="id" readonly="true" size="8"
						disabled="true" /> <form:hidden path="id" /></td>
			</tr>

			<tr>
				<td><form:label path="categoryName">
						<spring:message text="categoryName" />
					</form:label></td>
				<td><form:input path="categoryName" /></td>
			</tr>
			<tr>
				<td><form:label path="categoryStatus">
						<spring:message text="categoryStatus" />
					</form:label></td>
				<td><form:input path="categoryStatus" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit"
					value="<spring:message text="Edit Category"/>" /></td>
			</tr>
		</table>
	</form:form>
</div>