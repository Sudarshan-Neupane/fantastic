<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div class="travel">

	<form:form modelAttribute="newCategory">
		<form:errors path="*" />
		<div>
			<table>
				<tr>
					<td><label for="categoryName"> <spring:message
								code="addCategory.form.categoryName.label" />
					</label>
					<td><form:input id="categoryName" path="categoryName"
							type="text" /> <form:errors path="categoryName" /></td>
				</tr>
				<tr>
					<td><label for="categoryStatus"> <spring:message
								code="addCategory.form.categoryStatus.label" />
					</label>
					<td><form:radiobutton path="categoryStatus" value="1" />Active
						<form:radiobutton path="categoryStatus" value="0" />Inactive <form:errors
							path="categoryStatus" /></td>
				</tr>
				<tr>
					<td colspan=2 align="center"><input type="submit" id="btnAdd"
						value="Add" /></td>
				</tr>
			</table>
		</div>
	</form:form>
</div>
