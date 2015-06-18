<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="travel">
	<h1>Categories</h1>

	<div class="row">
		<table>
			<tr>
				<td>Category Id</td>
				<td>Category Name</td>
				<td>Status</td>
			</tr>
			<c:forEach items="${categories}" var="category">
				<tr>
					<td>${category.id}</td>
					<td>${category.categoryName}</td>
					<td>${category.categoryStatus}</td>
					<td><a
						href="<c:url value='/sec/admin/category/edit/${category.id}'/>">Edit</a>
					</td>
					<td><a
						href="<c:url value='/sec/admin/category/delete/${category.id}'/>">Delete</a>
					</td>

				</tr>
			</c:forEach>
		</table>
	</div>
	<div>
		<p>
			<a href="<c:url value='/sec/admin/category/add' />">Add Category</a>
	</div>
</div>
